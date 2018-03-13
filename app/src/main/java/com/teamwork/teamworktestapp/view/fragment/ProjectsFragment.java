package com.teamwork.teamworktestapp.view.fragment;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.teamwork.teamworktestapp.App;
import com.teamwork.teamworktestapp.R;
import com.teamwork.teamworktestapp.data.DataManager;
import com.teamwork.teamworktestapp.databinding.FragmentProjectsBinding;
import com.teamwork.teamworktestapp.models.projects.Project;
import com.teamwork.teamworktestapp.models.projects.Projects;
import com.teamwork.teamworktestapp.util.DataUtil;
import com.teamwork.teamworktestapp.view.adapter.ProjectsAdapter;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;

public class ProjectsFragment extends Fragment implements SwipeRefreshLayout.OnRefreshListener {

    private DataManager mDataManager;
    private ProjectsAdapter mProjectsAdapter;
    private CompositeDisposable compositeDisposable;
    private List<Project> mProjects;
    private FragmentProjectsBinding binding;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        compositeDisposable = new CompositeDisposable();
        mProjects = new ArrayList<>();
        mDataManager = App.get(getActivity()).getComponent().getDataManager();
        mProjectsAdapter = new ProjectsAdapter(getActivity());
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_projects, container, false);
        View fragmentView = binding.getRoot();
        binding.swipeContainer.setOnRefreshListener(this);
        binding.swipeContainer.setColorSchemeResources(R.color.hn_orange);
        binding.layoutOffline.buttonTryAgain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadProjectsIfNetworkConnected();
            }
        });
        setupToolbar();
        setupRecyclerView();
        if (mProjects.isEmpty()) {
            loadProjectsIfNetworkConnected();
        }
        return fragmentView;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        compositeDisposable.dispose();
        binding.unbind();
    }

    @Override
    public void onRefresh() {
        showHideRefreshRecover();
        if (mProjectsAdapter != null) mProjectsAdapter.setItems(new ArrayList<>());
        getProjects();
    }

    private void setupToolbar() {
        assert getActivity() != null;
        ((AppCompatActivity) getActivity()).setSupportActionBar(binding.toolbar);
        ActionBar actionBar = ((AppCompatActivity) getActivity()).getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayShowTitleEnabled(true);
            binding.toolbar.setLogo(R.mipmap.ic_launcher_foreground);
        }
    }

    private void setupRecyclerView() {
        binding.recyclerProjects.setLayoutManager(new LinearLayoutManager(getActivity()));
        binding.recyclerProjects.setHasFixedSize(true);
        mProjectsAdapter.setItems(mProjects);
        binding.recyclerProjects.setAdapter(mProjectsAdapter);
    }

    private void loadProjectsIfNetworkConnected() {
        if (DataUtil.isNetworkAvailable(getActivity())) {
            showHideOfflineLayout(false);
            getProjects();
        } else {
            hideLoadingViews();
            showHideOfflineLayout(true);
        }
    }

    private void getProjects() {
        compositeDisposable.add(mDataManager.getAllUserProjects()
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(mDataManager.getScheduler())
                .subscribe(this::okResult, this::handleError)
        );
    }

    private void okResult(Projects projects) {
        hideLoadingViews();
        List<Project> items = projects.getProjects();
        mProjectsAdapter.setItems(items);
    }

    private void handleError(Throwable throwable) {
        //hideLoadingViews();
        showHideOfflineLayout(true);
    }

    private void hideLoadingViews() {
        binding.progressIndicator.setVisibility(View.GONE);
        binding.swipeContainer.setRefreshing(false);
    }

    private void showHideOfflineLayout(boolean isOffline) {
        binding.layoutOffline.layoutOffline.setVisibility(isOffline ? View.VISIBLE : View.GONE);
        binding.recyclerProjects.setVisibility(isOffline ? View.GONE : View.VISIBLE);
        binding.progressIndicator.setVisibility(isOffline ? View.GONE : View.VISIBLE);
        binding.swipeContainer.setRefreshing(false);
    }

    private void showHideRefreshRecover() {
        binding.swipeContainer.setRefreshing(true);
        binding.layoutOffline.layoutOffline.setVisibility(View.GONE);
        binding.recyclerProjects.setVisibility(View.VISIBLE);
    }

}

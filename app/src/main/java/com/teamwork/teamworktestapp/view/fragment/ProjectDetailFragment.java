package com.teamwork.teamworktestapp.view.fragment;


import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.teamwork.teamworktestapp.App;
import com.teamwork.teamworktestapp.R;
import com.teamwork.teamworktestapp.data.DataManager;
import com.teamwork.teamworktestapp.databinding.FragmentProjectDetailBinding;
import com.teamwork.teamworktestapp.models.projectdetails.Project;
import com.teamwork.teamworktestapp.util.DataUtil;
import com.teamwork.teamworktestapp.viewModel.ProjectDetailViewModel;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;


public class ProjectDetailFragment extends Fragment {

    private static final String PROJECT_ID = null;
    private String id;
    private FragmentProjectDetailBinding binding;
    private Project mProject;
    private CompositeDisposable compositeDisposable;
    private DataManager mDataManager;

    public ProjectDetailFragment() {
        // Required empty public constructor
    }

    public static ProjectDetailFragment newInstance(String param1) {
        ProjectDetailFragment fragment = new ProjectDetailFragment();
        Bundle args = new Bundle();
        args.putString(PROJECT_ID, param1);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRetainInstance(true);
        if (getArguments() != null) {
            id = getArguments().getString(PROJECT_ID);
        }
        compositeDisposable = new CompositeDisposable();
        mDataManager = App.get(getActivity()).getComponent().getDataManager();

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_project_detail, container, false);
        View view = binding.getRoot();
        binding.layoutOffline.buttonTryAgain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadProjectIfNetworkConnected(id);
            }
        });

        setupToolbar();
        if (mProject == null) {
            loadProjectIfNetworkConnected(id);
        }

        return view;
    }

    private void loadProjectIfNetworkConnected(String id) {
        if (DataUtil.isNetworkAvailable(getActivity())) {
            showHideOfflineLayout(false);
            compositeDisposable.add(mDataManager.getProjectById(id)
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribeOn(mDataManager.getScheduler())
                    .subscribe(this::okResult, this::handleError)
            );
        } else {
            hideLoadingViews();
            showHideOfflineLayout(true);
        }
    }

    private void okResult(Project project) {
        hideLoadingViews();
        mProject = project.getProject();
        binding.setDetailsViewModel(new ProjectDetailViewModel(getActivity(), mProject));
        binding.toolbar2.setTitle(mProject.getName());

    }

    private void handleError(Throwable throwable) {

        showHideOfflineLayout(true);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        compositeDisposable.dispose();
        binding.unbind();
        mProject = null;
    }

    private void setupToolbar() {
        assert getActivity() != null;
        ((AppCompatActivity) getActivity()).setSupportActionBar(binding.toolbar2);
        ActionBar actionBar = ((AppCompatActivity) getActivity()).getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayShowTitleEnabled(true);
            actionBar.setDisplayHomeAsUpEnabled(true);
            binding.toolbar2.setNavigationOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    getActivity().getSupportFragmentManager()
                            .popBackStack();
                }
            });
        }
    }

    private void hideLoadingViews() {
        binding.progressIndicator.setVisibility(View.GONE);
        binding.constraintViewDetails.setVisibility(View.VISIBLE);
        binding.layoutOffline.layoutOffline.setVisibility(View.GONE);
    }

    private void showHideOfflineLayout(boolean isOffline) {
        binding.layoutOffline.layoutOffline.setVisibility(isOffline ? View.VISIBLE : View.GONE);
        binding.progressIndicator.setVisibility(isOffline ? View.GONE : View.VISIBLE);
       // binding.constraintViewDetails.setVisibility(isOffline ? View.GONE : View.VISIBLE);
    }

}

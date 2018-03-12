package com.teamwork.teamworktestapp.view.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.databinding.DataBindingUtil;


import android.view.LayoutInflater;

import android.view.ViewGroup;

import com.teamwork.teamworktestapp.R;
import com.teamwork.teamworktestapp.databinding.ItemProjectBinding;
import com.teamwork.teamworktestapp.models.projects.Project;
import com.teamwork.teamworktestapp.viewModel.ProjectsItemViewModel;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by martin on 08/03/18.
 */

public class ProjectsAdapter extends RecyclerView.Adapter<ProjectsAdapter.BindingHolder> {
    private List<Project> mProjects;
    private Context mContext;

    public ProjectsAdapter(Context context) {
        mContext = context;
        mProjects = new ArrayList<>();
    }

    public void setItems(List<Project> items) {
        this.mProjects = items;
        notifyDataSetChanged();
    }

    @Override
    public ProjectsAdapter.BindingHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        ItemProjectBinding projectBinding = DataBindingUtil.inflate(
                LayoutInflater.from(parent.getContext()),
                R.layout.item_project,
                parent,
                false);
        return new BindingHolder(projectBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull ProjectsAdapter.BindingHolder holder, int position) {
        ItemProjectBinding projectBinding = holder.binding;
        projectBinding.setViewModel(new ProjectsItemViewModel(mContext, mProjects.get(position)));
    }

    @Override
    public int getItemCount() {
        return mProjects.size();
    }

    public static class BindingHolder extends RecyclerView.ViewHolder {
        private ItemProjectBinding binding;

        public BindingHolder(ItemProjectBinding binding) {
            super(binding.cardView);
            this.binding = binding;
        }

    }

}

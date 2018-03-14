package com.teamwork.teamworktestapp.viewModel;

import android.content.Context;
import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;

import com.teamwork.teamworktestapp.R;
import com.teamwork.teamworktestapp.models.projects.Project;
import com.teamwork.teamworktestapp.view.fragment.ProjectDetailFragment;


/**
 * Created by martin on 09/03/18.
 */

public class ProjectsItemViewModel extends BaseObservable {

    private Context mContext;
    private Project mProject;

    public ProjectsItemViewModel(Context context, Project project) {
        this.mContext = context;
        this.mProject = project;
    }

    public View.OnClickListener onClickProject() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                launchProjectDetail(mProject);
            }
        };
    }

    public String getName() {
        return mProject.getName();
    }

    public Boolean getStarred() {
        return mProject.getStarred();
    }

    public String getStatus() {
        return mProject.getStatus();
    }

    public String getSubStatus() {
        return mProject.getSubStatus();
    }
    //it needs format conversion
    public String getCreatedOn() {
        return mProject.getCreatedOn();
    }

    private void launchProjectDetail(Project project) {
        FragmentManager fm = ((FragmentActivity) mContext).getSupportFragmentManager();
        ProjectDetailFragment projectDetailFragment = ProjectDetailFragment.newInstance(project.getId());

        fm.beginTransaction()
                .add(R.id.content_frame, projectDetailFragment, "DetailFragment")
                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                .addToBackStack("DetailFragment")
                .commit();
    }
}

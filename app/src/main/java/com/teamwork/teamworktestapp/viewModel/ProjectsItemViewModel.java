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

    @Bindable
    private int color;

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

/*
Hmmm...Android Databinding cannot manage hexadecimal colors directly, only manages specific
int resources or drawables, so you cannot work with dynamic hexa colors without doing some nasty conversion.

https://stackoverflow.com/questions/32992211/use-databinding-library-to-set-background-color-resource-or-null/33065020

    public int getColors() {
        String colorstring = mProject.getCategory().getColor();

        if (colorstring.equals("")){
            color = Color.parseColor("#000000");
        }else{
            color = Color.parseColor(colorstring);
        }
        Log.v("Color", String.valueOf(color));
        return color;
    } */

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

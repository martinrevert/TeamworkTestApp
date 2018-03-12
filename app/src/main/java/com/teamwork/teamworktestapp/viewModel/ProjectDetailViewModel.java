package com.teamwork.teamworktestapp.viewModel;

import android.content.Context;
import android.databinding.BaseObservable;
import android.databinding.BindingAdapter;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;
import com.teamwork.teamworktestapp.R;
import com.teamwork.teamworktestapp.models.projectdetails.Project;

/**
 * Created by martin on 11/03/18.
 */

public class ProjectDetailViewModel extends BaseObservable {

    private Context mContext;
    private Project mProject;

    public ProjectDetailViewModel(Context context, Project project) {
        this.mContext = context;
        this.mProject = project;
    }

    public String getId() {
        return mProject.getId();
    }

    public String getDescription() {
        return mProject.getDescription();
    }

    public String getImageUrl() {
        return mProject.getLogo();
    }

    @BindingAdapter({"imageUrl", "picasso"})
    public static void setImageUrl(ImageView view, String url, Picasso picasso) {

        if (url == null || url.isEmpty())
            url = "R.drawable.ic_assignment_ind_black_24dp.xml";

        picasso.with(view.getContext())
                .load(url)
                .resize(128, 128)
                .placeholder(R.drawable.ic_assignment_ind_black_24dp)
                .error(R.drawable.ic_assignment_ind_black_24dp)
                .centerCrop()
                .into(view);
    }

    //it needs format conversion
    public String getCreatedOn() {
        return mProject.getCreatedOn();
    }

    //it needs format conversion
    public String getStartDate() {
        return mProject.getStartDate();
    }

    //it needs format conversion
    public String getEndDate() {
        return mProject.getEndDate();
    }

}

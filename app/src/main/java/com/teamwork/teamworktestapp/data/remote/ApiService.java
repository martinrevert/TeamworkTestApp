package com.teamwork.teamworktestapp.data.remote;

import com.teamwork.teamworktestapp.models.projectdetails.Project;
import com.teamwork.teamworktestapp.models.projects.Projects;


import java.util.List;

import io.reactivex.Observable;

import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by martin on 07/03/18.
 */

public interface ApiService {

    @GET("projects.json")
    //Observable<Projects> getAllProjects();
    Observable<Projects> getAllProjects(@Query("status") String status);


    @GET("projects/{id}.json")
    Observable<com.teamwork.teamworktestapp.models.projectdetails.Project> getProjectById(@Path("id") String id);

}

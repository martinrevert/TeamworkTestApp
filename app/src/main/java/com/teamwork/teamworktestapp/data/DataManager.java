package com.teamwork.teamworktestapp.data;

/**
 * Created by martin on 08/03/18.
 */

import android.content.Context;

import com.teamwork.teamworktestapp.App;
import com.teamwork.teamworktestapp.data.remote.ApiService;
import com.teamwork.teamworktestapp.di.modules.DataManagerModule;
import com.teamwork.teamworktestapp.di.components.DaggerDataManagerComponent;
import com.teamwork.teamworktestapp.models.projects.Projects;

import javax.inject.Inject;

import io.reactivex.Observable;
import io.reactivex.Scheduler;

public class DataManager {

    @Inject
    protected ApiService mApiService;
    @Inject
    protected Scheduler mSubscribeScheduler;

    public DataManager(Context context) {
        injectDependencies(context);
    }

    //Constructor solely for test purposes, not used on the app
    public DataManager(ApiService apiService, Scheduler subscribeScheduler ) {
        mApiService = apiService;
        mSubscribeScheduler = subscribeScheduler;

    }

    protected void injectDependencies(Context context) {
        DaggerDataManagerComponent.builder()
                .applicationComponent(App.get(context).getComponent())
                .dataManagerModule(new DataManagerModule())
                .build()
                .inject(this);
    }

    public Scheduler getScheduler() {
        return mSubscribeScheduler;
    }

    public Observable<Projects> getAllUserProjects() {
        return mApiService.getAllProjects("all");
    }

    public Observable<com.teamwork.teamworktestapp.models.projectdetails.Project> getProjectById(String id){
        return mApiService.getProjectById(id);
    }

}


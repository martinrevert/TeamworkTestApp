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

    /* This constructor is provided so we can set up a DataManager with mocks from unit test.
     * At the moment this is not possible to do with Dagger because the Gradle APT plugin doesn't
     * work for the unit test variant, plus Dagger 2 doesn't provide a nice way of overriding
     * modules */
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


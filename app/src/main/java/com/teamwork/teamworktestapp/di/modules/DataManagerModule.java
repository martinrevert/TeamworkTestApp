package com.teamwork.teamworktestapp.di.modules;

import com.teamwork.teamworktestapp.data.remote.ApiService;
import com.teamwork.teamworktestapp.data.remote.RetrofitHelper;
import com.teamwork.teamworktestapp.di.scopes.PerDataManager;

import dagger.Module;
import dagger.Provides;
import io.reactivex.Scheduler;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by martin on 08/03/18.
 */
@Module
public class DataManagerModule {

    public DataManagerModule() {

    }

    @Provides
    @PerDataManager
    ApiService provideApiService() {
        return new RetrofitHelper().newApiService();
    }

    @Provides
    @PerDataManager
    Scheduler provideSubscribeScheduler() {
        return Schedulers.io();
    }

}

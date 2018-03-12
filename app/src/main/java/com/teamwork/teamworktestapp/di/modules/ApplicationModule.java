package com.teamwork.teamworktestapp.di.modules;

/**
 * Created by martin on 06/03/18.
 */

import android.app.Application;

import com.teamwork.teamworktestapp.data.DataManager;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * This is where you will inject application-wide dependencies.
 */
@Module
public class ApplicationModule {

    protected final Application mApplication;

    public ApplicationModule(Application application) {
        mApplication = application;
    }

    @Provides
    @Singleton
    Application provideApplication() {
        return mApplication;
    }

    @Provides
    @Singleton
    DataManager provideDataManager() {
        return new DataManager(mApplication);
    }

}
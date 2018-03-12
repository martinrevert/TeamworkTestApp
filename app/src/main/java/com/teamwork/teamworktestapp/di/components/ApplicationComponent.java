package com.teamwork.teamworktestapp.di.components;

/**
 * Created by martin on 06/03/18.
 */

import android.app.Application;

import com.teamwork.teamworktestapp.data.DataManager;
import com.teamwork.teamworktestapp.di.modules.ApplicationModule;
import com.teamwork.teamworktestapp.view.activity.MainActivity;

import javax.inject.Singleton;
import dagger.Component;

@Singleton
@Component(modules=ApplicationModule.class)

public interface ApplicationComponent {

    void inject(MainActivity mainActivity);

    Application application();
    DataManager getDataManager();

}
package com.teamwork.teamworktestapp.di.components;

/**
 * Created by martin on 06/03/18.
 */

import com.teamwork.teamworktestapp.data.DataManager;
import com.teamwork.teamworktestapp.di.modules.ApplicationModule;


import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = ApplicationModule.class)

public interface ApplicationComponent {

    DataManager getDataManager();

}
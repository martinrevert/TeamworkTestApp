package com.teamwork.teamworktestapp.di.components;

import com.teamwork.teamworktestapp.data.DataManager;
import com.teamwork.teamworktestapp.di.modules.DataManagerModule;
import com.teamwork.teamworktestapp.di.scopes.PerDataManager;

import dagger.Component;

/**
 * Created by martin on 08/03/18.
 */

@PerDataManager
@Component(dependencies = ApplicationComponent.class, modules = DataManagerModule.class)
public interface DataManagerComponent {
    void inject(DataManager dataManager);
}

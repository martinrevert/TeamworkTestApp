package com.teamwork.teamworktestapp;

/**
 * Created by martin on 06/03/18.
 */

import android.app.Application;
import android.content.Context;


import com.squareup.leakcanary.LeakCanary;
import com.teamwork.teamworktestapp.di.components.ApplicationComponent;
import com.teamwork.teamworktestapp.di.modules.ApplicationModule;
import com.teamwork.teamworktestapp.di.components.DaggerApplicationComponent;


public class App extends Application {

    ApplicationComponent applicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        if (LeakCanary.isInAnalyzerProcess(this)) {
            return;
        }
        LeakCanary.install(this);
        // Normal app init code...
        applicationComponent = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .build();
    }

    public static App get(Context context) {
        return (App) context.getApplicationContext();
    }

    public ApplicationComponent getComponent() {
        return applicationComponent;
    }

    // Needed to replace the component with a test specific one, not used here
    public void setComponent(ApplicationComponent applicationComponent) {
        this.applicationComponent = applicationComponent;
    }

}
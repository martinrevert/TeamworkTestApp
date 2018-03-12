package com.teamwork.teamworktestapp.view.activity;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.teamwork.teamworktestapp.R;
import com.teamwork.teamworktestapp.view.fragment.ProjectsFragment;

/**
 * Created by martin on 08/03/18.
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addProjectsFragment();
    }

    private void addProjectsFragment() {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.content_frame, new ProjectsFragment())
                .commit();
    }


}

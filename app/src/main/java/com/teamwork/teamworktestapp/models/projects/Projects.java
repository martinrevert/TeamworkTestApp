package com.teamwork.teamworktestapp.models.projects;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class Projects {

    @SerializedName("projects")
    private List<Project> Projects;
    @Expose
    private String STATUS;

    public List<Project> getProjects() {
        return Projects;
    }

    public void setProjects(List<Project> projects) {
        Projects = projects;
    }

    public String getSTATUS() {
        return STATUS;
    }

    public void setSTATUS(String STATUS) {
        this.STATUS = STATUS;
    }

}

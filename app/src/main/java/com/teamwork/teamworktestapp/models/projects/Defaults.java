package com.teamwork.teamworktestapp.models.projects;

import com.google.gson.annotations.SerializedName;


@SuppressWarnings("unused")
public class Defaults {

    @SerializedName("privacy")
    private String Privacy;

    public String getPrivacy() {
        return Privacy;
    }

    public void setPrivacy(String privacy) {
        Privacy = privacy;
    }

}

package com.teamwork.teamworktestapp.models.projectdetails;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class Onedrivebusiness {

    @SerializedName("enabled")
    private Boolean Enabled;

    public Boolean getEnabled() {
        return Enabled;
    }

    public void setEnabled(Boolean enabled) {
        Enabled = enabled;
    }

}

package com.teamwork.teamworktestapp.models.projects;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class MicrosoftConnectors {

    @SerializedName("enabled")
    private Boolean Enabled;

    public Boolean getEnabled() {
        return Enabled;
    }

    public void setEnabled(Boolean enabled) {
        Enabled = enabled;
    }

}

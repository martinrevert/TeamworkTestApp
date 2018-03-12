package com.teamwork.teamworktestapp.models.projects;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class Integrations {

    @SerializedName("microsoftConnectors")
    private com.teamwork.teamworktestapp.models.projects.MicrosoftConnectors MicrosoftConnectors;
    @SerializedName("onedrivebusiness")
    private com.teamwork.teamworktestapp.models.projects.Onedrivebusiness Onedrivebusiness;

    public com.teamwork.teamworktestapp.models.projects.MicrosoftConnectors getMicrosoftConnectors() {
        return MicrosoftConnectors;
    }

    public void setMicrosoftConnectors(com.teamwork.teamworktestapp.models.projects.MicrosoftConnectors microsoftConnectors) {
        MicrosoftConnectors = microsoftConnectors;
    }

    public com.teamwork.teamworktestapp.models.projects.Onedrivebusiness getOnedrivebusiness() {
        return Onedrivebusiness;
    }

    public void setOnedrivebusiness(com.teamwork.teamworktestapp.models.projects.Onedrivebusiness onedrivebusiness) {
        Onedrivebusiness = onedrivebusiness;
    }

}

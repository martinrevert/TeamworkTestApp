
package com.teamwork.teamworktestapp.models.projectdetails;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class Integrations {

    @SerializedName("onedrivebusiness")
    private com.teamwork.teamworktestapp.models.projectdetails.Onedrivebusiness Onedrivebusiness;

    public com.teamwork.teamworktestapp.models.projectdetails.Onedrivebusiness getOnedrivebusiness() {
        return Onedrivebusiness;
    }

    public void setOnedrivebusiness(com.teamwork.teamworktestapp.models.projectdetails.Onedrivebusiness onedrivebusiness) {
        Onedrivebusiness = onedrivebusiness;
    }

}


package com.teamwork.teamworktestapp.models.projects;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class Company {

    @SerializedName("id")
    private String Id;
    @SerializedName("is-owner")
    private String IsOwner;
    @SerializedName("name")
    private String Name;

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getIsOwner() {
        return IsOwner;
    }

    public void setIsOwner(String isOwner) {
        IsOwner = isOwner;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

}

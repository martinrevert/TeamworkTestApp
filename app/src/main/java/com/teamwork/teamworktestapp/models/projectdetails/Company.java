
package com.teamwork.teamworktestapp.models.projectdetails;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class Company {

    @SerializedName("id")
    private String Id;
    @SerializedName("name")
    private String Name;

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

}

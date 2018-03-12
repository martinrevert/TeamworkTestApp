package com.teamwork.teamworktestapp.models.projects;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class Onedrivebusiness {

    @SerializedName("account")
    private String Account;
    @SerializedName("enabled")
    private Boolean Enabled;
    @SerializedName("folder")
    private String Folder;
    @SerializedName("foldername")
    private String Foldername;

    public String getAccount() {
        return Account;
    }

    public void setAccount(String account) {
        Account = account;
    }

    public Boolean getEnabled() {
        return Enabled;
    }

    public void setEnabled(Boolean enabled) {
        Enabled = enabled;
    }

    public String getFolder() {
        return Folder;
    }

    public void setFolder(String folder) {
        Folder = folder;
    }

    public String getFoldername() {
        return Foldername;
    }

    public void setFoldername(String foldername) {
        Foldername = foldername;
    }

}

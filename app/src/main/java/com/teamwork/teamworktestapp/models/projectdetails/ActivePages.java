package com.teamwork.teamworktestapp.models.projectdetails;

import com.google.gson.annotations.SerializedName;


@SuppressWarnings("unused")
public class ActivePages {

    @SerializedName("billing")
    private String Billing;
    @SerializedName("comments")
    private String Comments;
    @SerializedName("files")
    private String Files;
    @SerializedName("links")
    private String Links;
    @SerializedName("messages")
    private String Messages;
    @SerializedName("milestones")
    private String Milestones;
    @SerializedName("notebooks")
    private String Notebooks;
    @SerializedName("riskRegister")
    private String RiskRegister;
    @SerializedName("tasks")
    private String Tasks;
    @SerializedName("time")
    private String Time;

    public String getBilling() {
        return Billing;
    }

    public void setBilling(String billing) {
        Billing = billing;
    }

    public String getComments() {
        return Comments;
    }

    public void setComments(String comments) {
        Comments = comments;
    }

    public String getFiles() {
        return Files;
    }

    public void setFiles(String files) {
        Files = files;
    }

    public String getLinks() {
        return Links;
    }

    public void setLinks(String links) {
        Links = links;
    }

    public String getMessages() {
        return Messages;
    }

    public void setMessages(String messages) {
        Messages = messages;
    }

    public String getMilestones() {
        return Milestones;
    }

    public void setMilestones(String milestones) {
        Milestones = milestones;
    }

    public String getNotebooks() {
        return Notebooks;
    }

    public void setNotebooks(String notebooks) {
        Notebooks = notebooks;
    }

    public String getRiskRegister() {
        return RiskRegister;
    }

    public void setRiskRegister(String riskRegister) {
        RiskRegister = riskRegister;
    }

    public String getTasks() {
        return Tasks;
    }

    public void setTasks(String tasks) {
        Tasks = tasks;
    }

    public String getTime() {
        return Time;
    }

    public void setTime(String time) {
        Time = time;
    }

}

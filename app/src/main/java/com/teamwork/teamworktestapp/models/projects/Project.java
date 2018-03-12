package com.teamwork.teamworktestapp.models.projects;

import java.util.List;
import com.google.gson.annotations.SerializedName;


@SuppressWarnings("unused")
public class Project {

    @SerializedName("announcement")
    private String Announcement;
    @SerializedName("announcementHTML")
    private String AnnouncementHTML;
    @SerializedName("boardData")
    private com.teamwork.teamworktestapp.models.projects.BoardData BoardData;
    @SerializedName("category")
    private com.teamwork.teamworktestapp.models.projects.Category Category;
    @SerializedName("company")
    private com.teamwork.teamworktestapp.models.projects.Company Company;
    @SerializedName("created-on")
    private String CreatedOn;
    @SerializedName("defaultPrivacy")
    private String DefaultPrivacy;
    @SerializedName("defaults")
    private com.teamwork.teamworktestapp.models.projects.Defaults Defaults;
    @SerializedName("description")
    private String Description;
    @SerializedName("endDate")
    private String EndDate;
    @SerializedName("filesAutoNewVersion")
    private Boolean FilesAutoNewVersion;
    @SerializedName("harvest-timers-enabled")
    private Boolean HarvestTimersEnabled;
    @SerializedName("id")
    private String Id;
    @SerializedName("integrations")
    private com.teamwork.teamworktestapp.models.projects.Integrations Integrations;
    @SerializedName("isProjectAdmin")
    private Boolean IsProjectAdmin;
    @SerializedName("last-changed-on")
    private String LastChangedOn;
    @SerializedName("logo")
    private String Logo;
    @SerializedName("name")
    private String Name;
    @SerializedName("notifyeveryone")
    private Boolean Notifyeveryone;
    @SerializedName("overview-start-page")
    private String OverviewStartPage;
    @SerializedName("privacyEnabled")
    private Boolean PrivacyEnabled;
    @SerializedName("replyByEmailEnabled")
    private Boolean ReplyByEmailEnabled;
    @SerializedName("show-announcement")
    private Boolean ShowAnnouncement;
    @SerializedName("starred")
    private Boolean Starred;
    @SerializedName("startDate")
    private String StartDate;
    @SerializedName("start-page")
    private String StartPage;
    @SerializedName("status")
    private String Status;
    @SerializedName("subStatus")
    private String SubStatus;
    @SerializedName("tags")
    private List<Tag> Tags;
    @SerializedName("tasks-start-page")
    private String TasksStartPage;

    public String getAnnouncement() {
        return Announcement;
    }

    public void setAnnouncement(String announcement) {
        Announcement = announcement;
    }

    public String getAnnouncementHTML() {
        return AnnouncementHTML;
    }

    public void setAnnouncementHTML(String announcementHTML) {
        AnnouncementHTML = announcementHTML;
    }

    public com.teamwork.teamworktestapp.models.projects.BoardData getBoardData() {
        return BoardData;
    }

    public void setBoardData(com.teamwork.teamworktestapp.models.projects.BoardData boardData) {
        BoardData = boardData;
    }

    public com.teamwork.teamworktestapp.models.projects.Category getCategory() {
        return Category;
    }

    public void setCategory(com.teamwork.teamworktestapp.models.projects.Category category) {
        Category = category;
    }

    public com.teamwork.teamworktestapp.models.projects.Company getCompany() {
        return Company;
    }

    public void setCompany(com.teamwork.teamworktestapp.models.projects.Company company) {
        Company = company;
    }

    public String getCreatedOn() {
        return CreatedOn;
    }

    public void setCreatedOn(String createdOn) {
        CreatedOn = createdOn;
    }

    public String getDefaultPrivacy() {
        return DefaultPrivacy;
    }

    public void setDefaultPrivacy(String defaultPrivacy) {
        DefaultPrivacy = defaultPrivacy;
    }

    public com.teamwork.teamworktestapp.models.projects.Defaults getDefaults() {
        return Defaults;
    }

    public void setDefaults(com.teamwork.teamworktestapp.models.projects.Defaults defaults) {
        Defaults = defaults;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getEndDate() {
        return EndDate;
    }

    public void setEndDate(String endDate) {
        EndDate = endDate;
    }

    public Boolean getFilesAutoNewVersion() {
        return FilesAutoNewVersion;
    }

    public void setFilesAutoNewVersion(Boolean filesAutoNewVersion) {
        FilesAutoNewVersion = filesAutoNewVersion;
    }

    public Boolean getHarvestTimersEnabled() {
        return HarvestTimersEnabled;
    }

    public void setHarvestTimersEnabled(Boolean harvestTimersEnabled) {
        HarvestTimersEnabled = harvestTimersEnabled;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public com.teamwork.teamworktestapp.models.projects.Integrations getIntegrations() {
        return Integrations;
    }

    public void setIntegrations(com.teamwork.teamworktestapp.models.projects.Integrations integrations) {
        Integrations = integrations;
    }

    public Boolean getIsProjectAdmin() {
        return IsProjectAdmin;
    }

    public void setIsProjectAdmin(Boolean isProjectAdmin) {
        IsProjectAdmin = isProjectAdmin;
    }

    public String getLastChangedOn() {
        return LastChangedOn;
    }

    public void setLastChangedOn(String lastChangedOn) {
        LastChangedOn = lastChangedOn;
    }

    public String getLogo() {
        return Logo;
    }

    public void setLogo(String logo) {
        Logo = logo;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Boolean getNotifyeveryone() {
        return Notifyeveryone;
    }

    public void setNotifyeveryone(Boolean notifyeveryone) {
        Notifyeveryone = notifyeveryone;
    }

    public String getOverviewStartPage() {
        return OverviewStartPage;
    }

    public void setOverviewStartPage(String overviewStartPage) {
        OverviewStartPage = overviewStartPage;
    }

    public Boolean getPrivacyEnabled() {
        return PrivacyEnabled;
    }

    public void setPrivacyEnabled(Boolean privacyEnabled) {
        PrivacyEnabled = privacyEnabled;
    }

    public Boolean getReplyByEmailEnabled() {
        return ReplyByEmailEnabled;
    }

    public void setReplyByEmailEnabled(Boolean replyByEmailEnabled) {
        ReplyByEmailEnabled = replyByEmailEnabled;
    }

    public Boolean getShowAnnouncement() {
        return ShowAnnouncement;
    }

    public void setShowAnnouncement(Boolean showAnnouncement) {
        ShowAnnouncement = showAnnouncement;
    }

    public Boolean getStarred() {
        return Starred;
    }

    public void setStarred(Boolean starred) {
        Starred = starred;
    }

    public String getStartDate() {
        return StartDate;
    }

    public void setStartDate(String startDate) {
        StartDate = startDate;
    }

    public String getStartPage() {
        return StartPage;
    }

    public void setStartPage(String startPage) {
        StartPage = startPage;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public String getSubStatus() {
        return SubStatus;
    }

    public void setSubStatus(String subStatus) {
        SubStatus = subStatus;
    }

    public List<Tag> getTags() {
        return Tags;
    }

    public void setTags(List<Tag> tags) {
        Tags = tags;
    }

    public String getTasksStartPage() {
        return TasksStartPage;
    }

    public void setTasksStartPage(String tasksStartPage) {
        TasksStartPage = tasksStartPage;
    }

}

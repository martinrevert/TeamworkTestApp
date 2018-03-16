package com.teamwork.teamworktestapp.models.projectdetails;

import java.time.ZonedDateTime;
import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


@SuppressWarnings("unused")
public class Project {

    @SerializedName("active-pages")
    private com.teamwork.teamworktestapp.models.projectdetails.ActivePages ActivePages;
    @SerializedName("announcement")
    private String Announcement;
    @SerializedName("announcementHTML")
    private String AnnouncementHTML;
    @SerializedName("boardData")
    private com.teamwork.teamworktestapp.models.projectdetails.BoardData BoardData;
    @SerializedName("category")
    private com.teamwork.teamworktestapp.models.projectdetails.Category Category;
    @SerializedName("company")
    private com.teamwork.teamworktestapp.models.projectdetails.Company Company;
    @SerializedName("created-on")
    private ZonedDateTime CreatedOn;
    @SerializedName("defaultPrivacy")
    private String DefaultPrivacy;
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
    private com.teamwork.teamworktestapp.models.projectdetails.Integrations Integrations;
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
    @SerializedName("people")
    private List<String> People;
    @SerializedName("privacyEnabled")
    private Boolean PrivacyEnabled;
    @SerializedName("project")
    private Project Project;
    @SerializedName("replyByEmailEnabled")
    private Boolean ReplyByEmailEnabled;
    @Expose
    private String STATUS;
    @SerializedName("show-announcement")
    private Boolean ShowAnnouncement;
    @SerializedName("skipWeekends")
    private Boolean SkipWeekends;
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
    @SerializedName("type")
    private String Type;

    public com.teamwork.teamworktestapp.models.projectdetails.ActivePages getActivePages() {
        return ActivePages;
    }

    public void setActivePages(com.teamwork.teamworktestapp.models.projectdetails.ActivePages activePages) {
        ActivePages = activePages;
    }

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

    public com.teamwork.teamworktestapp.models.projectdetails.BoardData getBoardData() {
        return BoardData;
    }

    public void setBoardData(com.teamwork.teamworktestapp.models.projectdetails.BoardData boardData) {
        BoardData = boardData;
    }

    public com.teamwork.teamworktestapp.models.projectdetails.Category getCategory() {
        return Category;
    }

    public void setCategory(com.teamwork.teamworktestapp.models.projectdetails.Category category) {
        Category = category;
    }

    public com.teamwork.teamworktestapp.models.projectdetails.Company getCompany() {
        return Company;
    }

    public void setCompany(com.teamwork.teamworktestapp.models.projectdetails.Company company) {
        Company = company;
    }

    public ZonedDateTime getCreatedOn() {
        return CreatedOn;
    }

    public void setCreatedOn(ZonedDateTime createdOn) {
        CreatedOn = createdOn;
    }

    public String getDefaultPrivacy() {
        return DefaultPrivacy;
    }

    public void setDefaultPrivacy(String defaultPrivacy) {
        DefaultPrivacy = defaultPrivacy;
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

    public com.teamwork.teamworktestapp.models.projectdetails.Integrations getIntegrations() {
        return Integrations;
    }

    public void setIntegrations(com.teamwork.teamworktestapp.models.projectdetails.Integrations integrations) {
        Integrations = integrations;
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

    public List<String> getPeople() {
        return People;
    }

    public void setPeople(List<String> people) {
        People = people;
    }

    public Boolean getPrivacyEnabled() {
        return PrivacyEnabled;
    }

    public void setPrivacyEnabled(Boolean privacyEnabled) {
        PrivacyEnabled = privacyEnabled;
    }

    public Project getProject() {
        return Project;
    }

    public void setProject(Project project) {
        Project = project;
    }

    public Boolean getReplyByEmailEnabled() {
        return ReplyByEmailEnabled;
    }

    public void setReplyByEmailEnabled(Boolean replyByEmailEnabled) {
        ReplyByEmailEnabled = replyByEmailEnabled;
    }

    public String getSTATUS() {
        return STATUS;
    }

    public void setSTATUS(String STATUS) {
        this.STATUS = STATUS;
    }

    public Boolean getShowAnnouncement() {
        return ShowAnnouncement;
    }

    public void setShowAnnouncement(Boolean showAnnouncement) {
        ShowAnnouncement = showAnnouncement;
    }

    public Boolean getSkipWeekends() {
        return SkipWeekends;
    }

    public void setSkipWeekends(Boolean skipWeekends) {
        SkipWeekends = skipWeekends;
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

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

}

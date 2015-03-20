package com.mrconst.testing.model;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GithubRoot {

    @JsonProperty("current_user_url")
    private String currentUserUrl;
    @JsonProperty("current_user_authorizations_html_url")
    private String currentUserAuthorizationsHtmlUrl;
    @JsonProperty("authorizations_url")
    private String authorizationsUrl;
    @JsonProperty("code_search_url")
    private String codeSearchUrl;
    @JsonProperty("emails_url")
    private String emailsUrl;
    @JsonProperty("emojis_url")
    private String emojisUrl;
    @JsonProperty("events_url")
    private String eventsUrl;
    @JsonProperty("feeds_url")
    private String feedsUrl;
    @JsonProperty("following_url")
    private String followingUrl;
    @JsonProperty("gists_url")
    private String gistsUrl;
    @JsonProperty("hub_url")
    private String hubUrl;
    @JsonProperty("issue_search_url")
    private String issueSearchUrl;
    @JsonProperty("issues_url")
    private String issuesUrl;
    @JsonProperty("keys_url")
    private String keysUrl;
    @JsonProperty("notifications_url")
    private String notificationsUrl;
    @JsonProperty("organization_repositories_url")
    private String organizationRepositoriesUrl;
    @JsonProperty("organization_url")
    private String organizationUrl;
    @JsonProperty("public_gists_url")
    private String publicGistsUrl;
    @JsonProperty("rate_limit_url")
    private String rateLimitUrl;
    @JsonProperty("repository_url")
    private String repositoryUrl;
    @JsonProperty("repository_search_url")
    private String repositorySearchUrl;
    @JsonProperty("current_user_repositories_url")
    private String currentUserRepositoriesUrl;
    @JsonProperty("starred_url")
    private String starredUrl;
    @JsonProperty("starred_gists_url")
    private String starredGistsUrl;
    @JsonProperty("team_url")
    private String teamUrl;
    @JsonProperty("user_url")
    private String userUrl;
    @JsonProperty("user_organizations_url")
    private String userOrganizationsUrl;
    @JsonProperty("user_repositories_url")
    private String userRepositoriesUrl;
    @JsonProperty("user_search_url")
    private String userSearchUrl;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     * The currentUserUrl
     */
    @JsonProperty("current_user_url")
    public String getCurrentUserUrl() {
        return currentUserUrl;
    }

    /**
     *
     * @param currentUserUrl
     * The current_user_url
     */
    @JsonProperty("current_user_url")
    public void setCurrentUserUrl(String currentUserUrl) {
        this.currentUserUrl = currentUserUrl;
    }

    /**
     *
     * @return
     * The currentUserAuthorizationsHtmlUrl
     */
    @JsonProperty("current_user_authorizations_html_url")
    public String getCurrentUserAuthorizationsHtmlUrl() {
        return currentUserAuthorizationsHtmlUrl;
    }

    /**
     *
     * @param currentUserAuthorizationsHtmlUrl
     * The current_user_authorizations_html_url
     */
    @JsonProperty("current_user_authorizations_html_url")
    public void setCurrentUserAuthorizationsHtmlUrl(String currentUserAuthorizationsHtmlUrl) {
        this.currentUserAuthorizationsHtmlUrl = currentUserAuthorizationsHtmlUrl;
    }

    /**
     *
     * @return
     * The authorizationsUrl
     */
    @JsonProperty("authorizations_url")
    public String getAuthorizationsUrl() {
        return authorizationsUrl;
    }

    /**
     *
     * @param authorizationsUrl
     * The authorizations_url
     */
    @JsonProperty("authorizations_url")
    public void setAuthorizationsUrl(String authorizationsUrl) {
        this.authorizationsUrl = authorizationsUrl;
    }

    /**
     *
     * @return
     * The codeSearchUrl
     */
    @JsonProperty("code_search_url")
    public String getCodeSearchUrl() {
        return codeSearchUrl;
    }

    /**
     *
     * @param codeSearchUrl
     * The code_search_url
     */
    @JsonProperty("code_search_url")
    public void setCodeSearchUrl(String codeSearchUrl) {
        this.codeSearchUrl = codeSearchUrl;
    }

    /**
     *
     * @return
     * The emailsUrl
     */
    @JsonProperty("emails_url")
    public String getEmailsUrl() {
        return emailsUrl;
    }

    /**
     *
     * @param emailsUrl
     * The emails_url
     */
    @JsonProperty("emails_url")
    public void setEmailsUrl(String emailsUrl) {
        this.emailsUrl = emailsUrl;
    }

    /**
     *
     * @return
     * The emojisUrl
     */
    @JsonProperty("emojis_url")
    public String getEmojisUrl() {
        return emojisUrl;
    }

    /**
     *
     * @param emojisUrl
     * The emojis_url
     */
    @JsonProperty("emojis_url")
    public void setEmojisUrl(String emojisUrl) {
        this.emojisUrl = emojisUrl;
    }

    /**
     *
     * @return
     * The eventsUrl
     */
    @JsonProperty("events_url")
    public String getEventsUrl() {
        return eventsUrl;
    }

    /**
     *
     * @param eventsUrl
     * The events_url
     */
    @JsonProperty("events_url")
    public void setEventsUrl(String eventsUrl) {
        this.eventsUrl = eventsUrl;
    }

    /**
     *
     * @return
     * The feedsUrl
     */
    @JsonProperty("feeds_url")
    public String getFeedsUrl() {
        return feedsUrl;
    }

    /**
     *
     * @param feedsUrl
     * The feeds_url
     */
    @JsonProperty("feeds_url")
    public void setFeedsUrl(String feedsUrl) {
        this.feedsUrl = feedsUrl;
    }

    /**
     *
     * @return
     * The followingUrl
     */
    @JsonProperty("following_url")
    public String getFollowingUrl() {
        return followingUrl;
    }

    /**
     *
     * @param followingUrl
     * The following_url
     */
    @JsonProperty("following_url")
    public void setFollowingUrl(String followingUrl) {
        this.followingUrl = followingUrl;
    }

    /**
     *
     * @return
     * The gistsUrl
     */
    @JsonProperty("gists_url")
    public String getGistsUrl() {
        return gistsUrl;
    }

    /**
     *
     * @param gistsUrl
     * The gists_url
     */
    @JsonProperty("gists_url")
    public void setGistsUrl(String gistsUrl) {
        this.gistsUrl = gistsUrl;
    }

    /**
     *
     * @return
     * The hubUrl
     */
    @JsonProperty("hub_url")
    public String getHubUrl() {
        return hubUrl;
    }

    /**
     *
     * @param hubUrl
     * The hub_url
     */
    @JsonProperty("hub_url")
    public void setHubUrl(String hubUrl) {
        this.hubUrl = hubUrl;
    }

    /**
     *
     * @return
     * The issueSearchUrl
     */
    @JsonProperty("issue_search_url")
    public String getIssueSearchUrl() {
        return issueSearchUrl;
    }

    /**
     *
     * @param issueSearchUrl
     * The issue_search_url
     */
    @JsonProperty("issue_search_url")
    public void setIssueSearchUrl(String issueSearchUrl) {
        this.issueSearchUrl = issueSearchUrl;
    }

    /**
     *
     * @return
     * The issuesUrl
     */
    @JsonProperty("issues_url")
    public String getIssuesUrl() {
        return issuesUrl;
    }

    /**
     *
     * @param issuesUrl
     * The issues_url
     */
    @JsonProperty("issues_url")
    public void setIssuesUrl(String issuesUrl) {
        this.issuesUrl = issuesUrl;
    }

    /**
     *
     * @return
     * The keysUrl
     */
    @JsonProperty("keys_url")
    public String getKeysUrl() {
        return keysUrl;
    }

    /**
     *
     * @param keysUrl
     * The keys_url
     */
    @JsonProperty("keys_url")
    public void setKeysUrl(String keysUrl) {
        this.keysUrl = keysUrl;
    }

    /**
     *
     * @return
     * The notificationsUrl
     */
    @JsonProperty("notifications_url")
    public String getNotificationsUrl() {
        return notificationsUrl;
    }

    /**
     *
     * @param notificationsUrl
     * The notifications_url
     */
    @JsonProperty("notifications_url")
    public void setNotificationsUrl(String notificationsUrl) {
        this.notificationsUrl = notificationsUrl;
    }

    /**
     *
     * @return
     * The organizationRepositoriesUrl
     */
    @JsonProperty("organization_repositories_url")
    public String getOrganizationRepositoriesUrl() {
        return organizationRepositoriesUrl;
    }

    /**
     *
     * @param organizationRepositoriesUrl
     * The organization_repositories_url
     */
    @JsonProperty("organization_repositories_url")
    public void setOrganizationRepositoriesUrl(String organizationRepositoriesUrl) {
        this.organizationRepositoriesUrl = organizationRepositoriesUrl;
    }

    /**
     *
     * @return
     * The organizationUrl
     */
    @JsonProperty("organization_url")
    public String getOrganizationUrl() {
        return organizationUrl;
    }

    /**
     *
     * @param organizationUrl
     * The organization_url
     */
    @JsonProperty("organization_url")
    public void setOrganizationUrl(String organizationUrl) {
        this.organizationUrl = organizationUrl;
    }

    /**
     *
     * @return
     * The publicGistsUrl
     */
    @JsonProperty("public_gists_url")
    public String getPublicGistsUrl() {
        return publicGistsUrl;
    }

    /**
     *
     * @param publicGistsUrl
     * The public_gists_url
     */
    @JsonProperty("public_gists_url")
    public void setPublicGistsUrl(String publicGistsUrl) {
        this.publicGistsUrl = publicGistsUrl;
    }

    /**
     *
     * @return
     * The rateLimitUrl
     */
    @JsonProperty("rate_limit_url")
    public String getRateLimitUrl() {
        return rateLimitUrl;
    }

    /**
     *
     * @param rateLimitUrl
     * The rate_limit_url
     */
    @JsonProperty("rate_limit_url")
    public void setRateLimitUrl(String rateLimitUrl) {
        this.rateLimitUrl = rateLimitUrl;
    }

    /**
     *
     * @return
     * The repositoryUrl
     */
    @JsonProperty("repository_url")
    public String getRepositoryUrl() {
        return repositoryUrl;
    }

    /**
     *
     * @param repositoryUrl
     * The repository_url
     */
    @JsonProperty("repository_url")
    public void setRepositoryUrl(String repositoryUrl) {
        this.repositoryUrl = repositoryUrl;
    }

    /**
     *
     * @return
     * The repositorySearchUrl
     */
    @JsonProperty("repository_search_url")
    public String getRepositorySearchUrl() {
        return repositorySearchUrl;
    }

    /**
     *
     * @param repositorySearchUrl
     * The repository_search_url
     */
    @JsonProperty("repository_search_url")
    public void setRepositorySearchUrl(String repositorySearchUrl) {
        this.repositorySearchUrl = repositorySearchUrl;
    }

    /**
     *
     * @return
     * The currentUserRepositoriesUrl
     */
    @JsonProperty("current_user_repositories_url")
    public String getCurrentUserRepositoriesUrl() {
        return currentUserRepositoriesUrl;
    }

    /**
     *
     * @param currentUserRepositoriesUrl
     * The current_user_repositories_url
     */
    @JsonProperty("current_user_repositories_url")
    public void setCurrentUserRepositoriesUrl(String currentUserRepositoriesUrl) {
        this.currentUserRepositoriesUrl = currentUserRepositoriesUrl;
    }

    /**
     *
     * @return
     * The starredUrl
     */
    @JsonProperty("starred_url")
    public String getStarredUrl() {
        return starredUrl;
    }

    /**
     *
     * @param starredUrl
     * The starred_url
     */
    @JsonProperty("starred_url")
    public void setStarredUrl(String starredUrl) {
        this.starredUrl = starredUrl;
    }

    /**
     *
     * @return
     * The starredGistsUrl
     */
    @JsonProperty("starred_gists_url")
    public String getStarredGistsUrl() {
        return starredGistsUrl;
    }

    /**
     *
     * @param starredGistsUrl
     * The starred_gists_url
     */
    @JsonProperty("starred_gists_url")
    public void setStarredGistsUrl(String starredGistsUrl) {
        this.starredGistsUrl = starredGistsUrl;
    }

    /**
     *
     * @return
     * The teamUrl
     */
    @JsonProperty("team_url")
    public String getTeamUrl() {
        return teamUrl;
    }

    /**
     *
     * @param teamUrl
     * The team_url
     */
    @JsonProperty("team_url")
    public void setTeamUrl(String teamUrl) {
        this.teamUrl = teamUrl;
    }

    /**
     *
     * @return
     * The userUrl
     */
    @JsonProperty("user_url")
    public String getUserUrl() {
        return userUrl;
    }

    /**
     *
     * @param userUrl
     * The user_url
     */
    @JsonProperty("user_url")
    public void setUserUrl(String userUrl) {
        this.userUrl = userUrl;
    }

    /**
     *
     * @return
     * The userOrganizationsUrl
     */
    @JsonProperty("user_organizations_url")
    public String getUserOrganizationsUrl() {
        return userOrganizationsUrl;
    }

    /**
     *
     * @param userOrganizationsUrl
     * The user_organizations_url
     */
    @JsonProperty("user_organizations_url")
    public void setUserOrganizationsUrl(String userOrganizationsUrl) {
        this.userOrganizationsUrl = userOrganizationsUrl;
    }

    /**
     *
     * @return
     * The userRepositoriesUrl
     */
    @JsonProperty("user_repositories_url")
    public String getUserRepositoriesUrl() {
        return userRepositoriesUrl;
    }

    /**
     *
     * @param userRepositoriesUrl
     * The user_repositories_url
     */
    @JsonProperty("user_repositories_url")
    public void setUserRepositoriesUrl(String userRepositoriesUrl) {
        this.userRepositoriesUrl = userRepositoriesUrl;
    }

    /**
     *
     * @return
     * The userSearchUrl
     */
    @JsonProperty("user_search_url")
    public String getUserSearchUrl() {
        return userSearchUrl;
    }

    /**
     *
     * @param userSearchUrl
     * The user_search_url
     */
    @JsonProperty("user_search_url")
    public void setUserSearchUrl(String userSearchUrl) {
        this.userSearchUrl = userSearchUrl;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}

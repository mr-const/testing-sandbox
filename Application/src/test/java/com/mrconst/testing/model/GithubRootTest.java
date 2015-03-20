package com.mrconst.testing.model;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.junit.Test;

import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;

public class GithubRootTest {

    @Test
    public void GivenValidResponse_whenObjectReceived_thenDeserializedCorrectly() throws IOException {

        String validJson = "{\n" +
                "  \"current_user_url\": \"https://api.github.com/user\",\n" +
                "  \"current_user_authorizations_html_url\": \"https://github.com/settings/connections/applications{/client_id}\",\n" +
                "  \"authorizations_url\": \"https://api.github.com/authorizations\",\n" +
                "  \"code_search_url\": \"https://api.github.com/search/code?q={query}{&page,per_page,sort,order}\",\n" +
                "  \"emails_url\": \"https://api.github.com/user/emails\",\n" +
                "  \"emojis_url\": \"https://api.github.com/emojis\",\n" +
                "  \"events_url\": \"https://api.github.com/events\",\n" +
                "  \"feeds_url\": \"https://api.github.com/feeds\",\n" +
                "  \"following_url\": \"https://api.github.com/user/following{/target}\",\n" +
                "  \"gists_url\": \"https://api.github.com/gists{/gist_id}\",\n" +
                "  \"hub_url\": \"https://api.github.com/hub\",\n" +
                "  \"issue_search_url\": \"https://api.github.com/search/issues?q={query}{&page,per_page,sort,order}\",\n" +
                "  \"issues_url\": \"https://api.github.com/issues\",\n" +
                "  \"keys_url\": \"https://api.github.com/user/keys\",\n" +
                "  \"notifications_url\": \"https://api.github.com/notifications\",\n" +
                "  \"organization_repositories_url\": \"https://api.github.com/orgs/{org}/repos{?type,page,per_page,sort}\",\n" +
                "  \"organization_url\": \"https://api.github.com/orgs/{org}\",\n" +
                "  \"public_gists_url\": \"https://api.github.com/gists/public\",\n" +
                "  \"rate_limit_url\": \"https://api.github.com/rate_limit\",\n" +
                "  \"repository_url\": \"https://api.github.com/repos/{owner}/{repo}\",\n" +
                "  \"repository_search_url\": \"https://api.github.com/search/repositories?q={query}{&page,per_page,sort,order}\",\n" +
                "  \"current_user_repositories_url\": \"https://api.github.com/user/repos{?type,page,per_page,sort}\",\n" +
                "  \"starred_url\": \"https://api.github.com/user/starred{/owner}{/repo}\",\n" +
                "  \"starred_gists_url\": \"https://api.github.com/gists/starred\",\n" +
                "  \"team_url\": \"https://api.github.com/teams\",\n" +
                "  \"user_url\": \"https://api.github.com/users/{user}\",\n" +
                "  \"user_organizations_url\": \"https://api.github.com/user/orgs\",\n" +
                "  \"user_repositories_url\": \"https://api.github.com/users/{user}/repos{?type,page,per_page,sort}\",\n" +
                "  \"user_search_url\": \"https://api.github.com/search/users?q={query}{&page,per_page,sort,order}\"\n" +
                "}";

        ObjectMapper mapper = new ObjectMapper()
                .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        GithubRoot root = mapper.readValue(validJson, GithubRoot.class);

        assertThat(root).isNotNull();
    }

}
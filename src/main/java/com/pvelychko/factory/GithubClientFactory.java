package com.pvelychko.factory;

import java.util.ResourceBundle;

import org.eclipse.egit.github.core.client.GitHubClient;

public class GithubClientFactory {
	
	public static GitHubClient getInstance() {
		ResourceBundle labels = ResourceBundle.getBundle("application");
		GitHubClient client = new GitHubClient();
		client.setOAuth2Token(labels.getString("oauth.token"));
		return client;
	}
}

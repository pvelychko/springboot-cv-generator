package com.pvelychko.model;

import java.util.Collection;

import org.eclipse.egit.github.core.Repository;
import org.eclipse.egit.github.core.User;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize
public class Resume {
	
	private final User user;
	private final Collection<Repository> repositories;
	private final Statistics statistics;
	
	public Resume(
		User user, 
		Collection<Repository> repositories, 
		Statistics statistics
	) {
		this.user = user;
		this.repositories = repositories;
		this.statistics = statistics;
	}

	public User getUser() {
		return user;
	}

	public Collection<Repository> getRepositories() {
		return repositories;
	}
	
	public Statistics getStatistics() {
		return statistics;
	}
}

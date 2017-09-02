package com.pvelychko.model;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.egit.github.core.Repository;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize
public class Statistics {

	private final Map<String, Float> languageToPercent = new HashMap<>();
	
	public Statistics(Collection<Repository> repositories) {
		int totalCodeSize = 0;

		Map<String, Integer> languageToSize = new HashMap<>();
		for (Repository repository: repositories) {
			if (repository.getLanguage() == null) {
				continue;
			}
			totalCodeSize += repository.getSize();
			if (languageToSize.containsKey(repository.getLanguage())) {
				languageToSize.put(repository.getLanguage(), 
						languageToSize.get(repository.getLanguage()) + repository.getSize());
			} else {
				languageToSize.put(repository.getLanguage(), repository.getSize());
			}
		}

		if (totalCodeSize == 0) {
			return;
		}
		
		final float onePercent = totalCodeSize / 100;
		for (String language: languageToSize.keySet()) {
			languageToPercent.put(language, languageToSize.get(language) / (onePercent));
		}
	}

	public Map<String, Float> getLanguageToPercent() {
		return languageToPercent;
	}
}

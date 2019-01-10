package com.fortuneteller.uiservice.services.fortunes;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@ConfigurationProperties
@RefreshScope
public class FortuneProperties {
	@Value("${fortune.fallbackFortune}") 
	private String fallbackFortune;

	public String getFallbackFortune() {
		return fallbackFortune;
	}

	public void setFallbackFortune(String fallbackFortune) {
		this.fallbackFortune = fallbackFortune;
	}

}

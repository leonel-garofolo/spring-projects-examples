package com.in28minutes.microservices.limitsservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
//@ConfigurationProperties("limits-service")
public class Configuration {
	
	@Value("${limits-services.minimun}")
	private int minimun;
	
	@Value("${limits-services.maximun}")	
	private int maximun;

	public void setMinimum(int minimum) {
		this.minimun = minimum;
	}

	public void setMaximum(int maximum) {
		this.maximun = maximum;
	}

	public int getMinimum() {
		return minimun;
	}

	public int getMaximum() {
		return maximun;
	}

}

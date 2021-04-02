package com.in28minutes.microservices.limitsservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;

import brave.sampler.Sampler;

@SpringBootApplication
@EnableHystrix
@ConfigurationProperties
public class LimitsServiceApplication {
	public static void main(String[] args) {
		SpringApplication.run(LimitsServiceApplication.class, args);
	}

	@Bean
	public Sampler defaultSamplerFunction() {
		return Sampler.ALWAYS_SAMPLE;
	}
}

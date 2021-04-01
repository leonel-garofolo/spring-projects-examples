package com.lg.netflixzuulapigatewayserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@EnableAutoConfiguration
@Import(AdditionalRoutesImportSelector.class)
@EnableDiscoveryClient
public class NetflixZuulApiGatewayServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(NetflixZuulApiGatewayServerApplication.class, args);
	}

	/*
	@Bean
	public ServerCodecConfigurer serverCodecConfigurer() {
	return ServerCodecConfigurer.create();
	}
	*/

	
	@Bean
	public RouteLocator myRoutes(RouteLocatorBuilder builder) {

		// add customer filter. But to call microservice only we have to call http://{ip}:{port}/{application-naming}/{URI}}
		return builder.routes()
			.route("path_route", r -> r.path("/get")
			.uri("http://httpbin.org"))
			.build();
	}
	

}

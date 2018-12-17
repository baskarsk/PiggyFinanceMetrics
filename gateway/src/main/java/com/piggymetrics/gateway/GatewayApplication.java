package com.piggymetrics.gateway;

import org.apache.commons.logging.Log;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
public class GatewayApplication {

	private static Logger log = LoggerFactory.getLogger(GatewayApplication.class);
	
	public static void main(String[] args) {
		
		log.debug("-- In Gatewayapplication main method --");
		SpringApplication.run(GatewayApplication.class, args);
	}
}

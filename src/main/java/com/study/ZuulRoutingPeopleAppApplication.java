package com.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class ZuulRoutingPeopleAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulRoutingPeopleAppApplication.class, args);
	}
	
	@GetMapping("/")
	public String getPeople(@RequestHeader("x-location") String location) {
		return "Here is the people with hats on from " + location;
	}
}

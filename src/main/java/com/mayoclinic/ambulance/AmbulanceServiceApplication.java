package com.mayoclinic.ambulance;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.SpringServletContainerInitializer;

@SpringBootApplication
public class AmbulanceServiceApplication extends SpringServletContainerInitializer {

	public static void main(String[] args) {
		SpringApplication.run(AmbulanceServiceApplication.class, args);
	}

}

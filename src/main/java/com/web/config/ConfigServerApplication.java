package com.web.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigServerApplication {

    //SPRING_PROFILES_ACTIVE=dev;CONFIG_SERVER_URL=http://localhost:8888

	public static void main(String[] args) {
		SpringApplication.run(ConfigServerApplication.class, args);
	}

}

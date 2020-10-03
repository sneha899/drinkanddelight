package com.cg.ddms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.cg.ddms.dao")
public class DrinkAndDelightManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(DrinkAndDelightManagementApplication.class, args);
	}

}


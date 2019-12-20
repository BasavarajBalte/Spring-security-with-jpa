package com.springsec.springsecjpadb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.springsec.springsecjpadb.repository")
public class SpringSecJpaDbApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecJpaDbApplication.class, args);
	}

}

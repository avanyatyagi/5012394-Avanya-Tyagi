package com.lara.emsystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class EmsystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmsystemApplication.class, args);
	}

}

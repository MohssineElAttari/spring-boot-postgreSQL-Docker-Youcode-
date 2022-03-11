package com.example.docker.springbootbostgresdocker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class SpringbootBostgresDockerApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringbootBostgresDockerApplication.class, args);
	}

}

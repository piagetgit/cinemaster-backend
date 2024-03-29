package it.cinemaster;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("it.cinemaster.entity")
@EnableJpaRepositories("it.cinemaster.repository")
@ComponentScan(basePackages = "it.cinemaster")
public class CinemasterApplication {

	public static void main(String[] args) {
		SpringApplication.run(CinemasterApplication.class, args);
	}

}

package it.cinemaster;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@EnableAutoConfiguration
@ComponentScan(basePackages = "it.cinemaster")
public class CinemasterApplication {

	public static void main(String[] args) {
		SpringApplication.run(CinemasterApplication.class, args);
	}

}

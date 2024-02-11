package it.cinemaster;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.cloud.client.discovery.DiscoveryClient;
//import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
//@EnableDiscoveryClient
public class CinemasterApplication {

	public static void main(String[] args) {
		SpringApplication.run(CinemasterApplication.class, args);
	}

	//@Autowired
	//private DiscoveryClient discoveryClient;
}

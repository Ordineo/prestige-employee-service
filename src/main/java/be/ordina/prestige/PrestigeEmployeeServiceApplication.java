package be.ordina.prestige;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class PrestigeEmployeeServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrestigeEmployeeServiceApplication.class, args);
	}
}

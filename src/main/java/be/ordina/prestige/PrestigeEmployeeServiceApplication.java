package be.ordina.prestige;
import be.ordina.prestige.model.User;
import be.ordina.prestige.service.PrestigeService;
import be.ordina.prestige.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
// @EnableEurekaClient
public class PrestigeEmployeeServiceApplication implements CommandLineRunner {

	@Autowired
	private UserService userService;
	@Autowired
	private PrestigeService prestigeService;

	public static void main(String[] args) {
		SpringApplication.run(PrestigeEmployeeServiceApplication.class, args);
	}

	@Override
	public void run(String... strings) throws Exception {

		User user = userService.createUser("tyranwyn", "pass123");
		 userService.createUser("dswaggins", "derp123", "Dildo", "Swaggins", "http://www.google.be");
		 userService.lookup().forEach(User -> System.out.println(User.getFirstName()));

	}

}

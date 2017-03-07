package be.ordina.prestige;
import be.ordina.prestige.model.*;
import be.ordina.prestige.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

@SpringBootApplication
// @EnableEurekaClient
public class PrestigeEmployeeServiceApplication implements CommandLineRunner {

	@Autowired
	private UserService userService;
	@Autowired
	private PrestigeService prestigeService;
	@Autowired
	private CategoryService categoryService;
	@Autowired
	private RoleService roleService;
	@Autowired
	private PrestigeLikeService prestigeLikeService;

	public static void main(String[] args) {
		SpringApplication.run(PrestigeEmployeeServiceApplication.class, args);
	}

	@Override
	public void run(String... strings) throws Exception {

		Role user = roleService.createRole("user");
		Role admin = roleService.createRole("admin");

		List<Role> roleList1 = new ArrayList<>();
		roleList1.add(user);
		List<Role> roleList2 = new ArrayList<>();
		roleList2.add(user);
		roleList2.add(admin);
		List<Role> roleList3 = new ArrayList<>();
		roleList3.add(admin);

		User dswaggins = userService.createUser("dswaggins", "derp123", "Dildo", "Swaggins", "http://www.uidownload.com/files/232/925/277/avatar-face-icon.png", roleList1);
		User user1 = userService.createUser("user1", "derp123", "sammi", "fux", "http://www.uidownload.com/files/232/925/277/avatar-face-icon.png", roleList1);
		User user2 = userService.createUser("user2", "derp123", "joris", "lf", "http://www.uidownload.com/files/232/925/277/avatar-face-icon.png", roleList1);
		User user3 = userService.createUser("user3", "derp123", "ken", "", "http://www.uidownload.com/files/232/925/277/avatar-face-icon.png", roleList1);
		User user4 = userService.createUser("user4", "derp123", "ines", "vds", "http://www.uidownload.com/files/232/925/277/avatar-face-icon.png", roleList2);
//		userService.lookup().forEach(User -> System.out.println(User.getFirstName()));

		List<Category> categories1 = new ArrayList<>();
		categories1.add(categoryService.createCategory("Presentation"));
		List<Category> categories2 = new ArrayList<>();
		categories2.add(categoryService.createCategory("Movie"));
		categories2.add(categoryService.createCategory("Email"));
		categories2.add(categoryService.createCategory("Coffee"));

		List<PrestigeLike> likes1 = new ArrayList<>();
		likes1.add(prestigeLikeService.createLike(new PrestigeLike(dswaggins, "Schone fimmel")));
		likes1.add(prestigeLikeService.createLike(new PrestigeLike(user3, "Wat een beeld")));
		likes1.add(prestigeLikeService.createLike(new PrestigeLike(user4, "Topverhaal")));
//		List<PrestigeLike> likes2 = new ArrayList<>();
//		likes2.add(prestigeLikeService.createLike(new PrestigeLike(user1, "email heel informatief")));
//		likes2.add(prestigeLikeService.createLike(new PrestigeLike(user2, "top presentatie")));

		Prestige prestige1 = prestigeService.createPrestige(user1, user2, categories1, 1, "http://www.google.com", "Omdat het kan", likes1);
		//Prestige prestige2 = prestigeService.createPrestige(dswaggins, user4, categories2, 5, "", "Wrm, Drm"/*, likes2*/);

		//prestige1.addPrestigeLike(prestigeLikeService.createLike(new PrestigeLike(user3, "twas een schone presentatie")));
		//prestigeLikeService.lookup().forEach(PrestigeLike -> System.out.println());

	}

}

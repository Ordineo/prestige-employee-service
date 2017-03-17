package be.ordina.prestige.config;

import be.ordina.prestige.model.Category;
import be.ordina.prestige.model.Role;
import be.ordina.prestige.model.User;
import be.ordina.prestige.repo.CategoryRepository;
import be.ordina.prestige.repo.RoleRepository;
import be.ordina.prestige.repo.UserRepository;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter;
import org.springframework.stereotype.Component;

/**
 * Created by SaFu on 17/03/2017.
 */
@Component
public class SpringDataRestConfiguration extends RepositoryRestConfigurerAdapter {

    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
        config.withEntityLookup().forValueRepository(UserRepository.class, User::getFullName, UserRepository::findByLastName);
        config.withEntityLookup().forValueRepository(CategoryRepository.class, Category::getName, CategoryRepository::findByName);
        config.withEntityLookup().forValueRepository(RoleRepository.class, Role::getTitle, RoleRepository::findByTitle);
    }
}

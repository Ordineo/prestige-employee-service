package be.ordina.prestige.service;

import be.ordina.prestige.model.Role;
import be.ordina.prestige.model.User;
import be.ordina.prestige.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * Created by SaFu on 1/03/2017.
 */
@Service
public class UserService {

    private UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User createUser(String username, String password, String email, String firstname, String lastname, String avatar, String phone, String unit, String gender) {
        return userRepository.save(new User(username, password, email, firstname, lastname, avatar, phone, unit, gender));
    }

    public Iterable<User> lookup() {
        return userRepository.findAll();
    }

    public long total() {
        return userRepository.count();
    }
}

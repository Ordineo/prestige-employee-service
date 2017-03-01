package be.ordina.prestige.services;

import be.ordina.prestige.domain.User;
import be.ordina.prestige.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    public User createUser(String username, String password) {
        return userRepository.save(new User(username, password));
    }

    public User createUser(String username, String password, String firstname, String lastname, String avatar) {
        return userRepository.save(new User(username, password, firstname, lastname, avatar));
    }

    public Iterable<User> lookup() {
        return userRepository.findAll();
    }

    public long total() {
        return userRepository.count();
    }
}

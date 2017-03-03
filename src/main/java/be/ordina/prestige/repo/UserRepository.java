package be.ordina.prestige.repo;

import be.ordina.prestige.model.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by SaFu on 1/03/2017.
 */
public interface UserRepository extends CrudRepository<User, Integer> {
}

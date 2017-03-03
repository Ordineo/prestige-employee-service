package be.ordina.prestige.repo;

import be.ordina.prestige.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

/**
 * Created by SaFu on 1/03/2017.
 */
public interface UserRepository extends CrudRepository<User, Integer> {
    User findByUsername(@Param("username") String username);
    User findByFirstName(@Param("firstName") String firstName);
    User findByLastName(@Param("lastName") String lastName);
}

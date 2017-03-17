package be.ordina.prestige.repo;

import be.ordina.prestige.model.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by SaFu on 1/03/2017.
 */
public interface UserRepository extends CrudRepository<User, Integer> {
    User findByUsername(@Param("username") String username);
    User findByFirstName(@Param("firstName") String firstName);
    User findByLastName(@Param("lastName") String lastName);
    User findByEmail(@Param("email") String email);
    User findByFirstNameAndLastName(@Param("firstName") String firstName, @Param("lastName") String lastName);
    User findById(@Param("id") int id);
}

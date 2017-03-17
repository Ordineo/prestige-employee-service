package be.ordina.prestige.repo;

import be.ordina.prestige.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by SaFu on 1/03/2017.
 */
//@RepositoryRestResource(exported = false)
public interface UserRepository extends CrudRepository<User, Integer> {
    User findByUsername(@Param("username") String username);
    User findByFirstName(@Param("firstName") String firstName);
    User findByLastName(@Param("lastName") String lastName);
    User findByEmail(@Param("email") String email);
}

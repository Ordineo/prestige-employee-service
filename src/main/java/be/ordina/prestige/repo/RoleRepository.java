package be.ordina.prestige.repo;

import be.ordina.prestige.model.Role;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by SaFu on 7/03/2017.
 */
//@RepositoryRestResource(exported = false)
public interface RoleRepository extends CrudRepository<Role, Integer> {
    public Role findByTitle(@Param("title") String title);
}

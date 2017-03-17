package be.ordina.prestige.repo;

import be.ordina.prestige.model.Category;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by SaFu on 6/03/2017.
 */
//@RepositoryRestResource(exported = false)
public interface CategoryRepository extends CrudRepository<Category, Integer> {
    Category findByName(@Param("name") String name);
}
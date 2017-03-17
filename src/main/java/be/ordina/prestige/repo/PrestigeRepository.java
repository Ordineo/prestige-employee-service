package be.ordina.prestige.repo;

import be.ordina.prestige.model.Prestige;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.io.Serializable;
import java.util.Collection;

/**
 * Created by SaFu on 1/03/2017.
 */
public interface PrestigeRepository extends CrudRepository<Prestige, Integer> {
//    Collection<Prestige> findByCategory(@Param("categoryName") int categoryId);
}

package be.ordina.prestige.repo;

import be.ordina.prestige.model.Prestige;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.Collection;

/**
 * Created by SaFu on 1/03/2017.
 */
public interface PrestigeRepository extends CrudRepository<Prestige, Integer> {
    Collection<Prestige> findByCategory(@Param("categoryName") int categoryId);
}

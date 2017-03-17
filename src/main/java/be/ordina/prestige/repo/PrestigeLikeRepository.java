package be.ordina.prestige.repo;

import be.ordina.prestige.model.PrestigeLike;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by SaFu on 7/03/2017.
 */
//@RepositoryRestResource(exported = false)
public interface PrestigeLikeRepository extends CrudRepository<PrestigeLike, Integer> {
}

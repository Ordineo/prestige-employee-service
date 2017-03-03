package be.ordina.prestige.repo;

import be.ordina.prestige.model.PrestigeLike;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by SaFu on 2/03/2017.
 */
public interface LikeRepository extends CrudRepository<PrestigeLike, Integer> {
}

package be.ordina.prestige.service;

import be.ordina.prestige.model.PrestigeLike;
import be.ordina.prestige.repo.PrestigeLikeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by SaFu on 7/03/2017.
 */
@Service
public class PrestigeLikeService {

    private PrestigeLikeRepository prestigeLikeRepository;

    @Autowired
    public PrestigeLikeService(PrestigeLikeRepository prestigeLikeRepository) {
        this.prestigeLikeRepository = prestigeLikeRepository;
    }

    public PrestigeLike createLike(PrestigeLike like) {
        return prestigeLikeRepository.save(like);
    }
}

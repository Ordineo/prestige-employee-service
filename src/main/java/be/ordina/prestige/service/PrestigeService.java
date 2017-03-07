package be.ordina.prestige.service;

import be.ordina.prestige.model.Category;
import be.ordina.prestige.model.Prestige;
import be.ordina.prestige.model.PrestigeLike;
import be.ordina.prestige.model.User;
import be.ordina.prestige.repo.PrestigeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

/**
 * Created by SaFu on 1/03/2017.
 */
@Service
public class PrestigeService {

    private PrestigeRepository prestigeRepository;

    @Autowired
    public PrestigeService(PrestigeRepository prestigeRepository) {
        this.prestigeRepository = prestigeRepository;
    }

    public Prestige createPrestige(User grantor, User receiver, Collection<Category> categories, int score, String url, String reason, List<PrestigeLike> prestigeLikes) {

        return prestigeRepository.save(new Prestige(grantor, receiver, categories, score, url, reason, prestigeLikes));

    }

}

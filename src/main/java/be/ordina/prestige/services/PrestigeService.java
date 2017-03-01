package be.ordina.prestige.services;

import be.ordina.prestige.domain.Category;
import be.ordina.prestige.domain.Prestige;
import be.ordina.prestige.domain.User;
import be.ordina.prestige.repo.PrestigeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

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

    public Prestige createPrestige(Category category, User receiver, User grantor,
                                   int score, Date created, String reason) {
        return prestigeRepository.save(new Prestige(grantor, receiver, category, score, reason));
    }

    public Prestige createPrestige(Category category, User receiver, User grantor,
                                   int score, Date created, String reason, String url) {
        return prestigeRepository.save(new Prestige(grantor, receiver, category, score, reason, url));
    }
}

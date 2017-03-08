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

    public Prestige createPrestige(int score, String url, String reason) {

        return prestigeRepository.save(new Prestige(score, url, reason));

    }

}

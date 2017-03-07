package be.ordina.prestige.service;

import be.ordina.prestige.model.Role;
import be.ordina.prestige.repo.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by SaFu on 7/03/2017.
 */
@Service
public class RoleService {

    private RoleRepository roleRepository;

    @Autowired
    public RoleService(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    public Role createRole(String title) {
        return roleRepository.save(new Role(title));
    }
}

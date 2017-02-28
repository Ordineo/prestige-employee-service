package model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * Created by SaFu on 28/02/2017.
 */
@Getter
@Setter
@Entity
public class RoleAssignment {

    // Primary Key
    @Id
    @GeneratedValue
    private int id;

    // Foreign Keys
    @ManyToOne
    private User user;
    @ManyToOne
    private Role role;

    public RoleAssignment(User user, Role role) {
        this.user = user;
        this.role = role;
    }

    protected RoleAssignment() {}
}

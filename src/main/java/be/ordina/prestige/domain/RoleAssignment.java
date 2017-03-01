package be.ordina.prestige.domain;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

/**
 * Created by SaFu on 28/02/2017.
 */
@NoArgsConstructor(access = AccessLevel.PROTECTED)
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
}

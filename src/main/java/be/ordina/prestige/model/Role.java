package be.ordina.prestige.model;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

/**
 * Created by SaFu on 28/02/2017.
 */
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Setter
@Entity
public class Role implements Serializable {

    // Primary Key
    @Id
    @GeneratedValue
    private int id;

    @Column(name = "title", length = 100)
    private String title;

    @ManyToMany
    private Collection<User> users;

    public Role(String title) {
        this.title = title;
    }

}

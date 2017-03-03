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
public class Category implements Serializable {

    // Primary Key
    @Id
    @GeneratedValue
    private int id;

    @ManyToMany
    private Collection<Prestige> prestiges;

    @Column(name = "name", length = 60)
    private String name;

    public Category(String name) {
        this.name = name;
    }

}

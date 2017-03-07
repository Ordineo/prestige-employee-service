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
    @Column(name = "CATEGORY_ID", nullable = false)
    @GeneratedValue
    private int id;

    @ManyToMany(mappedBy = "categories")
    private Collection<Prestige> prestiges;

    @Column(name = "NAME", length = 60)
    private String name;

    public Category(String name) {
        this.name = name;
    }

    public Category addPrestige(Prestige prestige) {
        this.prestiges.add(prestige);
        prestige.getCategories().add(this);
        return this;
    }

}

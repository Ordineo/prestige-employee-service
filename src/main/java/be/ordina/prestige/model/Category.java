package be.ordina.prestige.model;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by SaFu on 28/02/2017.
 */
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Setter
@Entity
public class Category {

    // Primary Key
    @Id
    @GeneratedValue
    private int id;

    @Column(name = "name", length = 60)
    private String name;

    public Category(String name) {
        this.name = name;
    }

}

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
public class Role {

    // Primary Key
    @Id
    @GeneratedValue
    private int id;

    @Column(name = "title", length = 100)
    private String title;

    public Role(String title) {
        this.title = title;
    }

}

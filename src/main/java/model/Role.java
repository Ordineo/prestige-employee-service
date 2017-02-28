package model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by SaFu on 28/02/2017.
 */
@Getter
@Setter
@Entity
public class Role {

    // Primary Key
    @Id
    @GeneratedValue
    private int rid;

    @Column(name = "title", length = 100)
    private String title;

    public Role(String title) {
        this.title = title;
    }

    protected Role() {}

}

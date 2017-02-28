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
public class User {

    // Primary Key
    @Id
    @GeneratedValue
    private int uid;

    @Column(name = "username", length = 40)
    private String username;
    @Column(name = "firstname", length = 60)
    private String firstname;
    @Column(name = "lastname", length = 60)
    private String lastname;
    @Column(name = "avatar", length = 300)
    private String avatar;

    public User(String username, String firstname, String lastname, String avatar) {
        this.username = username;
        this.firstname = firstname;
        this.lastname = lastname;
        this.avatar = avatar;
    }

    protected User() {
    }
}

package be.ordina.prestige.domain;

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
public class User {

    // Primary Key
    @Id
    @GeneratedValue
    private int id;

    @Column(name = "username", length = 40)
    private String username;
    @Column(name = "password", length = 40)
    private String password;
    @Column(name = "firstname", length = 60)
    private String firstname;
    @Column(name = "lastname", length = 60)
    private String lastname;
    @Column(name = "avatar", length = 300)
    private String avatar;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public User(String username, String password, String firstname, String lastname, String avatar) {
        this.username = username;
        this.password = password;
        this.firstname = firstname;
        this.lastname = lastname;
        this.avatar = avatar;
    }

}

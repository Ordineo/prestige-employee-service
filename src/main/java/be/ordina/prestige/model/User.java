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
public class User implements Serializable {

    // Primary Key
    @Id
    @Column(name = "USER_ID", nullable = false)
    @GeneratedValue
    private int id;

    @Column(name = "USERNAME", length = 40)
    private String username;
    @Column(name = "PASSWORD", length = 40)
    private String password;
    @Column(name = "FIRSTNAME", length = 60)
    private String firstName;
    @Column(name = "LASTNAME", length = 60)
    private String lastName;
    @Column(name = "AVATAR", length = 300)
    private String avatar;

    @OneToMany(cascade = {CascadeType.PERSIST}, mappedBy = "grantor")
    private Collection<Prestige> grantedPrestiges;
    @OneToMany(cascade = {CascadeType.PERSIST}, mappedBy = "receiver")
    private Collection<Prestige> receivedPrestiges;
    @ManyToMany(mappedBy = "users")
    private Collection<Role> roles;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public User(String username, String password, String firstName, String lastName, String avatar) {
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.avatar = avatar;
    }

}

package be.ordina.prestige.model;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by SaFu on 28/02/2017.
 */
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Setter
@Entity
@Table(name = "USERS")
public class User implements Serializable {

    // Primary Key
    @Id
    @Column(name = "ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "USERNAME", length = 40)
    private String username;
    @Column(name = "PASSWORD", length = 40)
    private String password;
    @Column(name = "EMAIL", length = 50)
    private String email;
    @Column(name = "FIRSTNAME", length = 60)
    private String firstName;
    @Column(name = "LASTNAME", length = 60)
    private String lastName;
    @Column(name = "AVATAR", length = 300)
    private String avatar;
    @Column(name = "PHONE", length = 15)
    private String phone;
    @Column(name = "UNIT", length = 15)
    private String unit;
    @Column(name = "GENDER", length = 20)
    private String gender;

    // Foreign Keys
    @OneToMany(cascade = {CascadeType.PERSIST}, mappedBy = "grantor")
    private List<Prestige> grantedPrestiges = new ArrayList<>();
    @OneToMany(cascade = {CascadeType.PERSIST}, mappedBy = "receiver")
    private List<Prestige> receivedPrestiges = new ArrayList<>();
    @ManyToMany
    @JoinTable(name = "ROLE_ASSIGNMENTS", joinColumns = {
            @JoinColumn(name = "USER_ID")
    }, inverseJoinColumns = {
            @JoinColumn(name = "ROLE_ID")
    })
    private Collection<Role> roles;

    public User(String username, String password, String email, String firstName, String lastName, String avatar, String phone, String unit, String gender) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.avatar = avatar;
        this.phone = phone;
        this.unit = unit;
        this.gender = gender;
    }

    public String toString() {
        return "This is a user eks dee";
    }

}

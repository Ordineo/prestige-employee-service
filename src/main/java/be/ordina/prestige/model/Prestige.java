package be.ordina.prestige.model;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

/**
 * Created by SaFu on 28/02/2017.
 */
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Setter
@Entity
public class Prestige implements Serializable {

    // Primary Key
    @Id
    @Column(name = "PRESTIGE_ID", nullable = false)
    @GeneratedValue
    private int id;

//     Foreign Keys
    @ManyToOne
    private User grantor;
    @ManyToOne
    private User receiver;
    @ManyToMany(mappedBy = "prestiges")
    private Collection<Category> categories;
    @OneToMany
    private Collection<PrestigeLike> likes;

    @Column (name = "score")
    private int score;
    @Column(name = "reason", length = 500)
    private String reason;
    @Column(name = "url", length = 300)
    private String url;

    @Column(name = "created", insertable = false)
    @Temporal(TemporalType.DATE)
    private Date created;

    public Prestige(User grantor, User receiver, Collection<Category> categories, int score, String reason) {
        this.grantor = grantor;
        this.receiver = receiver;
        this.categories = categories;
        this.score = score;
        this.url = reason;
    }

    public Prestige(User grantor, User receiver,Collection<Category> categories, int score, String reason, String url) {
        this.grantor = grantor;
        this.receiver = receiver;
        this.categories = categories;
        this.score = score;
        this.reason = reason;
        this.url = url;
    }

}

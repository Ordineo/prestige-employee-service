package be.ordina.prestige.domain;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by SaFu on 28/02/2017.
 */
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Setter
@Entity
public class Prestige {

    // Primary Key
    @Id
    @GeneratedValue
    private int id;

    // Foreign Keys
    @OneToOne
    private User grantor;
    @OneToOne
    private User receiver;
    @ManyToMany
    private Category category;

    @Column (name = "score")
    private int score;
    @Column(name = "reason", length = 500)
    private String reason;
    @Column(name = "url", length = 300)
    private String url;

    @Column(name = "created", insertable = false)
    @Temporal(TemporalType.DATE)
    private Date created;

    public Prestige(User grantor, User receiver, Category category, int score, String reason) {
        this.grantor = grantor;
        this.receiver = receiver;
        this.category = category;
        this.score = score;
        this.url = reason;
    }

    public Prestige(User grantor, User receiver, Category category, int score, String reason, String url) {
        this.grantor = grantor;
        this.receiver = receiver;
        this.category = category;
        this.score = score;
        this.created = created;
        this.reason = reason;
        this.url = url;
    }

}

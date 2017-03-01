package model;

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
    @ManyToMany
    private Category category;
    @OneToOne
    private User receiver;
    @OneToOne
    private User grantor;

    @Column (name = "score")
    private int score;
    @Column(name = "created", insertable = false)
    @Temporal(TemporalType.DATE)
    private Date created;
    @Column(name = "url", length = 300)
    private String url;
    @Column(name = "reason", length = 500)
    private String reason;

    public Prestige(Category category, User receiver, User grantor, int score, Date created, String url, String reason) {
        this.category = category;
        this.receiver = receiver;
        this.grantor = grantor;
        this.score = score;
        this.created = created;
        this.url = url;
        this.url = reason;
    }

}

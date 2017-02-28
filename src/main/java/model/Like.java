package model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by SaFu on 28/02/2017.
 */
@Getter
@Setter
@Entity
public class Like {

    // Primary Key
    @Id
    @GeneratedValue
    private int lid;

    // Foreign Keys
    @ManyToOne
    private User user;
    @ManyToOne
    private Prestige prestige;

    @Column(name = "reason", length = 500)
    private String reason;
    @Column(name = "created", insertable = false)
    @Temporal(TemporalType.DATE)
    private Date created;

    public Like(User user, Prestige prestige, String reason, Date created) {
        this.user = user;
        this.prestige = prestige;
        this.reason = reason;
        this.created = created;
    }

    protected Like() {}
}

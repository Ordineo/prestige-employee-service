package be.ordina.prestige.model;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by SaFu on 3/03/2017.
 */
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Setter
@Entity
public class PrestigeLike {

    // Primary Key
    @Id
    @Column(name = "LIKE_ID", nullable = false)
    @GeneratedValue
    private int id;

    // Foreign Keys
    @ManyToOne
    private User user;

    @Column(name = "REASON", length = 500)
    private String reason;
    @Column(name = "CREATED", insertable = false)
    @Temporal(TemporalType.DATE)
    private Date created;

    public PrestigeLike(User user, String reason, Date created) {
        this.user = user;
        this.reason = reason;
        this.created = created;
    }

}

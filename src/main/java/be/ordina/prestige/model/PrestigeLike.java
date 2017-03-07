package be.ordina.prestige.model;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.web.bind.annotation.RequestMapping;

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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    // Foreign Keys
    @ManyToOne
    private User user;
    @ManyToOne
    private Prestige prestige;

    @Column(name = "REASON", length = 500)
    private String reason;
    @Column(name = "CREATED", columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP", insertable = false, updatable = false)
    @Temporal(TemporalType.DATE)
    private Date created;

    public PrestigeLike(User user, String reason) {
        this.user = user;
        this.reason = reason;
    }

}

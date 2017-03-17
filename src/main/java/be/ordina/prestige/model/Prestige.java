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
import java.util.Date;
import java.util.List;

/**
 * Created by SaFu on 28/02/2017.
 */
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Setter
@Entity
@Table(name = "PRESTIGES")
public class Prestige implements Serializable {

    // Primary Key
    @Id
    @Column(name = "ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    //  Foreign Keys
    @ManyToOne
    private User grantor;

    @ManyToOne
    private User receiver;
    @ManyToMany
    @JoinTable(name = "CATEGORY_ASSIGNMENTS", joinColumns = {
            @JoinColumn(name = "PRESTIGE_ID")
    }, inverseJoinColumns = {
            @JoinColumn(name = "CATEGORY_ID")
    })
    private Collection<Category> categories;

    @OneToMany(cascade = CascadeType.PERSIST, mappedBy = "prestige")
    private List<PrestigeLike> prestigeLikes = new ArrayList<>();

    @Column(name = "SCORE")
    private int score;
    @Column(name = "REASON", length = 500)
    private String reason;
    @Column(name = "URL", length = 300)
    private String url;

    @Column(name = "CREATED", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP", insertable = false, updatable = false)
    @Temporal(TemporalType.DATE)
    private Date created;

    public Prestige(int score, String url, String reason) {
        this.score = score;
        this.url = url;
        this.reason = reason;
    }

}

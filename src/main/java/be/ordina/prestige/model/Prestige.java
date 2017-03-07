package be.ordina.prestige.model;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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
@Table(name = "PRESTIGE")
public class Prestige implements Serializable {

    // Primary Key
    @Id
    @Column(name = "PRESTIGE_ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

//     Foreign Keys
    @ManyToOne
    private User grantor;
    @ManyToOne
    private User receiver;
    @ManyToMany
    @JoinTable(name = "PRESTIGE_CATEGORY", joinColumns = {
            @JoinColumn(name = "PRESTIGE_ID")
    }, inverseJoinColumns = {
            @JoinColumn(name = "CATEGORY_ID")
    })
    private Collection<Category> categories;

    // Todo investigate why the bidirectional relation does not work
    @OneToMany
    private List<PrestigeLike> prestigeLikes = new ArrayList<>();

    @Column (name = "SCORE")
    private int score;
    @Column(name = "REASON", length = 500)
    private String reason;
    @Column(name = "URL", length = 300)
    private String url;

    @Column(name = "CREATED", columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP", insertable = false, updatable = false)
    @Temporal(TemporalType.DATE)
    private Date created;

    public Prestige(User grantor, User receiver, Collection<Category> categories, int score, String url, String reason, List<PrestigeLike> prestigeLikes) {
        this.grantor = grantor;
        this.receiver = receiver;
        this.categories = categories;
        this.score = score;
        this.url = url;
        this.reason = reason;
        this.prestigeLikes = prestigeLikes;
    }

    public Prestige addCategory(Category category) {
        this.categories.add(category);
        category.getPrestiges().add(this);
        return this;
    }

    public Prestige addPrestigeLike(PrestigeLike prestigeLike) {
        this.prestigeLikes.add(prestigeLike);
        prestigeLike.setPrestige(this);
        return this;
    }

}

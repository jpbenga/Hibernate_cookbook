package fr.hb.jpb.calendrierGif.business;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Entity
@Getter
@Setter
@ToString
public class Reaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Date dateHeure;

    @ManyToOne
    private Emotion emotion;

    @ManyToOne
    private Utilisateur utilisateur;

    @ManyToOne
    private Gif gif;

    public Reaction() {
        super();
    }
}

package fr.hb.jpb.calendrierGif.business;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;
@Entity
@Getter
@Setter
@ToString
public class Emotion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String nom;
    @Column(nullable = false)
    private String code;
    @OneToMany(mappedBy = "emotion")
    private List<Reaction> reactions;

    public Emotion() {
        super();
    }
}

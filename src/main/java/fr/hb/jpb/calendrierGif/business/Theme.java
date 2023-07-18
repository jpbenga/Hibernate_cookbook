package fr.hb.jpb.calendrierGif.business;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Entity
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Theme {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 50)
    private String nom;

    @OneToMany(mappedBy = "theme")
    private List<Utilisateur> utilisateurs;
    public Theme(String nom) {
        this();
        this.nom = nom;
    }
}

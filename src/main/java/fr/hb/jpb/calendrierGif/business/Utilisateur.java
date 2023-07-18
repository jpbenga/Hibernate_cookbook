package fr.hb.jpb.calendrierGif.business;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Entity
@Getter
@Setter
@ToString
public class Utilisateur {

    private static final int NB_POINTS_INITIAL = 500;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nom;

    @Column(nullable = false)
    private String prenom;

    @Column(nullable = false, unique = true)
    @NotBlank(message = "Merci de préciser une adresse mail au bon format")
    private String email;

    @Size(min = 3, message = "Le mail doit contenir au moins 3 caractères")
    private String motDePasse;
    private int nbPoints;

    @ManyToOne
    @NotNull
    private Theme theme;

    @ManyToOne
    private List<Gif> gifs;

    public Utilisateur() {
        super();
        this.nbPoints = NB_POINTS_INITIAL;
    }
}

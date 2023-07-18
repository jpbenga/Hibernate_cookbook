package fr.hb.jpb.calendrierGif.business;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.sql.Date;
import java.util.List;

@Entity
@Getter
@Setter
@ToString
public class Gif {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;

    @Column(nullable = false)
    private Date dateHeureAjout;

    @Column(nullable = false)
    private String legende;

    private Jour jour;

    @ManyToOne
    private List<Reaction> reactions;

    public Gif() {
        super();
    }
}

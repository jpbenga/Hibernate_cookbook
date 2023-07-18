package fr.hb.jpb.calendrierGif.business;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
public class GifTeleverse {

    private String nomFichierOriginal;

    public GifTeleverse() {
        super();
    }
}

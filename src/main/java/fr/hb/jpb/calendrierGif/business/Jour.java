package fr.hb.jpb.calendrierGif.business;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

@Entity
@Getter
@Setter@ToString
public class Jour {
    private static final String FORMAT_DATE_AMERICAIN = "AAAA/mm/dd";
    private static final String FORMAT_DATE_FRANCAIS = "dd/mm/AAAA";
    private SimpleDateFormat simpleDateFormatAmericain;
    private SimpleDateFormat simpleDateFormatFrancais;
    private Date date;
    private int nbPoints;
    private Calendar calendar;
    private Gif gif;

}

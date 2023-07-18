package fr.hb.jpb.calendrierGif.dao;

import fr.hb.jpb.calendrierGif.business.Theme;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ThemeDao extends JpaRepository<Theme, Long> {
}

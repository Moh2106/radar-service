package ma.enset.radarservice.repositories;

import ma.enset.radarservice.entities.Radar;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RadarRepositories extends JpaRepository<Radar, Long> {
}

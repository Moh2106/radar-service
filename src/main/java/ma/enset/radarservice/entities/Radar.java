package ma.enset.radarservice.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ma.enset.radarservice.model.Infraction;
import ma.enset.radarservice.model.Proprietaire;


@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Radar {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String latitude;
    private String longitude;
    private Double vitesse_maximale;

    @Transient
    private Proprietaire proprietaire;

    @Transient
    private Infraction infraction;
}

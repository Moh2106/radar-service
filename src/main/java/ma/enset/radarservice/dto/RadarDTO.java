package ma.enset.radarservice.dto;

import jakarta.persistence.Transient;
import lombok.Data;
import ma.enset.radarservice.model.Infraction;
import ma.enset.radarservice.model.Proprietaire;

@Data
public class RadarDTO {
    private Long id;
    private String latitude;
    private String longitude;
    private Double vitesse_maximale;

    @Transient
    private Proprietaire proprietaire;

    @Transient
    private Infraction infraction;
}

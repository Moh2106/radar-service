package ma.enset.radarservice;

import lombok.AllArgsConstructor;
import ma.enset.radarservice.entities.Radar;
import ma.enset.radarservice.repositories.RadarRepositories;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.UUID;

@SpringBootApplication
@AllArgsConstructor
public class RadarServiceApplication implements CommandLineRunner {

    RadarRepositories radarRepositories;

    public static void main(String[] args) {
        SpringApplication.run(RadarServiceApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        for (int i=0; i<10;i++){
            Radar radar = Radar.builder()
                    .longitude(UUID.randomUUID().toString())
                    .latitude(UUID.randomUUID().toString())
                    .vitesse_maximale(Math.random()*2000)
                    .build();

            radarRepositories.save(radar);
        }
    }
}

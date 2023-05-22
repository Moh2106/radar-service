package ma.enset.radarservice.service;

import lombok.AllArgsConstructor;
import ma.enset.radarservice.dto.RadarDTO;
import ma.enset.radarservice.entities.Radar;
import ma.enset.radarservice.mapper.RadarMapper;
import ma.enset.radarservice.repositories.RadarRepositories;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class RadarServiceImpl implements RadarService<RadarDTO>{
    RadarRepositories radarRepositories;
    RadarMapper mapper;
    @Override
    public RadarDTO findById(Long id) {
        Radar radar = radarRepositories.findById(id).get();
        return mapper.from(radar);
    }

    @Override
    public List<RadarDTO> findAll() {
        return radarRepositories.findAll().stream().map(mapper::from).collect(Collectors.toList());
    }

    @Override
    public void deleteById(Long id) {
        radarRepositories.deleteById(id);
    }

    @Override
    public RadarDTO update(Long id, RadarDTO radarDTO) {
        Radar radar = radarRepositories.findById(id).get();

        if (radarDTO.getLatitude() != null) radar.setLatitude(radarDTO.getLatitude());
        if (radarDTO.getLongitude() != null) radar.setLongitude(radarDTO.getLongitude());
        if (radarDTO.getVitesse_maximale() != null) radar.setVitesse_maximale(radarDTO.getVitesse_maximale());
        if (radarDTO.getProprietaire() != null) radar.setProprietaire(radarDTO.getProprietaire());
        if (radarDTO.getInfraction() != null) radar.setInfraction(radarDTO.getInfraction());

        RadarDTO radarDTO1 = mapper.from(radar);
        save(radarDTO1);

        return radarDTO1;

    }

    @Override
    public RadarDTO save(RadarDTO radarDTO) {
        Radar radar = mapper.from(radarDTO);
        Radar radar1 = radarRepositories.save(radar);

        RadarDTO radarDTO1 = mapper.from(radar1);
        return radarDTO1;

    }
}

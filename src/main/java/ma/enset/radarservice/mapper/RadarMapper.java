package ma.enset.radarservice.mapper;

import ma.enset.radarservice.dto.RadarDTO;
import ma.enset.radarservice.entities.Radar;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class RadarMapper {
    ModelMapper mapper = new ModelMapper();

    public RadarDTO from(Radar radar){
        return mapper.map(radar, RadarDTO.class);
    }

    public Radar from(RadarDTO radarDTO){
        return mapper.map(radarDTO, Radar.class);
    }
}

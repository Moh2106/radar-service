package ma.enset.radarservice.web;

import lombok.AllArgsConstructor;
import ma.enset.radarservice.dto.RadarDTO;
import ma.enset.radarservice.service.RadarServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class RadarRestController {
    RadarServiceImpl radarService;

    @GetMapping("/radars/{id}")
    public RadarDTO getById(@PathVariable Long id){
        return radarService.findById(id);
    }

    @GetMapping("/radars")
    public List<RadarDTO> findAll(){
        return radarService.findAll();
    }

    @PostMapping("/radars")
    public RadarDTO save(@RequestBody RadarDTO radarDTO){
        return radarService.save(radarDTO);
    }

    @PutMapping("/radars/{id}")
    public RadarDTO update(@PathVariable Long id,@RequestBody RadarDTO radarDTO){
        return radarService.update(id, radarDTO);
    }

    @DeleteMapping("/radars/{id}")
    public void delete(Long id){
        radarService.deleteById(id);
    }
}

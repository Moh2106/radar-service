package ma.enset.radarservice.feign;

import ma.enset.radarservice.model.Infraction;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "INFRACTION-SERVICE")
public interface InfractionRestController {

    @GetMapping("/infractions/{id}")
    public Infraction findById(@PathVariable Long id);

    @GetMapping("/infractions")
    public List<Infraction> findAll();
}

package ma.enset.radarservice.feign;

import ma.enset.radarservice.model.Proprietaire;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "IMMATRICULATION-SERVICE")
public interface ProprietaireRestController {
    @GetMapping("/proprietaires/{id}")
    public Proprietaire findById(@PathVariable Long id);

    @GetMapping("/proprietaires")
    public List<Proprietaire> findAll();
}

package com.dsi.tp1.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dsi.tp1.entites.Entreprise;

@RestController
public class EntrepriseController {

@Autowired
private com.dsi.tp1.services.IEntrepriseService entrepriseService;
@CrossOrigin("http://localhost:4200")
@GetMapping("/entreprises")
public List<Entreprise> getAll(){
return entrepriseService.allEntreprises();
}

@GetMapping("/entreprises/{id}")
public Entreprise getEntreprise(@PathVariable("id") int id){
return entrepriseService.getEntreprise(id);
}

@PutMapping("/entreprises/{id}")
public Entreprise updatEntreprise(@PathVariable("id") int id, @RequestBody Entreprise e) {
return entrepriseService.UpdateEntreprise(e, id);
}
@DeleteMapping ("/entreprises/{id}")
public boolean deleteEntreprises(@PathVariable("id") int id) {
return entrepriseService.DeleteEntreprise(id);
}
@PostMapping("/entreprises")
    public boolean addEntreprise(@RequestBody Entreprise e) {
        return entrepriseService.addEntreprise(e);
    }




}

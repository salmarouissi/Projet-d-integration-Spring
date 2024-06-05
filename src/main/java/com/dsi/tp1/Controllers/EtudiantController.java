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

import com.dsi.tp1.entites.Etudiant;



@RestController

public class EtudiantController {

@Autowired
private com.dsi.tp1.services.IEtudiantService etudiantService;
@CrossOrigin("http://localhost:4200")
@GetMapping("/etudiants")
public List<Etudiant> getAll(){
return etudiantService.allEtudiants();
}

@GetMapping("/etudiants/{id}")
public Etudiant getOne(@PathVariable("id") int id){
return etudiantService.getEtudiant(id);
}

@PutMapping("/etudiants/{id}")
public Etudiant updatEtudiant(@PathVariable("id") int id, @RequestBody Etudiant etudiant) {
return etudiantService.UpdateEtudiant(etudiant, id);
}

@DeleteMapping ("/etudiants/{id}")
public boolean deleteEtudiant(@PathVariable("id") int id) {
return etudiantService.DeleteEtudiant(id);
}
@PostMapping("/etudiants")
    public boolean addEtudiant(@RequestBody Etudiant e) {
	System.out.println(e.getMdp());
        return etudiantService.addEtudiant(e);
    }


}
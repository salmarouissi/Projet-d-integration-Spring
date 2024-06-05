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


import com.dsi.tp1.entites.MembreJury;
@CrossOrigin("http://localhost:4200")
@RestController
public class MembreJuryController {

@Autowired
private com.dsi.tp1.services.IMembreJuryService membreJuryService;

@GetMapping("/Jurys")
public List<MembreJury> getAll(){
return membreJuryService.allMembreJury();
}

@GetMapping("/Jurys/{id}")
public MembreJury getJury(@PathVariable("id") int id){
return membreJuryService.getMembreJury(id);
}
@PutMapping("/Jurys/{id}")
public MembreJury updatJury(@PathVariable("id") int id, @RequestBody MembreJury membreJury) {
return membreJuryService.UpdateJury(membreJury, id);
}

@DeleteMapping ("/Jurys/{id}")
public boolean deleteJury(@PathVariable("id") int id) {
return membreJuryService.DeleteJury(id);
}
@PostMapping("/Jurys")
    public boolean addJury(@RequestBody MembreJury e) {
        return membreJuryService.addJury(e);
    }



}
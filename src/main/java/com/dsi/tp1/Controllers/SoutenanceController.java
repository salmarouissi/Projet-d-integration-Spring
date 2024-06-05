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


import com.dsi.tp1.entites.Soutenance;

import com.dsi.tp1.services.ISoutenanceService;

@RestController
public class SoutenanceController {
	@Autowired
	ISoutenanceService soutenanceService;
	@CrossOrigin("http://localhost:4200")
	@GetMapping("/soutenances")
	public List<Soutenance> getAll() {
		return soutenanceService.allSoutenances();
	}
	@GetMapping("/soutenances/{id}")
	public Soutenance getSoutenance(@PathVariable("id") int id){
	return soutenanceService.getSoutenance(id);
	}
	@PutMapping("/soutenances/{id}")
	public Soutenance updatSoutenance(@PathVariable("id") int id, @RequestBody Soutenance soutenance) {
	return soutenanceService.UpdateSoutenance(soutenance, id);
	}

	@DeleteMapping ("/soutenances/{id}")
	public boolean deleteSoutenance(@PathVariable("id") int id) {
	return soutenanceService.DeleteSoutenance(id);
	}
	@PostMapping("/soutenances")
	    public boolean addSoutenance(@RequestBody Soutenance s) {
	        return soutenanceService.addSoutenance(s);
	    }
	

}

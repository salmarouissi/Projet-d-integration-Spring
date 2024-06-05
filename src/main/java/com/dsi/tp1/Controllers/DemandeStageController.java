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

import com.dsi.tp1.entites.DemandeStage;
import com.dsi.tp1.services.IDemandeStageService;

@RestController
public class DemandeStageController {
	@Autowired
	private IDemandeStageService demandeStageService;
	@CrossOrigin("http://localhost:4200")
	@GetMapping("/Demandestage")
	public List<DemandeStage> getAll(){
	return demandeStageService.allDemandeStage();
	}

	@GetMapping("/Demandestage/{id}")
	public DemandeStage getStage(@PathVariable("id") int id){
	return demandeStageService.getDemandeStage(id);
	}
	@PutMapping("/Demandestage/{id}")
	public DemandeStage updatDemandestage(@PathVariable("id") int id, @RequestBody DemandeStage demandestage) {
	return demandeStageService.UpdateDemandeStage(demandestage, id);
	}

	@DeleteMapping ("/Demandestage/{id}")
	public boolean deleteDemandeStage(@PathVariable("id") int id) {
	return demandeStageService.DeleteDemandeStage(id);
	}
	@PostMapping("/Demandestage")
	    public boolean addDemandeStage(@RequestBody DemandeStage demandestage) {
	        return demandeStageService.addDemandeStage(demandestage);
	    }

	
}

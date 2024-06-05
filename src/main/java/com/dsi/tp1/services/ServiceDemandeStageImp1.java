package com.dsi.tp1.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dsi.tp1.entites.DemandeStage;

import com.dsi.tp1.repositories.DemandeStageRepository;

@Service
public class ServiceDemandeStageImp1 implements IDemandeStageService {
    @Autowired
    DemandeStageRepository demandeStageRepository;
	@Override
	public List<DemandeStage> allDemandeStage() {
		// TODO Auto-generated method stub
		return demandeStageRepository.findAll();
	}

	@Override
	public DemandeStage getDemandeStage(int id) {
		// TODO Auto-generated method stub
		Optional<DemandeStage> demandeStage=demandeStageRepository.findById(id);
		if(demandeStage.isPresent())
			return demandeStage.get();
		else
		    return null;
	}

	@Override
	public DemandeStage UpdateDemandeStage(DemandeStage demandeStage, int id) {
		// TODO Auto-generated method stub
		demandeStage.getIdDemande();
		demandeStageRepository.save(demandeStage);
		 return demandeStageRepository.findById(id).get();
	}

	@Override
	public boolean DeleteDemandeStage(int id) {
		// TODO Auto-generated method stub
		demandeStageRepository.deleteById(id);
		 return !demandeStageRepository.existsById(id);
	}

	@Override
	public boolean addDemandeStage(DemandeStage demandeStage) {
		// TODO Auto-generated method stub
		if(demandeStageRepository.save(demandeStage)!=null)
		    return true;
		else
			return false;
	}

}

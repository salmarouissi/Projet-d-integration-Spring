package com.dsi.tp1.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dsi.tp1.entites.Entreprise;

import com.dsi.tp1.repositories.EntrepriseRepository;

@Service
public class ServiceEntrepriseImp1 implements IEntrepriseService {
	@Autowired
    EntrepriseRepository entrepriseRepository;
	@Override
	public List<Entreprise> allEntreprises() {
		// TODO Auto-generated method stub
		return entrepriseRepository.findAll();
		
	}

	@Override
	public Entreprise getEntreprise(int id) {
		// TODO Auto-generated method stub
		Optional<Entreprise> entreprise=entrepriseRepository.findById(id);
		if(entreprise.isPresent())
			return entreprise.get();
		else
		    return null;
		
	}

	@Override
	public Entreprise UpdateEntreprise(Entreprise entreprise, int id) {
		// TODO Auto-generated method stub
		entreprise.getIdEntreprise();
		entrepriseRepository.save(entreprise);
		return entrepriseRepository.findById(id).get();
	}

	@Override
	public boolean DeleteEntreprise(int id) {
		// TODO Auto-generated method stub
		entrepriseRepository.deleteById(id);
		 return !entrepriseRepository.existsById(id);
	}

	@Override
	public boolean addEntreprise(Entreprise entreprise) {
		// TODO Auto-generated method stub
		if(entrepriseRepository.save(entreprise)!=null)
		    return true;
		else
			return false;
	}

}

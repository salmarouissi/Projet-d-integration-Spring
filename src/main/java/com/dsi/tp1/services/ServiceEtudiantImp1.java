package com.dsi.tp1.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dsi.tp1.entites.Etudiant;
import com.dsi.tp1.repositories.EtudiantRepository;
@Service
public class ServiceEtudiantImp1 implements IEtudiantService {
	@Autowired
    EtudiantRepository etudiantRepository;
	@Override
	public List<Etudiant> allEtudiants() {
		// TODO Auto-generated method stub
		return etudiantRepository.findAll();
	}

	@Override
	public Etudiant getEtudiant(int id) {
		// TODO Auto-generated method stub
		Optional<Etudiant> etudiant=etudiantRepository.findById(id);
		if(etudiant.isPresent())
			return etudiant.get();
		else
		    return null;
	}
	@Override
    public Etudiant UpdateEtudiant(Etudiant etudiant,int id) {
	 etudiant.getCin();
	 etudiantRepository.save(etudiant);
	 return etudiantRepository.findById(id).get();
	}
	 public boolean DeleteEtudiant(int id) {
		 etudiantRepository.deleteById(id);
		 return !etudiantRepository.existsById(id);
	 }
	@Override
	public boolean addEtudiant(Etudiant etudiant) {
		// TODO Auto-generated method stub
		if(etudiantRepository.save(etudiant)!=null)
		    return true;
		else
			return false;
	}

	@Override
	public Etudiant depotRapport(int id) {
		// TODO Auto-generated method stub
		Optional<Etudiant> etudiant=etudiantRepository.findById(id);
		if(etudiant.isPresent()) {
			if(etudiant.get().isDipot()==false) {
				etudiant.get().setDipot(true);
				return etudiant.get();
			}
		}
		return null;
	}

	@Override
	public boolean authentification(String username, String password) {
		// TODO Auto-generated method stub
		List<Etudiant> allEtudiants=etudiantRepository.findAll();
		for(Etudiant etudiant : allEtudiants) {
			if(etudiant.getUsername().equals(username) && etudiant.getMdp().equals(password)) {
				return true;
			}
		}
		return false;
		
	}

	@Override
	public Etudiant remplirForm(int id) {
		// TODO Auto-generated method stub
		Optional<Etudiant> etudiant=etudiantRepository.findById(id);
		if(etudiant.isPresent()) {
			if(etudiant.get().isFormulaire()==false) {
				etudiant.get().setFormulaire(true);
				return etudiant.get();
			}
		}
		return null;
	}

}

package com.dsi.tp1.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dsi.tp1.entites.Etudiant;
import com.dsi.tp1.entites.Stage;
import com.dsi.tp1.repositories.EtudiantRepository;
import com.dsi.tp1.repositories.StageRepository;

@Service
public class ServiceStageImp1 implements IStageService {
	@Autowired
    StageRepository StageRepository;
	@Autowired
    EtudiantRepository etudiantRepository;
	@Override
	public List<Stage> allStage() {
		// TODO Auto-generated method stub
		return StageRepository.findAll();
	}

	@Override
	public Stage getStage(int id) {
		// TODO Auto-generated method stub
		Optional<Stage> stage=StageRepository.findById(id);
		if(stage.isPresent())
			return stage.get();
		else
		    return null;
	}

	@Override
	public Stage DepotAttestation(Stage s,int idetudiant) {
		// TODO Auto-generated method stub
		Optional<Etudiant> etudiant=etudiantRepository.findById(idetudiant);
		if(etudiant.isPresent()) {
			if(etudiant.get().isDipot()==true) {
				s.setAttestation(true);
				 return s;
			}
		}
		 
		 return null;
	}

	@Override
	public Stage UpdateStage(Stage stage, int id) {
		// TODO Auto-generated method stub
		stage.getIdStage();
		StageRepository.save(stage);
		 return StageRepository.findById(id).get();
	}

	@Override
	public boolean DeleteStage(int id) {
		// TODO Auto-generated method stub
		StageRepository.deleteById(id);
		 return !StageRepository.existsById(id);
	}

	@Override
	public boolean addStage(Stage stage) {
		// TODO Auto-generated method stub
		if(StageRepository.save(stage)!=null)
		    return true;
		else
			return false;
	}

}

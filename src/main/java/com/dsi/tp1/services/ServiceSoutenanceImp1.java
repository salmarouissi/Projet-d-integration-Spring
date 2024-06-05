package com.dsi.tp1.services;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dsi.tp1.entites.Soutenance;
import com.dsi.tp1.repositories.SoutenanceRepository;
@Service
public class ServiceSoutenanceImp1 implements ISoutenanceService {
    @Autowired
    SoutenanceRepository soutenanceRepository;
	@Override
	public List<Soutenance> allSoutenances() {
		// TODO Auto-generated method stub
		return soutenanceRepository.findAll();
	}

	@Override
	public Soutenance getSoutenance(int id) {
		// TODO Auto-generated method stub
		Optional<Soutenance> soutenance=soutenanceRepository.findById(id);
		if(soutenance.isPresent()) {
			return soutenance.get(); 
		}
		return null;
	}

	@Override
	public Date getDate(int id) {
		// TODO Auto-generated method stub
		Optional<Soutenance> soutenance=soutenanceRepository.findById(id);
		if(soutenance.isPresent()) {
			return soutenance.get().getDate(); 
		}
		return null;
	}

	@Override
	public float getNote(int id) {
		// TODO Auto-generated method stub
		Optional<Soutenance> soutenance=soutenanceRepository.findById(id);
		if(soutenance.isPresent()) {
			return soutenance.get().getNote(); 
		}
		return -1;
	}

	@Override
	public Soutenance addDate(int id,Date d1) {
		// TODO Auto-generated method stub
		Optional<Soutenance> soutenance=soutenanceRepository.findById(id);
		if(soutenance.isPresent()) {
         soutenance.get().setDate(d1);
         return soutenance.get();
		}
		return null;
	}

	@Override
	public Soutenance addNote(int id,float note) {
		// TODO Auto-generated method stub
		Optional<Soutenance> soutenance=soutenanceRepository.findById(id);
		if(soutenance.isPresent()) {
         soutenance.get().setNote(note);
         return soutenance.get();
		}
		return null;
	}

	@Override
	public Soutenance UpdateSoutenance(Soutenance soutenance, int id) {
		// TODO Auto-generated method stub
		soutenance.getId();
		soutenanceRepository.save(soutenance);
		 return soutenanceRepository.findById(id).get();
	}

	@Override
	public boolean DeleteSoutenance(int id) {
		// TODO Auto-generated method stub
		soutenanceRepository.deleteById(id);
		 return !soutenanceRepository.existsById(id);
	}

	@Override
	public boolean addSoutenance(Soutenance soutenance) {
		// TODO Auto-generated method stub
		if(soutenanceRepository.save(soutenance)!=null)
		    return true;
		else
			return false;
	}

}

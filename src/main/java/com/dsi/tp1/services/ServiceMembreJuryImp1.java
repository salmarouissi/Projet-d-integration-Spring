package com.dsi.tp1.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.dsi.tp1.entites.MembreJury;
import com.dsi.tp1.repositories.MembreJuryRepository;

@Service
public class ServiceMembreJuryImp1 implements IMembreJuryService {
    @Autowired
    MembreJuryRepository membreJuryRepository;
	@Override
	public List<MembreJury> allMembreJury() {
		// TODO Auto-generated method stub
		return membreJuryRepository.findAll();
	}

	@Override
	public MembreJury getMembreJury(int id) {
		// TODO Auto-generated method stub
		Optional<MembreJury> membreJury=membreJuryRepository.findById(id);
		if(membreJury.isPresent())
			return membreJury.get();
		else
		    return null;
	}

	@Override
	public boolean authentification(String username, String password) {
		// TODO Auto-generated method stub
		List<MembreJury> allmembrejurys=membreJuryRepository.findAll();
		for(MembreJury membrejury : allmembrejurys) {
			if(membrejury.getUsername().equals(username) && membrejury.getMdp().equals(password)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public MembreJury UpdateJury(MembreJury jury, int id) {
		// TODO Auto-generated method stub
		jury.getCin();
		membreJuryRepository.save(jury);
		 return membreJuryRepository.findById(id).get();
	}

	@Override
	public boolean DeleteJury(int id) {
		// TODO Auto-generated method stub
		membreJuryRepository.deleteById(id);
		 return !membreJuryRepository.existsById(id);
	}

	@Override
	public boolean addJury(MembreJury jury) {
		// TODO Auto-generated method stub
				if(membreJuryRepository.save(jury)!=null)
				    return true;
				else
					return false;
	}

}

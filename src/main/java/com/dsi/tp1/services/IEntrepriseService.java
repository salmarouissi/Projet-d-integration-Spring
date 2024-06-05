package com.dsi.tp1.services;

import java.util.List;

import com.dsi.tp1.entites.Entreprise;

public interface IEntrepriseService {
	public List<Entreprise> allEntreprises();
	public Entreprise getEntreprise(int id);
    public Entreprise UpdateEntreprise(Entreprise entreprise,int id);
    public boolean DeleteEntreprise(int id);
	public boolean addEntreprise(Entreprise entreprise);
}

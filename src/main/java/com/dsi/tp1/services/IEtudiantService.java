package com.dsi.tp1.services;

import java.util.List;

import com.dsi.tp1.entites.Etudiant;


public interface IEtudiantService {
	public List<Etudiant> allEtudiants();
	public Etudiant getEtudiant(int id);
    public Etudiant UpdateEtudiant(Etudiant etudiant,int id);
    public boolean DeleteEtudiant(int id);
	public boolean addEtudiant(Etudiant etudiant);
	public Etudiant depotRapport(int id);
	public boolean authentification(String username, String password);
	public Etudiant remplirForm(int id);

}

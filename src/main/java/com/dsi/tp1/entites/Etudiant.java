package com.dsi.tp1.entites;

import java.io.Serializable;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import jakarta.persistence.OneToMany;


@Entity
public class Etudiant implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private int cin;
	private String nom;
	private String prenom;
	private String username;
	private String Mdp;
	private String departement;
	private String classE;
	private boolean dipot;
	private boolean formulaire;
	private String urlaff;
	   @OneToMany(mappedBy = "etudiant")
	    private List<DemandeStage> demandeStages;
	@OneToMany(mappedBy = "etudiant")
	private List<Stage> stages;
    @OneToMany(mappedBy ="etudiantsoutenance")
    private List<Soutenance> soutenances;
    

	public Etudiant() {
		
	}
	public Etudiant(int cin,String nom,String prenom,String classE,String username,String Mdp,String departement,String urlaff) {
		this.cin=cin;
		this.nom=nom;
		this.prenom=prenom;
		this.username=username;
		this.Mdp=Mdp;
		this.departement=departement;
        this.dipot=false;
        this.formulaire=false;
        this.classE=classE;
        this.setUrlaff(urlaff);
	}


	public int getCin() {
		return cin;
	}
	public void setCin(int cin) {
		this.cin = cin;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getMdp() {
		return Mdp;
	}
	public void setMdp(String mdp) {
		Mdp = mdp;
	}
	public boolean isDipot() {
		return dipot;
	}
	public void setDipot(boolean dipot) {
		this.dipot = dipot;
	}
	public boolean isFormulaire() {
		return formulaire;
	}
	public void setFormulaire(boolean formulaire) {
		this.formulaire = formulaire;
	}
	public String getDepartement() {
		return departement;
	}
	public void setDepartement(String departement) {
		this.departement = departement;
	}
	public String getClassE() {
		return classE;
	}
	public void setClassE(String classE) {
		this.classE = classE;
	}
	public String getUrlaff() {
		return urlaff;
	}
	public void setUrlaff(String urlaff) {
		this.urlaff = urlaff;
	}
	
	
	
	

}

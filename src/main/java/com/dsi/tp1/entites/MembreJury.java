package com.dsi.tp1.entites;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import jakarta.persistence.OneToMany;

@Entity
public class MembreJury implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private int cin;
	private String nom;
	private String prenom;
	private String departement;
	private String username;
	private String Mdp;
	@OneToMany(mappedBy = "membreJury")
	private List<Soutenance> soutenances;
	public MembreJury() {
		
	}
    public MembreJury(int cin,String nom,String prenom,String username,String Mdp,String departement) {
	    this.cin=cin;
		this.nom=nom;
		this.prenom=prenom;
		this.departement=departement;
		this.username=username;
		this.Mdp=Mdp;
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
	public String getDepartement() {
		return departement;
	}
	public void setDepartement(String departement) {
		this.departement = departement;
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
	
}

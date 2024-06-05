package com.dsi.tp1.entites;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

@Entity
public class Stage implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idStage;
	private String departement;
	private String nomEntreprise;
	private boolean attestation;
	@ManyToOne
	@JoinColumn(name="cinEtudiant")
	private Etudiant etudiant;
	@ManyToOne
	@JoinColumn(name="idDemandeStage")
	private DemandeStage demandeStage;
    @ManyToMany
    private Set<Entreprise> entreprises = new HashSet<>();
	public Stage() {
		
	}
	public Stage(String departement,String nomEntreprise) {
		this.departement=departement;
		this.nomEntreprise=nomEntreprise;
		this.attestation=false;
	}
	public int getIdStage() {
		return idStage;
	}
	public void setIdStage(int idStage) {
		this.idStage = idStage;
	}
	public String getDepartement() {
		return departement;
	}
	public void setDepartement(String departement) {
		this.departement = departement;
	}
	public String getNomEntreprise() {
		return nomEntreprise;
	}
	public void setNomEntreprise(String nomEntreprise) {
		this.nomEntreprise = nomEntreprise;
	}
	public boolean isAttestation() {
		return attestation;
	}
	public void setAttestation(boolean attestation) {
		this.attestation = attestation;
	}
	

}

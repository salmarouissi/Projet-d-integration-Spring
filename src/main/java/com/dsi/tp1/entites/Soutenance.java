package com.dsi.tp1.entites;

import java.io.Serializable;
import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
public class Soutenance implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Temporal(TemporalType.DATE)
    private Date date;
    private float note;
    private String salle;
    private String typeStage;
    private String rapportUrl;
    private String attestationUrl;
    public Soutenance() {
    	
    }
    public Soutenance(Date date) {
    	this.date=date;
    	this.note=0;
    }
    public Soutenance(Date date,float note,String salle,String typeStage,String rapportUrl,String attestationUrl) {
        this.date=date;
        this.note=note;
        this.salle=salle;
        this.typeStage=typeStage;
        this.rapportUrl=rapportUrl;
        this.attestationUrl=attestationUrl;
    }
 
    @ManyToOne
    @JoinColumn(name = "cinEtud")
    private Etudiant etudiantsoutenance;

    @ManyToOne
    @JoinColumn(name = "cinJury")
    private MembreJury membreJury;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public float getNote() {
		return note;
	}
	public void setNote(float note) {
		this.note = note;
	}
	public Etudiant getEtudiant() {
		return etudiantsoutenance;
	}
	public void setEtudiant(Etudiant etudiant) {
		this.etudiantsoutenance = etudiant;
	}
	public MembreJury getMembreJury() {
		return membreJury;
	}
	public void setMembreJury(MembreJury membreJury) {
		this.membreJury = membreJury;
	}
	public String getSalle() {
		return salle;
	}
	public void setSalle(String salle) {
		this.salle = salle;
	}
	public String getTypeStage() {
		return typeStage;
	}
	public void setTypeStage(String typeStage) {
		this.typeStage = typeStage;
	}
	public String getRapportUrl() {
		return rapportUrl;
	}
	public void setRapportUrl(String rapportUrl) {
		this.rapportUrl = rapportUrl;
	}
	public String getAttestationUrl() {
		return attestationUrl;
	}
	public void setAttestationUrl(String attestationUrl) {
		this.attestationUrl = attestationUrl;
	}
    
    
}
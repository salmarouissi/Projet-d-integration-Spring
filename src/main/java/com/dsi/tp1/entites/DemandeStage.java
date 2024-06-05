package com.dsi.tp1.entites;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
public class DemandeStage implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idDemande;

    private String nomEntreprise;
    private String dep;
    private String responsable;
    private String type;
    private String demandeurl;
    private String tel;

    @Temporal(TemporalType.DATE)
    private Date dated;

    @Temporal(TemporalType.DATE)
    private Date datef;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "cinEtudiant")
    private Etudiant etudiant;

    @OneToMany(mappedBy = "demandeStage")
    private List<Stage> stages;

    public DemandeStage() {
    }

    public DemandeStage(int idDemande, String nomEntreprise, String dep, String responsable, String type, Date dated, Date datef, String demandeurl,Etudiant etudiant) {
        this.idDemande = idDemande;
        this.nomEntreprise = nomEntreprise;
        this.dep = dep;
        this.responsable = responsable;
        this.type = type;
        this.dated = dated;
        this.datef = datef;
        this.demandeurl = demandeurl;
        this.etudiant=etudiant;
    }

    // Getters and setters...

    public int getIdDemande() {
        return idDemande;
    }

    public void setIdDemande(int idDemande) {
        this.idDemande = idDemande;
    }

    public String getNomEntreprise() {
        return nomEntreprise;
    }

    public void setNomEntreprise(String nomEntreprise) {
        this.nomEntreprise = nomEntreprise;
    }

    public String getDep() {
        return dep;
    }

    public void setDep(String dep) {
        this.dep = dep;
    }

    public String getResponsable() {
        return responsable;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDemandeurl() {
        return demandeurl;
    }

    public void setDemandeurl(String demandeurl) {
        this.demandeurl = demandeurl;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public Date getDated() {
        return dated;
    }

    public void setDated(Date dated) {
        this.dated = dated;
    }

    public Date getDatef() {
        return datef;
    }

    public void setDatef(Date datef) {
        this.datef = datef;
    }

    public Etudiant getEtudiant() {
        return etudiant;
    }

    public void setEtudiant(Etudiant etudiant) {
        this.etudiant = etudiant;
    }

    public List<Stage> getStages() {
        return stages;
    }

    public void setStages(List<Stage> stages) {
        this.stages = stages;
    }
}

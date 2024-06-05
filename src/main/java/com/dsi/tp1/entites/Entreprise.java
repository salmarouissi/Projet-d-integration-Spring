package com.dsi.tp1.entites;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Entreprise implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idEntreprise;
	private String nomEntreprise;
	private String categorie;
	private String mail;
	private String telephone;
	private String imageUrl;
	@Column(length = 9000)
	private String description;
	 @ManyToMany(mappedBy = "entreprises")
	    private Set<Stage> stages = new HashSet<>();
	public Entreprise() {
		
	}
	public Entreprise(String nomEntreprise,String categorie,String mail,String telephone,String imageUrl,String description) {
		this.nomEntreprise=nomEntreprise;
		this.categorie=categorie;
		this.mail=mail;
		this.telephone=telephone;
		this.setImageUrl(imageUrl);
		this.setDescription(description);
		
	}
	public int getIdEntreprise() {
		return idEntreprise;
	}
	public void setIdEntreprise(int idEntreprise) {
		this.idEntreprise = idEntreprise;
	}
	public String getNomEntreprise() {
		return nomEntreprise;
	}
	public void setNomEntreprise(String nomEntreprise) {
		this.nomEntreprise = nomEntreprise;
	}

	public String getCategorie() {
		return categorie;
	}
	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	

}

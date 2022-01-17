package com.inti.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Gerant {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idGerant;
	private String nom;
	private String prenom;
	@ManyToOne
	private Ferme fermeG;
	
	public Gerant() {
		
	}

	public Gerant(String nom, String prenom, Ferme ferme) {
		this.nom = nom;
		this.prenom = prenom;
		this.fermeG = ferme;
	}

	public Long getIdGerant() {
		return idGerant;
	}

	public void setIdGerant(Long idGerant) {
		this.idGerant = idGerant;
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

	public Ferme getFermeG() {
		return fermeG;
	}

	public void setFermeG(Ferme ferme) {
		this.fermeG = ferme;
	}

	@Override
	public String toString() {
		return "Gerant [idGerant=" + idGerant + ", nom=" + nom + ", prenom=" + prenom + "]";
	}
	
}

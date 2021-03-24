package com.project0.esprit.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Planning")
public class Planning  {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int idPlanning  ; 
	@Column
	private String Nom;
	@Column
	private String 	Horaire ;
	@Column
	private String 	cours ;
	@Column
	private String 	salle ;
	
	
	public int getIdPlanning() {
		return idPlanning;
	}
	public void setIdPlanning(int idPlanning) {
		this.idPlanning = idPlanning;
	}
	public String getNom() {
		return Nom;
	}
	public void setNom(String nom) {
		Nom = nom;
	}
	
	public String getHoraire() {
		return Horaire;
	}
	public void setHoraire(String horaire) {
		Horaire = horaire;
	}
	public String getCours() {
		return cours;
	}
	public void setCours(String cours) {
		this.cours = cours;
	}
	public String getSalle() {
		return salle;
	}
	public void setSalle(String salle) {
		this.salle = salle;
	}
	public Planning() {
		super();
	}
	
	
	
}

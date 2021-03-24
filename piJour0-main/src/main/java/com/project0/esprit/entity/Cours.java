package com.project0.esprit.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.Table;

@Entity
@Table(name="Cours")
public class Cours {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int idCours ; 
	@Column
	private String Nomcours ;
	@Column
	private String 	nomProf ;
	public int getIdCours() {
		return idCours;
	}
	public void setIdCours(int idCours) {
		this.idCours = idCours;
	}
	public String getNomcours() {
		return Nomcours;
	}
	public void setNomcours(String nomcours) {
		Nomcours = nomcours;
	}
	public String getNomProf() {
		return nomProf;
	}
	public void setNomProf(String nomProf) {
		this.nomProf = nomProf;
	}
	public Cours() {
		super();
	}

}

package com.project0.esprit.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="Enfant")
public class Enfant implements Serializable {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private long idenfant;
	
	@Column
	private String Nom ;
	@Column
	private String 	Prenom ;
	@Column
	private String Photo ;
	@Column
	private String 	Age ;
	
	

   
    
	@ManyToOne
	@JoinColumn(name="idParent",nullable = false)
	 private Parent parent; 
	
	public Parent getParent() {
		return parent;
	}
	public void setParent(Parent parent) {
		this.parent = parent;
	}
	@ManyToOne
	   @JoinColumn(name="idJardin",nullable =false)
	private Jardin jardin; 
	
       public Jardin getJardin() {
		return jardin;
	}
	public void setJardin(Jardin jardin) {
		this.jardin = jardin;
	}
	public long getIdenfant() {
		return idenfant;
	}
	public Enfant(String nom, String prenom, String photo, String age, Parent parent) {
		super();
		Nom = nom;
		Prenom = prenom;
		Photo = photo;
		Age = age;
		this.parent = parent;
	}
	public void setIdenfant(long idenfant) {
		this.idenfant = idenfant;
	}
	public Enfant(long idenfant, String nom, String prenom, String photo, String age, Parent parent) {
		super();
		this.idenfant = idenfant;
		Nom = nom;
		Prenom = prenom;
		Photo = photo;
		Age = age;
		this.parent = parent;
	}
	
		public String getNom() {
		return Nom;
	}
	public void setNom(String nom) {
		Nom = nom;
	}
	public String getPrenom() {
		return Prenom;
	}
	public void setPrenom(String prenom) {
		Prenom = prenom;
	}
	public String getPhoto() {
		return Photo;
	}
	public void setPhoto(String photo) {
		Photo = photo;
	}
	public String getAge() {
		return Age;
	}
	public void setAge(String age) {
		Age = age;
	}
	public Enfant() {
		super();
	}
	

	
	
}

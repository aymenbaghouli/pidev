package com.project0.esprit.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.mapping.List;
@Entity
@Table(name="jardin")
public class Jardin {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int idJardin  ; 
	@Column
	private String Nom;
	@Column
	
	private String 	Adresse;
	@Column
	private String 	MailJ ;
	
	@Column
	private String Photo ;
	@Column
	private String 	Description ;
	@Column
	private String Satisfaction ;
	@Column
	private String Calendar ;
	@Column
	private String Horaire ;
	@Column
	private int abonner ;
	@Column
	private int nbemployees ;
	@Column
	private int tel ;
	@Column
	private int localisation ;
	@Column
	private int cout ;
	@Column
	private int datecréation ;
	@Column
	private int nbplacedispo;
	@Column
	private int nbenfant; 
	@Column
	private int dateDebutAb; 
	@Column
	private int dateFinAb; 
	
	
	/*@OneToMany(cascade = CascadeType.ALL, mappedBy="Jardin")
	private Set<FeedBack> feedback ;
	*/
	//private List Enfant;
	@OneToMany(mappedBy="jardin")
	 private Set<Enfant> enfants;

	
	public Set<Enfant> getEnfants() {
		return enfants;
	}



	public void setEnfants(Set<Enfant> enfants) {
		this.enfants = enfants;
	}



	public String getNom() {
		return Nom;
	}
	


	public void setNom(String nom) {
		Nom = nom;
	}

	
	public String getAdresse() {
		return Adresse;
	}
	public void setAdresse(String adresse) {
		Adresse = adresse;
	}
	public String getMailJ() {
		return MailJ;
	}
	public void setMailJ(String mailJ) {
		MailJ = mailJ;
	}
	public String getPhoto() {
		return Photo;
	}
	public void setPhoto(String photo) {
		Photo = photo;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public String getSatisfaction() {
		return Satisfaction;
	}
	public void setSatisfaction(String satisfaction) {
		Satisfaction = satisfaction;
	}
	public String getCalendar() {
		return Calendar;
	}
	public void setCalendar(String calendar) {
		Calendar = calendar;
	}
	public String getHoraire() {
		return Horaire;
	}
	public void setHoraire(String horaire) {
		Horaire = horaire;
	}
	public int getIdJardin() {
		return idJardin;
	}
	public void setIdJardin(int idJardin) {
		this.idJardin = idJardin;
		
	}
	
	public int getAbonner() {
		return abonner;
	}
	public void setAbonner(int abonner) {
		this.abonner = abonner;
		
	}
	
	public int getNbemployees() {
		return nbemployees;
	}
	public void setNbemployees(int nbemployees) {
		this.nbemployees = nbemployees;
	}
	
	public int getTel() {
		return tel;
	}
	public void setTel(int tel) {
		this.tel = tel;
	}
	public int getLocalisation() {
		return localisation;
	}
	public void setLocalisation(int localisation) {
		this.localisation = localisation;
	}
	public int getCout() {
		return cout;
	}
	public void setCout(int cout) {
		this.cout = cout;
	}
	public int getDatecréation() {
		return datecréation;
	}
	public void setDatecréation(int datecréation) {
		this.datecréation = datecréation;
	}
	
	public int getNbplacedispo() {
		return nbplacedispo;
	}



	public void setNbplacedispo(int nbplacedispo) {
		this.nbplacedispo = nbplacedispo;
	}



	public int getNbenfant() {
		return nbenfant;
	}



	public void setNbenfant(int nbenfant) {
		this.nbenfant = nbenfant;
	}
	



	public int getDateDebutAb() {
		return dateDebutAb;
	}



	public void setDateDebutAb(int dateDebutAb) {
		this.dateDebutAb = dateDebutAb;
	}



	public int getDateFinAb() {
		return dateFinAb;
	}



	public void setDateFinAb(int dateFinAb) {
		this.dateFinAb = dateFinAb;
	}



	public Jardin() {
		super();
	}
	
	
}

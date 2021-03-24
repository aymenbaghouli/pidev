package com.project0.esprit.entity;


import java.io.Serializable;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.mapping.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;
@Entity
@Table(name="parent")

//@DiscriminatorColumn(name="user_type")
public class Parent implements Serializable {

		@Id
		@GeneratedValue(strategy= GenerationType.IDENTITY)
		private long idParent ;
		
		@Column
		private String nom ;
		@Column
		private String 	prenom ;
		@Column
		private String 	MailP ;
		@Column
		private String Photo ;
		@Column
		private String 	StatusP ;
		@Column
		private String Satisfaction ;
		@Column
		private String Calendar ;
		@Column
		private String password ;
		
		
		/*@OneToMany(cascade = CascadeType.ALL, mappedBy="parent")
		private Set<FeedBack> feedback ;*/
		
	  
		@OneToMany(mappedBy="parent")
		 private Set<Enfant> enfants;
		
	
		/*@OneToMany(mappedBy="parent")
		private List Enfant;
		
		*/
		




/*

		public List getEnfant() {
			return Enfant;
		}


*/




		public Set<Enfant> getEnfants() {
			return enfants;
		}







		public void setEnfants(Set<Enfant> enfants) {
			this.enfants = enfants;
		}







		public long getIdParent() {
			return idParent;
		}







		/*public List getEnfant() {
			return Enfant;
		}







		public void setEnfant(List enfant) {
			Enfant = enfant;
		}*/







		public void setIdParent(long idParent) {
			this.idParent = idParent;
		}




/*


		public void setEnfant(List enfant) {
			Enfant = enfant;
		}



*/



	
		
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


		public String getPassword() {
			return password;
		}


		public void setPassword(String password) {
			this.password = password;
		}


		public String getMailP() {
			return MailP;
		}


		public void setMailP(String mailP) {
			MailP = mailP;
		}


		public String getPhoto() {
			return Photo;
		}


		public void setPhoto(String photo) {
			Photo = photo;
		}


		public String getStatusP() {
			return StatusP;
		}


		public void setStatusP(String statusP) {
			StatusP = statusP;
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


		public Parent() {
			super();
		}
		
		
}


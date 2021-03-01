package tn.esprit.spring.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Admin   {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idadmin;
	
	private String adminname;
	private String adminlastname;
	private int number;
	
	
	private String email;

	
	@ManyToOne
	private kindergarten kindergarten;
	
	@OneToMany(mappedBy="admin")
	private List<reclamation> reclamation;
	
	

	public List<reclamation> getReclamation() {
		return reclamation;
	}


	public void setReclamation(List<reclamation> reclamation) {
		this.reclamation = reclamation;
	}


	public kindergarten getKindergarten() {
		return kindergarten;
	}


	public void setKindergarten(kindergarten kindergarten) {
		this.kindergarten = kindergarten;
	}


	public int getIdadmin() {
		return idadmin;
	}


	public void setIdadmin(int idadmin) {
		this.idadmin = idadmin;
	}


	public String getAdminname() {
		return adminname;
	}


	public void setAdminname(String adminname) {
		this.adminname = adminname;
	}


	public String getAdminlastname() {
		return adminlastname;
	}


	public void setAdminlastname(String adminlastname) {
		this.adminlastname = adminlastname;
	}


	public int getNumber() {
		return number;
	}


	public void setNumber(int number) {
		this.number = number;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}




	

	
	

	
	
}
	
	





package tn.esprit.spring.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity

public class Visitor {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idv;
	
	private String email;
	
	private String pseudov;

	@ManyToMany
	private List<kindergarten> kindergarten;
	
	public int getIdv() {
		return idv;
	}

	public List<kindergarten> getKindergarten() {
		return kindergarten;
	}

	public void setKindergarten(List<kindergarten> kindergarten) {
		this.kindergarten = kindergarten;
	}

	public void setIdv(int idv) {
		this.idv = idv;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPseudov() {
		return pseudov;
	}

	public void setPseudov(String pseudov) {
		this.pseudov = pseudov;
	}
	
	
	

	

	



	

	
	

	
	
}
	
	



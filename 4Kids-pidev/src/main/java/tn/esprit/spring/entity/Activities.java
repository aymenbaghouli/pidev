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

public class Activities {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idact;
	
	@ManyToMany
	private List<kindergarten> kindergarten;
	
	@ManyToMany
	private List<Parent> parent;
	
	public List<Parent> getParent() {
		return parent;
	}

	public void setParent(List<Parent> parent) {
		this.parent = parent;
	}

	public List<kindergarten> getKindergarten() {
		return kindergarten;
	}

	public void setKindergarten(List<kindergarten> kindergarten) {
		this.kindergarten = kindergarten;
	}

	public int getIdact() {
		return idact;
	}

	public void setIdact(int idact) {
		this.idact = idact;
	}
	
	
	
	
	



	

	
	

	
	
}
	
	



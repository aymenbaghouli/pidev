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

public class Meeting {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idmeet;
	
	private String subject;
	
	private Date date;
	
	private String description;
	
	@ManyToMany
	private List<kindergarten> kindergarten;
	
	
	

	public List<kindergarten> getKindergarten() {
		return kindergarten;
	}

	public void setKindergarten(List<kindergarten> kindergarten) {
		this.kindergarten = kindergarten;
	}

	public int getIdmeet() {
		return idmeet;
	}

	public void setIdmeet(int idmeet) {
		this.idmeet = idmeet;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	



	

	
	

	
	
}
	
	



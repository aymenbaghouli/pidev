package tn.esprit.spring.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Parent   {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idparent;
	
	private String lastname;
	private String firstname;
	private String mailp;
	private boolean isdelegate;
	
private String photo;
private String satifaction;
private String Statusp;

@ManyToMany
private List<kindergarten> kindergarten;

@ManyToMany
private List<Activities> activities;

@OneToMany(mappedBy="parent")
private List<kid> kid;

@OneToMany(mappedBy="parent")
private List<reclamation> reclamation;

public List<reclamation> getReclamation() {
	return reclamation;
}
public void setReclamation(List<reclamation> reclamation) {
	this.reclamation = reclamation;
}
public List<kid> getKid() {
	return kid;
}
public void setKid(List<kid> kid) {
	this.kid = kid;
}
public List<Activities> getActivities() {
	return activities;
}
public void setActivities(List<Activities> activities) {
	this.activities = activities;
}
public List<kindergarten> getKindergarten() {
	return kindergarten;
}
public void setKindergarten(List<kindergarten> kindergarten) {
	this.kindergarten = kindergarten;
}
public int getIdparent() {
	return idparent;
}
public void setIdparent(int idparent) {
	this.idparent = idparent;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}
public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getMailp() {
	return mailp;
}
public void setMailp(String mailp) {
	this.mailp = mailp;
}
public boolean isIsdelegate() {
	return isdelegate;
}
public void setIsdelegate(boolean isdelegate) {
	this.isdelegate = isdelegate;
}
public String getPhoto() {
	return photo;
}
public void setPhoto(String photo) {
	this.photo = photo;
}
public String getSatifaction() {
	return satifaction;
}
public void setSatifaction(String satifaction) {
	this.satifaction = satifaction;
}
public String getStatusp() {
	return Statusp;
}
public void setStatusp(String statusp) {
	Statusp = statusp;
}
	

	

	
	

	
	
}
	
	





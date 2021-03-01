package tn.esprit.spring.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class kid   {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idkid;
	
	private String lastnamek;
	private String firstnamek;
	private String classe;
	
	
private String photo;


@ManyToOne
private Parent parent;


public Parent getParent() {
	return parent;
}


public void setParent(Parent parent) {
	this.parent = parent;
}


public int getIdkid() {
	return idkid;
}


public void setIdkid(int idkid) {
	this.idkid = idkid;
}


public String getLastnamek() {
	return lastnamek;
}


public void setLastnamek(String lastnamek) {
	this.lastnamek = lastnamek;
}


public String getFirstnamek() {
	return firstnamek;
}


public void setFirstnamek(String firstnamek) {
	this.firstnamek = firstnamek;
}


public String getClasse() {
	return classe;
}


public void setClasse(String classe) {
	this.classe = classe;
}


public String getPhoto() {
	return photo;
}


public void setPhoto(String photo) {
	this.photo = photo;
}


	

	
	

	
	
}
	
	





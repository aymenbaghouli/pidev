package tn.esprit.spring.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class reclamation   {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idreclam;
	private String object;
	private String descrip;

	private Date date;
	
	@ManyToOne
	private Admin admin;
	

	@ManyToOne
	private Parent parent;

	public Parent getParent() {
		return parent;
	}

	public void setParent(Parent parent) {
		this.parent = parent;
	}

	public Admin getAdmin() {
		return admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}

	public int getIdreclam() {
		return idreclam;
	}

	public void setIdreclam(int idreclam) {
		this.idreclam = idreclam;
	}

	public String getObject() {
		return object;
	}

	public void setObject(String object) {
		this.object = object;
	}

	public String getDescrip() {
		return descrip;
	}

	public void setDescrip(String descrip) {
		this.descrip = descrip;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}


	
	







	

	
	

	
	
}
	
	





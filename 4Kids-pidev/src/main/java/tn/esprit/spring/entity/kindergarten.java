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

public class kindergarten {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String pseudo;
	
	private String email;
	
	private String Adress;
	
	private int phone;
	
	private String pic;
	
	private String description;
	
	private int nbemployees;
	
	private  Date creatDate;
	
	private String Location;
	
	private String Status;

	@OneToMany(mappedBy="kindergarten")
	private List<Admin> admin;	
	
	@ManyToMany
	private List<Meeting> meeting;
	
	@ManyToMany
	private List<Visitor> visitor;
	
	@OneToMany(mappedBy="kindergarten")
	private List<User> user;
	
	@ManyToMany
	private List<Activities> activities;
	
	@ManyToMany
	private List<Parent> parent;
	
	
	
	
	public List<Parent> getParent() {
		return parent;
	}

	public void setParent(List<Parent> parent) {
		this.parent = parent;
	}

	public List<Activities> getActivities() {
		return activities;
	}

	public void setActivities(List<Activities> activities) {
		this.activities = activities;
	}

	public List<User> getUser() {
		return user;
	}

	public void setUser(List<User> user) {
		this.user = user;
	}

	public List<Visitor> getVisitor() {
		return visitor;
	}

	public void setVisitor(List<Visitor> visitor) {
		this.visitor = visitor;
	}

	public List<Admin> getAdmin() {
		return admin;
		
		
	}

	public List<Meeting> getMeeting() {
		return meeting;
	}

	public void setMeeting(List<Meeting> meeting) {
		this.meeting = meeting;
	}

	public void setAdmin(List<Admin> admin) {
		this.admin = admin;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPseudo() {
		return pseudo;
	}

	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAdress() {
		return Adress;
	}

	public void setAdress(String adress) {
		Adress = adress;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public String getPic() {
		return pic;
	}

	public void setPic(String pic) {
		this.pic = pic;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getNbemployees() {
		return nbemployees;
	}

	public void setNbemployees(int nbemployees) {
		this.nbemployees = nbemployees;
	}

	public Date getCreatDate() {
		return creatDate;
	}

	public void setCreatDate(Date creatDate) {
		this.creatDate = creatDate;
	}

	public String getLocation() {
		return Location;
	}

	public void setLocation(String location) {
		Location = location;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}
	
	
	

	
	
}
	
	



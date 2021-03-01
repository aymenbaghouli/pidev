package tn.esprit.spring.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Comment extends Activities  {
	
private String text;
private String photo;
public String getText() {
	return text;
}
public void setText(String text) {
	this.text = text;
}
public String getPhoto() {
	return photo;
}
public void setPhoto(String photo) {
	this.photo = photo;
}
	
	
	
}
	
	





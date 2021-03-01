package tn.esprit.spring.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class Publication extends Activities  {
	
	@Column(name="typePub")
	private TypePub typePub;
	
	public enum TypePub{
		vidéo, picAt, text,sorties

	}
	
	
	
}
	
	





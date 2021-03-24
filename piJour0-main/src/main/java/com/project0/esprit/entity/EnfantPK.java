package com.project0.esprit.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class EnfantPK implements Serializable{
	private int idParent;
	private int idJardin;
	public int getIdParent() {
		return idParent;
	}
	public void setIdParent(int idParent) {
		this.idParent = idParent;
	}
	public int getIdJardin() {
		return idJardin;
	}
	public void setIdJardin(int idJardin) {
		this.idJardin = idJardin;
	}
	public EnfantPK() {
		super();
	}

}

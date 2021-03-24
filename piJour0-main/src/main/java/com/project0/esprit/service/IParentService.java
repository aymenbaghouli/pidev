package com.project0.esprit.service;

import com.project0.esprit.entity.Enfant;
import com.project0.esprit.entity.Parent;

public interface IParentService {
	Parent add(Parent parent);
	Enfant affectToParent(Enfant f , int  p);
	Iterable<Parent> findALL() ;
	public Parent findONE(long id);
	//Parent find(Long id);
	Parent Update(long idParent,String name,String prenom,String MailP);
	
	void deleteById (Long idParent);
}

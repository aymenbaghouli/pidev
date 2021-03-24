package com.project0.esprit.service;

import com.project0.esprit.entity.Enfant;
import com.project0.esprit.entity.Jardin;

public interface IJardinService {
	Enfant affectEnfantTojardin(Enfant f , int  j,int p);

}

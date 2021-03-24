package com.project0.esprit.service;

import com.project0.esprit.entity.Enfant;

public interface IEnfantService {
	Enfant add(Enfant enfant);
	//Enfant find(Long id);
	Enfant Update(Enfant enfant);
	void Delete(long id);

}

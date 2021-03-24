package com.project0.esprit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project0.esprit.entity.Enfant;
import com.project0.esprit.repository.EnfantRepository;



@Service
public class EnfantService implements IEnfantService{
    
	@Autowired
	EnfantRepository enfantRepository;

	@Override
	public Enfant add(Enfant enfant) {
		return enfantRepository.save(enfant);
	}

	/*@Override
	public Enfant find(Long id) {
		
		return enfantRepository.findOne(id);
	}*/

	@Override
	public Enfant Update(Enfant enfant) {
		
		return null;
	}

	@Override
	public void Delete(long id) {

		enfantRepository.deleteById(id);
	}

	




}

package com.project0.esprit.service;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project0.esprit.entity.Enfant;
import com.project0.esprit.entity.Jardin;
import com.project0.esprit.repository.EnfantRepository;
import com.project0.esprit.repository.JardinRepository;
import com.project0.esprit.repository.ParentRepository;

@Service
public class JardinService implements IJardinService {
	@Autowired
	JardinRepository jardinRepository;
    @Autowired
    EnfantRepository enfrepo;
    @Autowired
	ParentRepository parentRepository;
	//@Autowired
	//Repository Repository;
	@Override
	public Enfant affectEnfantTojardin(Enfant f, int j,int p) {
		// TODO Auto-generated method stub
		Set<Enfant> js = (Set<Enfant>) enfrepo.getEnfantByIdJardin(j,p);
		jardinRepository.findById( (long) j).map(i->{
			
			i.setEnfants(js);
			f.setParent(i);
			
			return jardinRepository.save(i);
		//return null;
});
	parentRepository.findById( (long) p).map(i->{
			
			i.setEnfants(js);
			f.setParent(i);
			
			return parentRepository.save(i);
			
			
			
		});
		enfrepo.save(f);
		
		
		
		
		
		
		
		   
		// TODO Auto-generated method stub
		return null;
	}

}

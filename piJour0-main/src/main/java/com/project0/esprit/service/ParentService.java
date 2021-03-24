package com.project0.esprit.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project0.esprit.entity.Enfant;
import com.project0.esprit.entity.Parent;
import com.project0.esprit.repository.EnfantRepository;
import com.project0.esprit.repository.ParentRepository;



@Service
public class ParentService implements IParentService {

	@Autowired
	ParentRepository parentRepository;
    @Autowired
    EnfantRepository enfrepo;
	
	@Override
	public Parent add(Parent parent) {
		return parentRepository.save(parent);
	}
	@Override
	public Iterable<Parent> findALL() {
		
		return parentRepository.findAll();
	}
	
	@Override
	public Parent findONE(long id) {
		
		return parentRepository.findById(id).get();
	}
	
	@Override
	public Parent Update(long idParent, String name, String prenom, String MailP) {
		Parent p1 = this.findONE(idParent);
		p1.setNom(name);
		p1.setPrenom(prenom);
		 p1.setMailP(MailP);   p1.setMailP(MailP);  
		return parentRepository.save(p1) ;
	}

	@Override
	public void deleteById(Long idParent) {
		// TODO Auto-generated method stub
		parentRepository.deleteById(idParent);
	}
	@Override
	public Enfant affectToParent(Enfant f, int p) {
		
		/*Set<Enfant> fs = null ;
		enfrepo.save(f);
		 fs.add(f);
	      p.setEnfants(fs);*/
		
		Set<Enfant> fs = (Set<Enfant>) enfrepo.getEnfantByIdPrent(p);
		parentRepository.findById( (long) p).map(i->{
			
			i.setEnfants(fs);
			f.setParent(i);
			
			return parentRepository.save(i);
			
			
			
		});
		
		enfrepo.save(f);
		
		
		
		
		
		
		
		   
		// TODO Auto-generated method stub
		return null;
	}

	

	

	

	


	
	
}

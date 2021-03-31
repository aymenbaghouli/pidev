package tn.esprit.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



import antlr.collections.List;
import tn.esprit.spring.entities.Bus;

@Repository 
public interface busrepo extends CrudRepository<Bus, Integer>{
	
	

	java.util.List<Bus> findByAdresse(String adresse);

	
	
	}

	
	



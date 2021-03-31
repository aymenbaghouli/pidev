package tn.esprit.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import tn.esprit.spring.entities.Publication;
import tn.esprit.spring.entities.forum;



@Repository
public interface PublicationRepository extends CrudRepository<Publication, Long>  {
	
	 
	
	@Query("select p from Publication p where p.text= :text ")
	public List<Publication> findPub(@Param("text") String text );
	@Query("select p from Publication p order by DatePub desc")
	public List<Publication> triByDate();
   
    
    
    
    
    
    
  
	
    		
   

}

package tn.esprit.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import tn.esprit.spring.entities.categorie;
import tn.esprit.spring.entities.forum;

/*TO_COMPLETE*/
@Repository
public interface CategorieRepository extends CrudRepository<categorie, Long>  {
	
	@Query("SELECT  count (DISTINCT categorie) FROM forum ")
    public int coutforum();
	
	@Query("select c from categorie c where c.NomCat= :NomCat")
	public categorie findcategorieByNom(@Param("NomCat") String NomCat );
    
   
    
    
    
    
    
    
  
	
    		
   

}

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
public interface ForumRepository extends CrudRepository<forum, Long>/*TO_COMPLETE*/  {
	
	@Query("select c from forum c where c.categorie= :categorie")
	public List<forum> findchildByKinder(@Param("categorie") categorie categorie );
	
	@Query("select c from categorie c where c.NomCat= :NomCat")
	public categorie findcategorieByNom(@Param("NomCat") String NomCat );
	
	
	@Query("select f from forum f where f.title= :text or f.description= :text")
	public List<forum> findForumByAll(@Param("text") String text );
	
	@Query("select f from forum f order by CreateDate desc")
	public List<forum> triByDate();
	
	

}

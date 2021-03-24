package com.project0.esprit.repository;

import java.util.Set;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.project0.esprit.entity.Enfant;

@Repository
public interface EnfantRepository extends CrudRepository<Enfant, Long> {

		@Query("select a from Enfant a where id_parent =?1 ")
		
		  Set<Enfant> getEnfantByIdPrent(@Param("id_parent") int id);
		
		
		@Query("select a from Enfant a where id_jardin =?1 and id_parent =?1 ")
		
		
		  Set<Enfant> getEnfantByIdJardin(@Param("id_jardin") int idf,@Param("id_parent") int idp);
	}



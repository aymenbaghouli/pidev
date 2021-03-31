package tn.esprit.spring.repository;

import java.awt.print.Pageable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import tn.esprit.spring.entities.Meetjardin;



public interface meetjarrepo  extends CrudRepository<Meetjardin, Integer> {

	

	

	


}
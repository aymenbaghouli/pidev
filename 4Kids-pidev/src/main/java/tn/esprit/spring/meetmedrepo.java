package tn.esprit.spring.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import tn.esprit.spring.entities.Meetmedecin;




public interface meetmedrepo extends CrudRepository<Meetmedecin, Integer> {

	List<Meetmedecin> findByDatemeet(String datemeet);

}

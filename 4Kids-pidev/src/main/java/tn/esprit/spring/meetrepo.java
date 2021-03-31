package tn.esprit.spring.repository;

import org.springframework.data.repository.CrudRepository;

import tn.esprit.spring.entities.Meeting;




public interface meetrepo  extends CrudRepository<Meeting, Integer> {

}

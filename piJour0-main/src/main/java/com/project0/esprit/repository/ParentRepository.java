package com.project0.esprit.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.project0.esprit.entity.Parent;

@Repository
public interface ParentRepository extends CrudRepository<Parent, Long> {

	// public Parent findNameParent(String Name);
}

package com.project0.esprit.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.project0.esprit.entity.Parent;

@Repository
public interface JardinRepository extends CrudRepository<Parent, Long> {

}

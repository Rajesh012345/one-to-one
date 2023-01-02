package com.example.demo.repository;



import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Persons;

public interface Persons_repository extends CrudRepository<Persons, Integer > {
	
	

}

package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Persons;
import com.example.demo.repository.Persons_repository;
@Service
public class Personsservice {
	@Autowired
	private Persons_repository pr;
	
	
	
	public void saveOrUpdate(Persons data) {
	    pr.save(data);			
		
	}


	public List<Persons> findAll() {
		return ( List<Persons>) pr.findAll();
	}
//
	public Optional < Persons> findByid(Integer id) {
		
		return    pr.findById(id)  ;
	}
//

}

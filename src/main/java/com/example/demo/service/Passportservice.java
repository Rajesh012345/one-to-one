package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Passport;
import com.example.demo.repository.Passport_repo;
@Service
public class Passportservice {

	@Autowired
	private Passport_repo ps;
	
	
	
	public List<Passport> findAll() {
		return ( List<Passport>) ps.findAll();
		

	}

	public Optional<Passport> findByid(int id) {
		
		return   ps.findById(id)  ;
	}

	public void saveOrUpdate(Passport data) {

	    ps.save(data);		
	}
}
//




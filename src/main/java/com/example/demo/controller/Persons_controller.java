package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Persons;
import com.example.demo.service.Personsservice;

@RestController
public class Persons_controller {

	@Autowired
	Personsservice ps;
	
	@PostMapping("/createe")  
	private int savedata(@RequestBody Persons data)   
	{  
	ps.saveOrUpdate(data);  
	return data.getId();                                     
	}
	
	@GetMapping("/person1")  
	private List<Persons> findAll()   
	{  
	return ps.findAll();
	}  

	@GetMapping("/person/{id}")  
	private Optional <Persons> optional(@PathVariable("id") int id)   
	{  
	return ps.findByid(id);  

	}
	
	
	
	
	
	
	
}

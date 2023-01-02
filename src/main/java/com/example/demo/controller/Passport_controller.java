package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Passport;
import com.example.demo.service.Passportservice;
import com.example.demo.service.Personsservice;


@RestController
public class Passport_controller {

	@Autowired
	Passportservice pas;
	@Autowired
	Personsservice p;
	
	
	@PostMapping("/pass")  
	private int savedata(@RequestBody Passport data)   
	{  
	pas.saveOrUpdate(data);  
	return data.getP_id();                                     
	}
	
	@GetMapping("/pasget")  
	private List<Passport> findAll()   
	{  
	return pas.findAll();
	}  

	@GetMapping("/passport/{id}")  
	private Optional <Passport> optional(@PathVariable("id") int id)   
	{  
	return pas.findByid(id);  

	}
}
	
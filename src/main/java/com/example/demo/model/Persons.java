package com.example.demo.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="persons")
public class Persons {

	
	@Id
	@Column(name="id")
	private int id;
	@Column(name="name")
	private String name;
	@Column(name="p_id")
	private int p_id;
	
	@OneToOne(cascade=CascadeType.ALL,fetch = FetchType.EAGER)
	//@JoinColumn(name = "p_id", nullable = false)
    private Passport passport  ;

	public int getId() {
		return id;
	}

	public Persons() {
		
	}
	
	
	
	public Persons(int id, String name, int p_id, Passport passport) {        //, Passport passport
		super();
		this.id = id;
		this.name = name;
		this.p_id = p_id;
		this.passport = passport;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getP_id() {
		return p_id;
	}

	public void setP_id(int p_id) {
		this.p_id = p_id;
	}

	public Passport getPassport() {
		return passport;
	}

	public void setPassport(Passport passport) {
		this.passport = passport;
	}
	
	
	
	
}

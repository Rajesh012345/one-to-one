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
@Table(name="passport")
public class Passport {

	
	@Id
	@Column(name="p_id")
	private int p_id;
	@Column(name="pass_no")                //                comited to git
	private int pass_no;

	
	@OneToOne(cascade=CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinColumn(name = "p_id", nullable = false)
	private Persons persons  ;


//	@Override
//	public String toString() {
//		return "Passport [p_id=" + p_id + ", pass_no=" + pass_no + ", persons=" + persons + "]";
//	}


	public Passport(int p_id, int pass_no, Persons persons) {
		super();
		this.p_id = p_id;
		this.pass_no = pass_no;
		this.persons = persons;
	}


	public Passport() 
	{
	}


	public int getP_id() {
		return p_id;
	}


	public void setP_id(int p_id) {
		this.p_id = p_id;
	}


	public int getPass_no() {
		return pass_no;
	}


	public void setPass_no(int pass_no) {
		this.pass_no = pass_no;
	}


	public Persons getPersons() {
		return persons;
	}


	public void setPersons(Persons persons) {
		this.persons = persons;
	}
	
}
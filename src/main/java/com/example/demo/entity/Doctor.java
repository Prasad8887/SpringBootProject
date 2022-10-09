package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Doctor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Doctor_id")
	private int Doctor_id;
	@Column(name="Doctor_name")
	private String Doctor_name;
	@Column(name="Doctor_designation")
	private String Doctor_designation;
	@Column(name="Doctor_degree")
	private String Doctor_degree;
	@Column(name="Doctor_experience")
	private int Doctor_experience;
	@Column(name="Doctor_address")
	private String Doctor_address;
	@Column(name="Doctor_email_id")
	private String Doctor_email_id;
	@Column(name="Doctor_contact_number")
	private long Doctor_contact_number;

	public Doctor() 
	{
		
	}

	public Doctor(int doctor_id, String doctor_name, String doctor_designation, String doctor_degree,
			int doctor_experience, String doctor_address, String doctor_email_id, long doctor_contact_number) {
		super();
		Doctor_id = doctor_id;
		Doctor_name = doctor_name;
		Doctor_designation = doctor_designation;
		Doctor_degree = doctor_degree;
		Doctor_experience = doctor_experience;
		Doctor_address = doctor_address;
		Doctor_email_id = doctor_email_id;
		Doctor_contact_number = doctor_contact_number;
	}

	public int getDoctor_id() {
		return Doctor_id;
	}

	public void setDoctor_id(int doctor_id) {
		Doctor_id = doctor_id;
	}

	public String getDoctor_name() {
		return Doctor_name;
	}

	public void setDoctor_name(String doctor_name) {
		Doctor_name = doctor_name;
	}

	public String getDoctor_designation() {
		return Doctor_designation;
	}

	public void setDoctor_designation(String doctor_designation) {
		Doctor_designation = doctor_designation;
	}

	public String getDoctor_degree() {
		return Doctor_degree;
	}

	public void setDoctor_degree(String doctor_degree) {
		Doctor_degree = doctor_degree;
	}

	public int getDoctor_experience() {
		return Doctor_experience;
	}

	public void setDoctor_experience(int doctor_experience) {
		Doctor_experience = doctor_experience;
	}

	public String getDoctor_address() {
		return Doctor_address;
	}

	public void setDoctor_address(String doctor_address) {
		Doctor_address = doctor_address;
	}

	public String getDoctor_email_id() {
		return Doctor_email_id;
	}

	public void setDoctor_email_id(String doctor_email_id) {
		Doctor_email_id = doctor_email_id;
	}

	public long getDoctor_contact_number() {
		return Doctor_contact_number;
	}

	public void setDoctor_contact_number(long doctor_contact_number) {
		Doctor_contact_number = doctor_contact_number;
	}

	
}
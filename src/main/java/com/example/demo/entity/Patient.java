
package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="patient")
public class Patient 
{
	
	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="patient_id")
	private int patient_id;
	@Column(name="patient_name")
	private String patient_name;
	@Column(name="patient_address")
	private String patient_address;
	@Column(name="patient_gender")
	private String patient_gender;
	@Column(name="patient_disease")
	private String patient_disease;
	@Column(name="patient_email_id")
	private String patient_email_id;
	@Column(name="patient_contact_number")
	private long patient_contact_number;
	
	public Patient()
	{
		
	}
	public Patient(int patient_id, String patient_name, String patient_address, String patient_gender,
			String patient_disease, String patient_email_id, long patient_contact_number) {
		super();
		this.patient_id = patient_id;
		this.patient_name = patient_name;
		this.patient_address = patient_address;
		this.patient_gender = patient_gender;
		this.patient_disease = patient_disease;
		this.patient_email_id = patient_email_id;
		this.patient_contact_number = patient_contact_number;
	}

	public int getPatient_id() {
		return patient_id;
	}

	public void setPatient_id(int patient_id) {
		this.patient_id = patient_id;
	}

	public String getPatient_name() {
		return patient_name;
	}

	public void setPatient_name(String patient_name) {
		this.patient_name = patient_name;
	}

	public String getPatient_address() {
		return patient_address;
	}

	public void setPatient_address(String patient_address) {
		this.patient_address = patient_address;
	}

	public String getPatient_gender() {
		return patient_gender;
	}

	public void setPatient_gender(String patient_gender) {
		this.patient_gender = patient_gender;
	}

	public String getPatient_disease() {
		return patient_disease;
	}

	public void setPatient_disease(String patient_disease) {
		this.patient_disease = patient_disease;
	}

	public String getPatient_email_id() {
		return patient_email_id;
	}

	public void setPpatient_email_id(String patient_email_id) {
		this.patient_email_id = patient_email_id;
	}

	public long getPatient_contact_number() {
		return patient_contact_number;
	}

	public void setPatient_contact_number(long patient_contact_number) {
		this.patient_contact_number = patient_contact_number;
	}
	
	
	}	


package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Doctor;

public interface DoctorService 
{
	public List<Doctor>findAll();
	public Doctor findById (int Doctor_id);
	public void saveorUpdate(Doctor d);
	public void delete(int Doctor_id);
}

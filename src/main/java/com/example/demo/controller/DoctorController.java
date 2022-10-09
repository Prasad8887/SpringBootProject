package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Doctor;
import com.example.demo.service.DoctorService;

@RestController
@RequestMapping("/doctor")
public class DoctorController 
{

	@Autowired
	DoctorService service;
	@GetMapping("/list")
	public List<Doctor> listDoctor()
	{
		return service.findAll();
		
	}
	@GetMapping("/findbyid/{Doctor_id}")
	public Doctor findById(@PathVariable int Doctor_id)
	{
		return service.findById(Doctor_id);
	}

	@PostMapping("/save")
    public Doctor save(@RequestBody Doctor e)
    {
    	e.setDoctor_id(0);
		service.saveorUpdate(e);
    	return e;
    }

	@PutMapping("/update")
    public Doctor update(@RequestBody Doctor e)
    {
    	
		service.saveorUpdate(e);
    	return e;
		
	}
	@DeleteMapping("/delete/{Doctor_id}")
    public String delete(@PathVariable int Doctor_id)
    {
		Doctor e=findById(Doctor_id);
    	if(e==null)
    	{throw new RuntimeException("delete id not found");
    	}
    	else
    	{
    	service.delete(Doctor_id);
    	}
    	return "doctor_id"+Doctor_id;
    	
    }
}

package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Service.DoctorService;
import com.example.entity.Doctor;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping("/api/doctor")
public class DoctorController {

	@Autowired
	private DoctorService doctorService;
	
	@PostMapping("/adddoctor")
	public Doctor addDoctor(@RequestBody Doctor doctor) {
		
		return doctorService.addDoctor(doctor);
	}
	
	@GetMapping("/{id}")
	public Doctor singleDoctor(@PathVariable Long id) {
		return doctorService.singleDoctor(id);
	}
	
}

package com.example.controller;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.Service.AppointmentService;
import com.example.entity.Appointment;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api/appointment")
public class AppointmentController {

	@Autowired
	private AppointmentService appointmentService;
	
	@PostMapping("/addappointment")
	public Appointment createappointment(@RequestParam Long userId, @RequestParam Long doctorId,@RequestParam LocalDateTime appointmentDate) {
		
		return appointmentService.createappointment(userId,doctorId,appointmentDate);
	}
	
}

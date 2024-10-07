package com.example.Service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Appointment;
import com.example.entity.Doctor;
import com.example.entity.User;
import com.example.repository.AppointmentRepository;
import com.example.repository.DoctorRepository;
import com.example.repository.UserRepository;

@Service
public class AppointmentService {

	@Autowired
	private AppointmentRepository appointmentRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private DoctorRepository doctorRepository;

	public Appointment createappointment(Long userId, Long doctorId, LocalDateTime appointmentDate) {
		User user = userRepository.findById(userId).orElse(null);
		Doctor doctor = doctorRepository.findById(doctorId).orElse(null);
		
		Appointment appointment = new Appointment();
		appointment.setUser(user);
		appointment.setDoctor(doctor);
		appointment.setAppointmentDate(appointmentDate);
		appointment.setStatus("pending");
		
		return appointmentRepository.save(appointment);
	}
}

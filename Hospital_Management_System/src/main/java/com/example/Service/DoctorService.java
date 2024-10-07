package com.example.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Doctor;
import com.example.repository.DoctorRepository;

@Service
public class DoctorService {

	@Autowired
	private DoctorRepository doctorRepository;

	public Doctor addDoctor(Doctor doctor) {
		return doctorRepository.save(doctor);
	}

	public Doctor singleDoctor(Long id) {
		return doctorRepository.findById(id).orElse(null);
	};
}

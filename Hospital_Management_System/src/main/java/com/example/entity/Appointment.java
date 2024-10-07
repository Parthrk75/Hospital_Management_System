package com.example.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Appointment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;

	@ManyToOne
	@JoinColumn(name = "doctor_id")
	private Doctor doctor;

	private LocalDateTime appointmentDate;
	private String status; // e.g., pending, confirmed, canceled

	public Appointment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Appointment(Long id, User user, Doctor doctor, LocalDateTime appointmentDate, String status) {
		super();
		this.id = id;
		this.user = user;
		this.doctor = doctor;
		this.appointmentDate = appointmentDate;
		this.status = status;
	}

	public Appointment(User user, Doctor doctor, LocalDateTime appointmentDate, String status) {
		super();
		this.user = user;
		this.doctor = doctor;
		this.appointmentDate = appointmentDate;
		this.status = status;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	public LocalDateTime getAppointmentDate() {
		return appointmentDate;
	}

	public void setAppointmentDate(LocalDateTime appointmentDate) {
		this.appointmentDate = appointmentDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Appointment [id=" + id + ", user=" + user + ", doctor=" + doctor + ", appointmentDate="
				+ appointmentDate + ", status=" + status + "]";
	}

	// Getters and setters
}
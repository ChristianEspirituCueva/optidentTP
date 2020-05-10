package com.acme.optident.service;

import com.acme.optident.model.Appointment;
import com.acme.optident.repository.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;


public class AppointmentServiceImpl implements AppointmentService{

    @Autowired
    private AppointmentRepository appointmentRepository;

    @Override
    public Page<Appointment> getAllAppointment(Pageable pageable) { return appointmentRepository.findAll(pageable); }

    @Override
    public Appointment createAppointment(Appointment appointment) {
        return appointmentRepository.save(appointment);
    }

    @Override
    public Appointment updateAppointment(Long appointmentId, Appointment appointmentDetails) {
        return appointmentRepository.findById(appointmentId).map(appointment -> {
            appointment.setName(appointmentDetails.getName());
            return appointmentRepository.save(appointment);
        }).orElseThrow(() -> new ResourceNotFoundException("Tag", "Id", appointmentId));
    }

    @Override
    public ResponseEntity<?> deleteTag(Long appointmentId) {
        return appointmentRepository.findById(appointmentId).map(appointment -> {
            appointmentRepository.delete(appointment);
            return ResponseEntity.ok().build();
        }).orElseThrow(() -> new ResourceNotFoundException("Tag", "Id", appointmentId));
    }
}
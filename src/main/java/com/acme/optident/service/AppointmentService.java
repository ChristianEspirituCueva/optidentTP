package com.acme.optident.service;

import com.acme.optident.model.Appointment;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;

public interface AppointmentService {
    Page<Appointment> getAllAppointments(Pageable pageable);
    Appointment createAppointment(Long appointment);
    Appointment updateAppointment(Long appointmentId, Appointment appointmentDetails);
    ResponseEntity<?> deleteAppointment(Long postId, Long commentId);
}


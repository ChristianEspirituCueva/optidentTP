package com.acme.optident.service;

import com.acme.optident.model.Appointment;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;

public interface AppointmentService {
    Page<Appointment> getAllAppointmentsByPostId(Long postId, Pageable pageable);
    Appointment getAppointmentByIdAndPostId(Long postId, Long commentId);
    Appointment createAppointment(Long postId, Appointment comment);
    Appointment updateAppointment(Long postId, Long commentId, Appointment commentDetails);
    ResponseEntity<?> deleteAppointment(Long postId, Long commentId);
}


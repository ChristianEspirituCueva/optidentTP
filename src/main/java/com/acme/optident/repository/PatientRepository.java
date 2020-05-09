package com.acme.optident.repository;

import com.acme.optident.model.Headquarter;
import com.acme.optident.model.Patient;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PatientRepository extends JpaRepository<Patient,Long> {
    Page<Patient> findByAppointmentId(Long appointmentId, Pageable pageable);
    Optional<Patient> findByIdAndAppointmentId(Long id, Long appointmentId);
}
package com.acme.optident.repository;

import com.acme.optident.model.Headquarter;
import com.acme.optident.model.Specialty;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SpecialityRepository extends JpaRepository<Specialty,Long> {
    Page<Specialty> findByAppointmentId(Long appointmentId, Pageable pageable);
    Optional<Specialty> findByIdAndAppointmentId(Long id, Long appointmentId);
}

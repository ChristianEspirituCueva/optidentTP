package com.acme.optident.repository;

import com.acme.optident.model.ClinicHistory;
import com.acme.optident.model.DatingDetails;
import com.acme.optident.model.Dentist;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface DatingDetailRepository extends JpaRepository<Dentist,Long> {
    Page<DatingDetails> findByAppointmentId(Long appointmentId, Pageable pageable);

    Optional<DatingDetails> findByIdAndAppointmentId(Long id, Long appointmentId);
}

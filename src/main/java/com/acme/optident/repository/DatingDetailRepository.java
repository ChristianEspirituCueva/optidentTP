package com.acme.optident.repository;

import com.acme.optident.model.DatingDetail;
import com.acme.optident.model.Dentist;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface DatingDetailRepository extends JpaRepository<Dentist,Long> {
    Page<DatingDetail> findByAppointmentId(Long appointmentId, Pageable pageable);

    Optional<DatingDetail> findByIdAndAppointmentId(Long id, Long appointmentId);
}

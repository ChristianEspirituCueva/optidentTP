package com.acme.optident.repository;

import com.acme.optident.model.District;
import com.acme.optident.model.Headquarter;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface HeadquearterRepository  extends JpaRepository<Headquarter, Long> {
    Page<Headquarter> findByClinicId(Long HeadqueartersId, Pageable pageable);

    Optional<Headquarter> findByIdAndClinicsId(Long id, Long ClinicId);
}
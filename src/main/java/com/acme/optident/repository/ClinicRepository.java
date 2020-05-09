package com.acme.optident.repository;

import com.acme.optident.model.Clinic;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClinicRepository extends JpaRepository<Clinic,Long> {
}

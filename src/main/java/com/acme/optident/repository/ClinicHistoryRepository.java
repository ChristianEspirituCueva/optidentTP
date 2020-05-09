package com.acme.optident.repository;

import com.acme.optident.model.ClinicHistory;
import com.acme.optident.model.Headquarter;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ClinicHistoryRepository extends JpaRepository<ClinicHistory,Long> {
    Page<ClinicHistory> findByPatientId(Long PatientId, Pageable pageable);

    Optional<ClinicHistory> findByIdAndPatientsId(Long id, Long PatientId);
}

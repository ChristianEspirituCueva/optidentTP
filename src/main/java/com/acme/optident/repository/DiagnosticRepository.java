package com.acme.optident.repository;

import com.acme.optident.model.Diagnostic;
import com.acme.optident.model.Headquarter;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface DiagnosticRepository extends JpaRepository<Diagnostic,Long> {
    Page<Diagnostic> findByDatingDetailsId(Long DatingDetailsId, Pageable pageable);
    Optional<Diagnostic> findByIdAndDatingDetailsId(Long id, Long DatingDetails);
}

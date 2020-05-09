package com.acme.optident.repository;

import com.acme.optident.model.District;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface DistricRepository extends JpaRepository<District, Long> {
    Page<District> findByHeadqueartersId(Long HeadqueartersId, Pageable pageable);
    Optional<District> findByIdAndHeadqueartersId(Long id, Long HeadqueartersId);

}


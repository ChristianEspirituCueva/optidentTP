package com.acme.optident.repository;

import com.acme.optident.model.Dentist;
import com.acme.optident.model.Headquarter;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface DentiscRepository extends JpaRepository<Dentist,Long> {

}

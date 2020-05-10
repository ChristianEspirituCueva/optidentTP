package com.acme.optident.service;

import com.acme.optident.model.Dentist;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;

public interface DentistService {
    Page<Dentist> getAllDentist(Pageable pageable);
    Dentist createDentist(Long dentist);
    Dentist updateDentist(Long dentistId, Dentist dentistDetails);
    ResponseEntity<?> deleteDentist(Long dentistId);
}

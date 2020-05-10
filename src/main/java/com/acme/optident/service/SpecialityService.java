package com.acme.optident.service;

import com.acme.optident.model.Specialty;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;

public interface SpecialityService {
    Page<Specialty> getAllSpecialities(Pageable pageable);
    Specialty createSpeciality(Long Speciality);
    Specialty updateSpeciality(Long SpecialityId, Specialty SpecialityDetails);
    ResponseEntity<?> deleteSpeciality(Long SpecialityId);

}

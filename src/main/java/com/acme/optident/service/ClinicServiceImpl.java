package com.acme.optident.service;

import com.acme.optident.exception.ResourceNotFoundException;
import com.acme.optident.model.Clinic;
import com.acme.optident.model.ClinicHistory;
import com.acme.optident.repository.ClinicHistoryRepository;
import com.acme.optident.repository.ClinicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;

public class ClinicServiceImpl implements ClinicHistoryService{
    @Autowired
    private ClinicRepository clinicRepository;

    @Override
    public Page<Clinic> getAllClinic(Pageable pageable) { return clinicRepository.findAll(pageable); }

    @Override
    public Clinic createClinic(Clinic clinic) {
        return clinicRepository.save(clinic);
    }

    @Override
    public Clinic updateClinicHistory(Long clinicId, Clinic clinicDetails) {
        return clinicRepository.findById(clinicId).map(clinic -> {
            clinic.setName(clinicDetails.getName());
            return clinicRepository.save(clinic);
        }).orElseThrow(() -> new ResourceNotFoundException("Tag", "Id", clinicId));
    }

    @Override
    public ResponseEntity<?> deleteTag(Long clinicId) {
        return clinicRepository.findById(clinicId).map(clinic -> {
            clinicRepository.delete(clinic);
            return ResponseEntity.ok().build();
        }).orElseThrow(() -> new ResourceNotFoundException("Tag", "Id", clinicId));
    }
}

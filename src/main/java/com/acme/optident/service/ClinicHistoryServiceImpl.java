package com.acme.optident.service;

import com.acme.optident.exception.ResourceNotFoundException;
import com.acme.optident.model.Appointment;
import com.acme.optident.model.ClinicHistory;
import com.acme.optident.repository.AppointmentRepository;
import com.acme.optident.repository.ClinicHistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;

public class ClinicHistoryServiceImpl implements ClinicHistoryService{
    @Autowired
    private ClinicHistoryRepository clinicHistoryRepository;

    @Override
    public Page<ClinicHistory> getAllClinicHistory(Pageable pageable) { return clinicHistoryRepository.findAll(pageable); }

    @Override
    public ClinicHistory createClinicHistory(ClinicHistory clinicHistory) {
        return clinicHistoryRepository.save(clinicHistory);
    }

    @Override
    public ClinicHistory updateClinicHistory(Long clinicHistoryId, ClinicHistory clinicHistoryDetails) {
        return clinicHistoryRepository.findById(clinicHistoryId).map(clinicHistory -> {
            clinicHistory.setName(clinicHistoryDetails.getName());
            return clinicHistoryRepository.save(clinicHistory);
        }).orElseThrow(() -> new ResourceNotFoundException("Tag", "Id", clinicHistoryId));
    }

    @Override
    public ResponseEntity<?> deleteTag(Long clinicHistoryId) {
        return clinicHistoryRepository.findById(clinicHistoryId).map(clinicHistory -> {
            clinicHistoryRepository.delete(clinicHistory);
            return ResponseEntity.ok().build();
        }).orElseThrow(() -> new ResourceNotFoundException("Tag", "Id", clinicHistoryId));
    }
}

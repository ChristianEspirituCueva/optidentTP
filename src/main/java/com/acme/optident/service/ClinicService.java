package com.acme.optident.service;

import com.acme.optident.model.Appointment;
import com.acme.optident.model.Clinic;
import com.acme.optident.model.ClinicHistory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;

public interface ClinicService {
    Page<Clinic> getAllClinicHistories(Pageable pageable);
    Clinic createClinicHistory(Long clinic);
    Clinic updateClinicHistory(Long clinicId, Clinic clinicHistoryDetails);
    ResponseEntity<?> deleteClinic(Long clinicId);
}
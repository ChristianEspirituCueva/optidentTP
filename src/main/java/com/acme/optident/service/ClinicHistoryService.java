package com.acme.optident.service;

import com.acme.optident.model.Appointment;
import com.acme.optident.model.ClinicHistory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;

public interface ClinicHistoryService {

    Page<ClinicHistory> getAllClinicHistories(Pageable pageable);
    ClinicHistory createClinicHistory(Long clinicHistory);
    ClinicHistory updateClinicHistory(Long clinicHistoryId, ClinicHistory clinicHistoryDetails);
    ResponseEntity<?> deleteClinicHistory(Long clinicHistoryId);
}

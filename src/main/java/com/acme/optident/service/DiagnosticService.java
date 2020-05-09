package com.acme.optident.service;

import com.acme.optident.model.ClinicHistory;
import com.acme.optident.model.Diagnostic;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;

public interface DiagnosticService {
//CORREGIR
    Page<ClinicHistory> getAllClinicHistories(Pageable pageable);
    ClinicHistory createClinicHistory(Long clinicHistoryId);
    ClinicHistory updateClinicHistory(Long clinicHistoryId, ClinicHistory clinicHistoryDetails);
    ResponseEntity<?> deleteClinicHistory(Long clinicHistoryId);
}

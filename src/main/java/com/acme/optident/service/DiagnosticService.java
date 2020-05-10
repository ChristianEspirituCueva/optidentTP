package com.acme.optident.service;

import com.acme.optident.model.Appointment;
import com.acme.optident.model.ClinicHistory;
import com.acme.optident.model.Diagnostic;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;

public interface DiagnosticService {
//CORREGIR
    Page<Diagnostic> getAllDiagnostics(Pageable pageable);
    Diagnostic createDiagnostic(Long Diagnostic);
    Diagnostic updateDiagnostic(Long DiagnosticId, Diagnostic DiagnosticDetails);
    ResponseEntity<?> deleteDiagnostic(Long DiagnosticId);



}

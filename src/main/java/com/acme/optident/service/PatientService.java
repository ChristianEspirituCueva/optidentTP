package com.acme.optident.service;

import com.acme.optident.model.Patient;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;

public interface PatientService {
    Page<Patient> getPatients(Pageable pageable);
    Patient createPatient(Long Patient);
    Patient updatePatient(Long PatientId, Patient PatientDetails);
    ResponseEntity<?> deletePatient(Long PatientId);

}

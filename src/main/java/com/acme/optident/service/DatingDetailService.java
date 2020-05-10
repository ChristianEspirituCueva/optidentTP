package com.acme.optident.service;

import com.acme.optident.model.DatingDetail;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;

public interface DatingDetailService {
    Page<DatingDetail> getAllDatingDetails(Pageable pageable);
    DatingDetail createClinicHistory(Long datingDetails);
    DatingDetail updateClinicHistory(Long datingDetailsId, DatingDetail datingDetailsDetail);
    ResponseEntity<?> deleteClinic(Long datingDetailsId);
}

package com.acme.optident.service;

import com.acme.optident.model.Diagnostic;
import com.acme.optident.model.District;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;

public interface DistrictService {
    Page<District> getDistricts(Pageable pageable);
    District createDistrict(Long District);
    District updateDistrict(Long DistrictId, District DistrictDetails);
    ResponseEntity<?> deleteDistrict(Long DistrictId);

}

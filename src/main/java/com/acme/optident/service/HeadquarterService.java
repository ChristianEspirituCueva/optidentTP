package com.acme.optident.service;

import com.acme.optident.model.District;
import com.acme.optident.model.Headquarter;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;

public interface HeadquarterService {
    Page<Headquarter> getAllHeadquarters(Pageable pageable);
    Headquarter createHeadquarter(Long Headquarter);
    Headquarter updateHeadquarter(Long HeadquarterId, Headquarter HeadquarterDetails);
    ResponseEntity<?> deleteHeadquarter(Long HeadquarterId);

}

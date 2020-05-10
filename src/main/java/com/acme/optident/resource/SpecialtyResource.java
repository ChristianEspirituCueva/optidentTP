package com.acme.optident.resource;

import com.acme.optident.model.AuditModel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SpecialtyResource extends AuditModel {
    private Long id;
    private String speciality;
}

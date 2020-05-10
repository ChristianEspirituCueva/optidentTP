package com.acme.optident.resource;

import com.acme.optident.model.AuditModel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DiagnosticResource extends AuditModel {
    private long id;
    private String description;
}

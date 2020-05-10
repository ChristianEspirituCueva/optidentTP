package com.acme.optident.resource;

import com.acme.optident.model.AuditModel;
import lombok.Getter;
import lombok.Setter;

import java.sql.Time;
import java.util.Date;

@Getter
@Setter
public class AppointmentResource extends AuditModel {
    private Long id;
    public Date fecha;
    public Time hora;
    public String status;

}

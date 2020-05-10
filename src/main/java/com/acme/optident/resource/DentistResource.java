package com.acme.optident.resource;

import com.acme.optident.model.AuditModel;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class DentistResource extends AuditModel {
    private long id;
    private String name;
    private Long dni;
    private String lastName;
    private String gender;
    private Long phone;
    private String admisssion;
    private String dentist;
    private Date date;
    private String status;
    private String schedule_date;
    private String scheduleTime;
    private String medicalSchool;
}

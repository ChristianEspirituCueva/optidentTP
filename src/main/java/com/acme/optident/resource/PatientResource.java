package com.acme.optident.resource;

import com.acme.optident.model.AuditModel;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class PatientResource extends AuditModel {
    private Long id;
    private String name;
    private String lastName;
    private Integer dni;
    private String sex;
    private Long  phone;
    private String  ocupation;
    private String  civilState;
    private Date birth;
    private Date inscription;
    private String email;
}

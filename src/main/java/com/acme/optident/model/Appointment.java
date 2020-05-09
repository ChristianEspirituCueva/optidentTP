package com.acme.optident.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.sql.Time;
import java.util.Date;

@Entity
@Table(name = " Appointment")
@Getter
@Setter
public class Appointment extends AuditModel{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Lob
    @DateTimeFormat
    public Date fecha;

    @NotNull
    @Lob
    @DateTimeFormat
    public Time hora;

    @NotNull
    @Lob
    public String status;

    @ManyToOne(fetch = FetchType.LAZY,optional = false)
    @JoinColumn(name = "patient_id",nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private Patient patient;

    @ManyToOne(fetch = FetchType.LAZY,optional = false)
    @JoinColumn(name = "dentist_id",nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private Dentist dentist;

    @ManyToOne(fetch = FetchType.LAZY,optional = false)
    @JoinColumn(name = "specialty_id",nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private Specialty specialty;


}

package com.acme.optident.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
@Table(name = "dentist")
@Getter
@Setter
public class Dentist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private long id;

    @NotNull
    @NotBlank
    @Size(max = 100)
    private String name;

    @NotNull
    @NotBlank
    @Size(max = 100)
    private Long dni;

    @NotNull
    @NotBlank
    @Size(max = 100)
    private String lastName;

    @NotNull
    @NotBlank
    @Size(max = 100)
    private String gender;

    @NotNull
    @NotBlank
    @Size(max = 100)
    private Long phone;

    @NotNull
    @NotBlank
    @Size(max = 100)
    private String address;

    @NotNull
    @NotBlank
    @Size(max = 100)
    private String admisssion;

    @NotNull
    @NotBlank
    @Size(max = 100)
    private String dentist;

    @NotNull
    @NotBlank
    @Size(max = 100)
    @Column(nullable=false,updatable=false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;

    @NotNull
    @NotBlank
    @Size(max = 100)
    private String status;

    @NotNull
    @NotBlank
    @Size(max = 100)
    private String schedule_date;

    @NotNull
    @NotBlank
    @Size(max = 100)
    private String scheduleTime;

    @NotNull
    @NotBlank
    @Size(max = 100)
    private String medicalSchool;

    @ManyToOne(fetch = FetchType.LAZY,optional = false)
    @JoinColumn(name = "clinic_id",nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private Clinic clinic;
}
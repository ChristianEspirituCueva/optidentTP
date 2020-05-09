package com.acme.optident.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "clinics")
@Getter
@Setter
public class Clinic  extends AuditModel{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private long id;

    @OneToMany(cascade = {CascadeType.PERSIST,CascadeType.MERGE}, fetch = FetchType.LAZY)
    @JoinColumn(name="headquarter_id", nullable=false)
    private List<Headquarter> headquarters;

    @Column(name = "Clinic Name",length = 30,nullable = false)
    private String clinicName;

    @Column(name = "Quantity Dentist",nullable = false)
    private long quantityDentist;


}
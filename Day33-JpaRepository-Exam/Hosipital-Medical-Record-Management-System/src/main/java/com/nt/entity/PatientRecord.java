package com.nt.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import lombok.Data;

@Entity
@Data
public class PatientRecord {
@Id
private Long id;
private String name;
@Lob
private byte[] report;
@Lob
private String diagnosis;



}

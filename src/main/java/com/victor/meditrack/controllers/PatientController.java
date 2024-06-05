package com.victor.meditrack.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.victor.meditrack.domain.Patient;
import com.victor.meditrack.dto.PatientDTO;
import com.victor.meditrack.services.PatientServices;

@RestController
public class PatientController {

  @Autowired
  private final PatientServices service;

  public PatientController(PatientServices service) {
    this.service = service;
  }

  @RequestMapping("/patients")
  public void createPatient(@RequestBody PatientDTO patientDTO) {
    String name = patientDTO.getName();
    String email = patientDTO.getEmail();
    service.createPatient(name, email);
  }

  @GetMapping("/patients")
  public List<Patient> getAllPatients() {
    return service.getPatients();
  }
}

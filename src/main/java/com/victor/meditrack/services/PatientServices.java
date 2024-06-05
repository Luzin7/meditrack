package com.victor.meditrack.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.victor.meditrack.domain.Patient;
import com.victor.meditrack.repositories.PatientRepository;

@Service
public class PatientServices {
  private final PatientRepository patientRepository;

  public PatientServices(PatientRepository patientRepository) {
    this.patientRepository = patientRepository;
  }

  public void createPatient(String name, String email) {
    patientRepository.createPatient(name, email);
  }

  public List<Patient> getPatients() {
    return patientRepository.findAll();
  }
}

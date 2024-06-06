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

  public Patient createPatient(String name, String email) {
    Patient patient = new Patient();
    patient.setName(name);
    patient.setEmail(email);
    return patientRepository.save(patient);
  }

  public List<Patient> getPatients() {
    return patientRepository.findAll();
  }
}

package com.victor.meditrack.repositories;

import java.util.List;
import java.util.Optional;

import com.victor.meditrack.domain.Patient;

public interface PatientRepository {
  void createPatient(String name, String email);

  List<Patient> findAll();

  Optional<Patient> findById(String id);

  Optional<Patient> findByEmail(String email);
}

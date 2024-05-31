package com.victor.meditrack.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.victor.meditrack.domain.Patient;

public interface PatientRepository extends JpaRepository<Patient, String> {
  Optional<Patient> findByPatientId(String id);

  Optional<Patient> findByPatientEmail(String email);
}

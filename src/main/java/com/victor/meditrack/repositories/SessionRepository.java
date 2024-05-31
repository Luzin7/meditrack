package com.victor.meditrack.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.victor.meditrack.domain.Session;

public interface SessionRepository extends JpaRepository<Session, String> {
  List<Session> findByPatientId(String patientId);

  List<Session> findByProfessionalId(String professionalId);
}

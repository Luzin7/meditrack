package com.victor.meditrack.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.victor.meditrack.domain.Professional;

public interface ProfessionalRepository extends JpaRepository<Professional, String> {
  Optional<Professional> findByProfessionalId(String id);

  Optional<Professional> findByProfessionalEmail(String email);
}

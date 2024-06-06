package com.victor.meditrack.domain;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "patients")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Patient {
  @Id
  @Column(nullable = false)
  @GeneratedValue(strategy = GenerationType.UUID)
  private String id;

  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "created_at", updatable = false)
  private Date createdAt;

  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "updated_at")
  private Date updatedAt;

  @Column(nullable = false)
  private String name;

  @Column(nullable = false)
  private String email;

  @OneToMany(mappedBy = "patient")
  private List<Session> sessions;

  @PrePersist
  protected void onCreate() {
    createdAt = new Date();
    updatedAt = new Date();
  }

  @PreUpdate
  protected void onUpdate() {
    updatedAt = new Date();
  }
}
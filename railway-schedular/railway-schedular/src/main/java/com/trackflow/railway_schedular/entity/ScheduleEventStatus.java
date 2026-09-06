package com.trackflow.railway_schedular.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "schedule_event_status")
@Data
@NoArgsConstructor
public class ScheduleEventStatus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String name; // e.g. PLANNED, IN_PROGRESS, COMPLETED, DELAYED, SUPERSEDED, CANCELLED
}

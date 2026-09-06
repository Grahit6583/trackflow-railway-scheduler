package com.trackflow.railway_schedular.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Entity
@Table(name = "schedule_event")
@Data
@NoArgsConstructor
public class ScheduleEvent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "train_id", nullable = false)
    private Train train;

    @ManyToOne
    @JoinColumn(name = "block_id", nullable = false)
    private Block block;

    @Column(name = "planned_start", nullable = false)
    private LocalDateTime plannedStart;

    @Column(name = "planned_end", nullable = false)
    private LocalDateTime plannedEnd;

    @Column(name = "actual_start")
    private LocalDateTime actualStart;

    @Column(name = "actual_end")
    private LocalDateTime actualEnd;

    @ManyToOne
    @JoinColumn(name = "status_id", nullable = false)
    private ScheduleEventStatus status;

    // Nullable — only set when this event belongs to a what-if simulation
    @ManyToOne
    @JoinColumn(name = "scenario_id")
    private Scenario scenario;

    @Column(name = "created_at", nullable = false, updatable = false)
    private LocalDateTime createdAt;

    @PrePersist
    protected void onCreate() {
        this.createdAt = LocalDateTime.now();
    }
}
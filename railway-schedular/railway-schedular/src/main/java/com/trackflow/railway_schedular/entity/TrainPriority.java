package com.trackflow.railway_schedular.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "train_priority")
@Data
@NoArgsConstructor
public class TrainPriority {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String name; // e.g. HIGH, MEDIUM, LOW

    @Column(name = "priority_rank", nullable = false)
    private Integer priorityRank; // numeric rank for sorting/scheduling logic, e.g. 1 = highest
}
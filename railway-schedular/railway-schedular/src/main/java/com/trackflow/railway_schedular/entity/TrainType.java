package com.trackflow.railway_schedular.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "train_type")
@Data
@NoArgsConstructor
public class TrainType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String name; // e.g. EXPRESS, PASSENGER, FREIGHT, GOODS
}

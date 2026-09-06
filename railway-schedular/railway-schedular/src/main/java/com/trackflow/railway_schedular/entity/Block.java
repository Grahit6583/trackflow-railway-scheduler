package com.trackflow.railway_schedular.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "block")
@Data
@NoArgsConstructor
public class Block {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "section_id", nullable = false)
    private Section section;

    @ManyToOne
    @JoinColumn(name = "type_id", nullable = false)
    private BlockType type;

    @Column(name = "length_km", nullable = false)
    private Double lengthKm;

    @Column(name = "max_train_length_m", nullable = false)
    private Double maxTrainLengthM;

    @Column(name = "sequence_order", nullable = false)
    private Integer sequenceOrder;

    @Column(nullable = false)
    private Integer capacity;

    @ManyToOne
    @JoinColumn(name = "status_id", nullable = false)
    private BlockStatus status;
}

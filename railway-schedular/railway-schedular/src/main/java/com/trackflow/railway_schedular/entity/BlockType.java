package com.trackflow.railway_schedular.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "block_type")
@Data
@NoArgsConstructor
public class BlockType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String name; // e.g. SIGNAL_BLOCK, STATION_BLOCK, JUNCTION
}

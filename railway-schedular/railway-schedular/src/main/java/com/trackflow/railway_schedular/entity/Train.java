package com.trackflow.railway_schedular.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "train")
@Data
@NoArgsConstructor
public class Train {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String number;

    @ManyToOne
    @JoinColumn(name = "type_id", nullable = false)
    private TrainType type;

    @ManyToOne
    @JoinColumn(name = "priority_id", nullable = false)
    private TrainPriority priority;

    @Column(name = "length_m", nullable = false)
    private Double lengthM;

    @Column(name = "max_speed_kmph", nullable = false)
    private Double maxSpeedKmph;

    @ManyToOne
    @JoinColumn(name = "origin_station_id", nullable = false)
    private Station originStation;

    @ManyToOne
    @JoinColumn(name = "destination_station_id", nullable = false)
    private Station destinationStation;
}

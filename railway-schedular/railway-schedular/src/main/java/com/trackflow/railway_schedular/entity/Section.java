package com.trackflow.railway_schedular.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "section")
@Data
@NoArgsConstructor
public class Section {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "start_station_id", nullable = false)
    private Station startStation;

    @ManyToOne
    @JoinColumn(name = "end_station_id", nullable = false)
    private Station endStation;

    @Column(name = "total_length_km", nullable = false)
    private Double totalLengthKm;

    @ManyToOne
    @JoinColumn(name = "status_id", nullable = false)
    private SectionStatus status;
}

package com.example.onemore.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NoArgsConstructor;
import jakarta.persistence.*;
import lombok.Setter;

import java.util.List;

@NoArgsConstructor
@Entity
@Getter
@Setter
@Table(name = "available_numbers")
public class AvailableNumbers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_numbers")
    private Integer id_numbers;

    @Column(name = "series",columnDefinition = "varchar(9)")
    private String series;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "id_transport")
    private TransportVehicle transportVehicle;


}

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
@Table(name = "maintenance")
public class Maintenance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "receipt")
    private Integer receipt;

    @Column(name = "periodicity",columnDefinition = "varchar(90)")
    private String periodicity;

    @Column(name = "checked_characteristics",columnDefinition = "varchar(90)")
    private String characteristics;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "id_numb")
    private ExistingNumbers existingNumbers;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "id_transport")
    private TransportVehicle transportVehicle;
}

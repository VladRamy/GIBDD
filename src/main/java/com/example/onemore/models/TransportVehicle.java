package com.example.onemore.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import jakarta.persistence.*;
import lombok.Setter;


import java.util.List;

@NoArgsConstructor
@Entity
@Getter
@Setter
@Table(name = "transport_vehicle")
public class TransportVehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_transport")
    private Integer id;

    @Column(name = "list_organizations",columnDefinition = "varchar(90)")
    private String org;

    @Column(name = "inf_of_owner",columnDefinition = "varchar(90)")
    private String owner;

    @Column(name = "inf_of_car",columnDefinition = "varchar(90)")
    private String car;

    @OneToMany(mappedBy = "transportVehicle")
    private List<AvailableNumbers> availableNumbersList;

    @OneToMany(mappedBy = "transportVehicle")
    private List<DTP> dtpList;

    @OneToMany(mappedBy = "transportVehicle")
    private List<ExistingNumbers> existingNumbersList;

    @OneToMany(mappedBy = "transportVehicle")
    private List<Maintenance> maintenanceList;
}

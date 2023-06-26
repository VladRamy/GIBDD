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
@Table(name = "existing_numbers")
public class ExistingNumbers {

    @Column(name = "transport_type",columnDefinition = "varchar(90)")
    private String type;

    @Column(name = "inf_of_owner",columnDefinition = "varchar(90)")
    private String owner;

    @Column(name = "inf_of_car",columnDefinition = "varchar(90)")
    private String car;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_numb")
    private Integer id_numb;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "id_transport")
    private TransportVehicle transportVehicle;

    @OneToMany(mappedBy = "existingNumbers")
    private List<DTP> dtpList;

    @OneToMany(mappedBy = "existingNumbers")
    private List<Maintenance> maintenanceList;
}

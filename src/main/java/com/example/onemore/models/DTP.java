package com.example.onemore.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NoArgsConstructor;
import jakarta.persistence.*;
import lombok.Setter;

import java.sql.Date;

import java.util.List;

@NoArgsConstructor
@Entity
@Getter
@Setter
@Table(name = "dtp")
public class DTP {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_incedent")
    private Integer id_incedent;

    @Column(name = "date")
    @Temporal(TemporalType.DATE)
    private Date date;

    @Column(name = "incedent_type",columnDefinition = "varchar(90)")
    private String type;

    @Column(name = "inf_of_car",columnDefinition = "varchar(90)")
    private String car;

    @Column(name = "protocol",columnDefinition = "varchar(90)")
    private String protocol;

    @Column(name = "place",columnDefinition = "varchar(90)")
    private String place;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "id_numb")
    private ExistingNumbers existingNumbers;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "id_transport")
    private TransportVehicle transportVehicle;

}

package com.example.crud_spring.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "tbl_vehicle")
public class Vehiculo {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long vehicleId;

    @Column(name ="plate" , nullable = false , unique = true )
    private String placa;

    @Column(name ="brand")
    private String marca;

    @Column(name ="model")
    private String modelo;

    @Column(name ="year_vehicle")
    private Integer yearModel;

    @Column(name ="cc")
    private Float cc;

    @Column(name ="hp")
    private Integer caballosFuerza;

    @Column(name ="type_vehicle") //particular, comercial, institucional
    private String tipo_vehiculo;

    @Column(name ="owner")
    private String propietario;

    @Column(name ="soat")
    private Integer valor_soat;

}

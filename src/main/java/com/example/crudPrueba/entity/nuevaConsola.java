package com.example.crudPrueba.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name= "nuevaConsola")
public class nuevaConsola {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String marca ;
    @Column (name="modelo",unique = true, nullable = false)
    private int modelo;
    private int anio;
}

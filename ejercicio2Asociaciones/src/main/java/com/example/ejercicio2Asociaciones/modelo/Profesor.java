package com.example.ejercicio2Asociaciones.modelo;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor @Builder
public class Profesor implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    private String nombre;
    private String email;

    private double puntuacion;

    @OneToMany(mappedBy = "profesor")
    public List<CursoOnline> cursoOnline= new ArrayList<>();




}

package com.example.ejercicio2Asociaciones.modelo;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Video {

    @Id
    @GeneratedValue
    private Long id;

    private int orden;
    private String titulo;
    private String descripcion;

    private String url;

    @ManyToOne
    private CursoOnline cursoOnline;


}

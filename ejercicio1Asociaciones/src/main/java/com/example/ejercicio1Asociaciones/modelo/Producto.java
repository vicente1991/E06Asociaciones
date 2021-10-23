package com.example.ejercicio1Asociaciones.modelo;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.io.Serializable;

@Entity
@NoArgsConstructor @AllArgsConstructor
@Builder @Getter @Setter
public class Producto implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    private String nombre;

    private double pvp;

    @Builder.Default
    @OneToMany(mappedBy = "producto")

}

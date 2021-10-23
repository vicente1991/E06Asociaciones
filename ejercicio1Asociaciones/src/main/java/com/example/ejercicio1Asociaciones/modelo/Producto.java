package com.example.ejercicio1Asociaciones.modelo;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;

@Entity
@NoArgsConstructor @AllArgsConstructor
@Builder @Getter @Setter
public class Producto implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    private String nombre;

    private double pvp;


    @ManyToOne
    @JoinColumn(name = "categria",foreignKey = @ForeignKey(name = "FK_PRODUCTO_CATEGORIA"))
    private Categoria categoria;

    public void addCategoria(Categoria c){
        categoria= c;
        if(c.getProductos()==null){
            c.setProductos(new ArrayList<>());
            c.getProductos().add(this);
        }else{
            c.getProductos().add(this);
        }
    }
    public void removeCategoria(Categoria c){
        c.getProductos().remove(this);
        categoria= null;
    }
}

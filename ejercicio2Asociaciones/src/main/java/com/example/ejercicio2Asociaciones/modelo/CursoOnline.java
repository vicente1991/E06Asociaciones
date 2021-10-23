package com.example.ejercicio2Asociaciones.modelo;

import lombok.*;

import javax.persistence.*;
import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor @Builder
public class CursoOnline {

    @Id
    @GeneratedValue
    private Long id;

    private String nombre;
    private double puntuacion;

    @ManyToOne
    @JoinColumn(name = "profesor",foreignKey = @ForeignKey(name = "FK_CURSOONLINE_PROFESOR"))
    private Profesor profesor;

    @OneToMany(mappedBy = "cursoOnline",cascade = CascadeType.ALL,orphanRemoval = true)
    private List<Video> videos= new ArrayList<>();

    //Helpers

    public void addVideos(Video v){
        v.setCursoOnline(this);
        this.videos.add(v);
    }
    public void removeVideos(Video v){
        this.videos.remove(v);
        v.setCursoOnline(null);
    }
    //metodosprof

    public void addProfesor(Profesor p){;
    profesor = p;
    if(p.getCursoOnlines() ==null){
        p.setCursoOnlines(new ArrayList<>());
        p.getCursoOnlines().add(this);
        }
    }
    public void removeProfesor(Profesor p){
        p.getCursoOnlines().remove(this);
        profesor=null;
    }
}

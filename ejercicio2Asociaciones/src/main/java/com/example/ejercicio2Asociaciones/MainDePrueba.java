package com.example.ejercicio2Asociaciones;

import com.example.ejercicio2Asociaciones.base.service.CursoOnlineService;
import com.example.ejercicio2Asociaciones.base.service.ProfesorService;
import com.example.ejercicio2Asociaciones.modelo.CursoOnline;
import com.example.ejercicio2Asociaciones.modelo.Profesor;
import com.example.ejercicio2Asociaciones.modelo.Video;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
@RequiredArgsConstructor

public class MainDePrueba {


    private final CursoOnlineService cursoOnlineService;
    private final ProfesorService profesorService;

    @PostConstruct
    public void test(){
        Profesor luismi = Profesor.builder()
                .nombre("Luismi")
                .email("luismilopezmagana@gmail.com")
                .puntuacion(10)
                .build();
        profesorService.save(luismi);
        Profesor miguel = Profesor.builder()
                .nombre("miguel")
                .email("miguelcampos@gmail.com")
                .puntuacion(10)
                .build();
        profesorService.save(miguel);

        CursoOnline springDataJPA = CursoOnline.builder()
                .nombre("SpringDataJPA")
                .puntuacion(6)
                .videos(new ArrayList<>())
                .build();
        cursoOnlineService.save(springDataJPA);

        CursoOnline Angular= CursoOnline.builder()
                        .nombre("Angular")
                        .puntuacion(10)
                        .videos(new ArrayList<>())
                        .build();
        cursoOnlineService.save(Angular);
        springDataJPA.addVideos(Video.builder()
                .orden(1)
                .titulo("Introduccion a SpringDataJPA")
                .descripcion("El mejor video del mundo")
                .url("htps://SpringDataJPA.com")
                .build());
        cursoOnlineService.edit(springDataJPA);



        Angular.addVideos(Video.builder()
                .orden(1)
                .titulo("Bienvenido a Angular")
                .descripcion("Lo mejor de lo mejor")
                .url("htps://Angular.io/cli")
                .build());
        cursoOnlineService.edit(Angular);

        //Añadimos a los profesores a los cursos
        springDataJPA.addProfesor(luismi);
        Angular.addProfesor(miguel);

        cursoOnlineService.edit(springDataJPA);
        cursoOnlineService.edit(Angular);

        List<CursoOnline> resultado = cursoOnlineService.findAll();

        System.out.println("Profesor: " + luismi.getNombre());
        System.out.println("Cursos online: ");
        luismi.getCursoOnline().forEach(c -> {
            System.out.println(c.getNombre());
        });
        System.out.println("Videos: ");
        springDataJPA.getVideos().forEach(v -> {
            System.out.println(v.getTitulo());
        });

        System.out.println("Profesor: " + miguel.getNombre());
        System.out.println("Cursos online: ");
        miguel.getCursoOnline().forEach(c -> {
            System.out.println(c.getNombre());
        });
        System.out.println("Videos: ");
        Angular.getVideos().forEach(v -> {
            System.out.println(v.getTitulo());
        });

    }
    }







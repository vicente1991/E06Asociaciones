package com.example.ejercicio2Asociaciones.repository;

import com.example.ejercicio2Asociaciones.modelo.Profesor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfesorRepository extends JpaRepository<Profesor,Long> {
}

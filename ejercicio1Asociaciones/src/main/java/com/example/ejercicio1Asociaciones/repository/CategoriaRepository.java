package com.example.ejercicio1Asociaciones.repository;

import com.example.ejercicio1Asociaciones.modelo.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria,Long> {
}

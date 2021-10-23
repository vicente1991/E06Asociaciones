package com.example.ejercicio2Asociaciones.repository;

import com.example.ejercicio2Asociaciones.modelo.CursoOnline;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CursoOnlineRepository extends JpaRepository<CursoOnline,Long> {
    @Query("select distinct c from Compuesto c join fetch c.componentes")
    List<CursoOnline> findAllJoin();
}

package com.example.ejercicio1Asociaciones.base.service;



import com.example.ejercicio1Asociaciones.modelo.Categoria;
import com.example.ejercicio1Asociaciones.repository.CategoriaRepository;
import org.springframework.stereotype.Service;
import com.example.ejercicio1Asociaciones.base.BaseService;

@Service
public class CategoriaService extends BaseService<Categoria,Long, CategoriaRepository> {
}

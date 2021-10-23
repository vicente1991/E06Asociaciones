package com.example.ejercicio2Asociaciones.base.service;


import com.example.ejercicio2Asociaciones.base.BaseService;
import com.example.ejercicio2Asociaciones.modelo.Profesor;
import com.example.ejercicio2Asociaciones.repository.ProfesorRepository;
import org.springframework.stereotype.Service;

@Service
public class ProfesorService extends BaseService<Profesor,Long, ProfesorRepository> {
}

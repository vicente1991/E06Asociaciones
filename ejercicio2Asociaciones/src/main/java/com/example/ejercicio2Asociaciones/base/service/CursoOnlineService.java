package com.example.ejercicio2Asociaciones.base.service;


import com.example.ejercicio2Asociaciones.base.BaseService;
import com.example.ejercicio2Asociaciones.modelo.CursoOnline;
import com.example.ejercicio2Asociaciones.repository.CursoOnlineRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursoOnlineService extends BaseService<CursoOnline, Long, CursoOnlineRepository> {
    @Override
    public List<CursoOnline> findAll() {
        return this.repositorio.findAllJoin();
    }
}

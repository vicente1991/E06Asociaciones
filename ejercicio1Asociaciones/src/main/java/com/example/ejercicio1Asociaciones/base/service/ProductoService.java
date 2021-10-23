package com.example.ejercicio1Asociaciones.base.service;


import com.example.ejercicio1Asociaciones.base.BaseService;
import com.example.ejercicio1Asociaciones.modelo.Producto;
import com.example.ejercicio1Asociaciones.repository.ProductoRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductoService extends BaseService<Producto,Long, ProductoRepository> {
}

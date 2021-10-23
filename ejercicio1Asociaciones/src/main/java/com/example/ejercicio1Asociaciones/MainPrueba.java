package com.example.ejercicio1Asociaciones;

import com.example.ejercicio1Asociaciones.base.service.CategoriaService;
import com.example.ejercicio1Asociaciones.base.service.ProductoService;
import com.example.ejercicio1Asociaciones.modelo.Categoria;
import com.example.ejercicio1Asociaciones.modelo.Producto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;

@Component
@RequiredArgsConstructor
public class MainPrueba {

    private final CategoriaService categoriaService;
    private final ProductoService productoService;

    @PostConstruct
    public void test(){

        Categoria postre = Categoria.builder()
                .nombre("Postre")
                .productos(new ArrayList<>())
                .build();
        categoriaService.save(postre);
        Categoria congelados = Categoria.builder()
                .nombre("congelados")
                .build();
        categoriaService.save(congelados);


        Producto producto1 = Producto.builder()
                .nombre("Patatas fritas")
                .pvp(0.99)
                .build();
        productoService.save(producto1);
        producto1.addCategoria(congelados);
        Producto producto2 = Producto.builder()
                .nombre("Hielo")
                .pvp(2.50)
                .build();
        productoService.save(producto2);
        producto2.addCategoria(congelados);
        Producto producto3 = Producto.builder()
                .nombre("Helado")
                .pvp(2.99)
                .build();
        productoService.save(producto3);
        producto3.addCategoria(postre);

        Producto producto4 = Producto.builder()
                .nombre("Tocinito de cielo")
                .pvp(1.85)
                .build();
        productoService.save(producto4);
        producto4.addCategoria(postre);

        System.out.println("categoria: "+postre.getNombre());
        System.out.println("Productos disponibles:");
        postre.getProductos().forEach(p -> {
            System.out.println(p.getNombre() + " "+p.getPvp()+ " euros");
        });
        System.out.println("\ncategoria: "+congelados.getNombre());
        System.out.println("Productos disponibles:");
        congelados.getProductos().forEach(p -> {
            System.out.println(p.getNombre() + " "+p.getPvp()+ " euros");
        });

    }
}

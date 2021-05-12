package com.example.producto;

import java.util.List;

import com.example.producto.model.Producto;
import com.example.producto.repository.ProductoRepository;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
public class ProductoRepositoryMockTest {


    @Autowired
    ProductoRepository productoRepository;

    @Test
    public void createProductoThenListProducto() {

        Producto producto = Producto.builder()
                .nombre("Producto a")
                .codigo("001")
                .tecnologia("microsoft")
                .build();

        productoRepository.save(producto);

        List<Producto> productos = productoRepository.findAll();

        Assertions.assertThat(productos.size()).isGreaterThan(0);

    }
    
}

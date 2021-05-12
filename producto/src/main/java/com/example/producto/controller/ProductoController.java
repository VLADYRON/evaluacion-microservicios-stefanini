package com.example.producto.controller;

import java.util.List;

import com.example.producto.model.Producto;
import com.example.producto.service.ProductoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/v1/productos")
public class ProductoController {

    @Autowired
    ProductoService service;

    @GetMapping
    public List<Producto> all() {

        return service.all();

    }

    @GetMapping("/{id}")
    public Producto find(@PathVariable Long id) {

        return service.find(id);

    }

    @PostMapping
    public void save(@RequestBody Producto producto) {

        service.save(producto);

    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {

        service.delete(id);

    }

    @PutMapping
    public void update(@RequestBody Producto producto) {

        service.update(producto);

    }

}
package com.example.producto.service;

import java.util.List;

import com.example.producto.model.Producto;

public interface ProductoService {

    public List<Producto> all();

    public Producto find(Long id);

    public void save(Producto producto);

    public void delete(Long id);

    public void update(Producto producto);

}

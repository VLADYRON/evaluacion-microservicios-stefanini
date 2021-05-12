package com.example.producto.service;

import java.util.List;

import javax.transaction.Transactional;

import com.example.producto.model.Producto;
import com.example.producto.repository.ProductoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ProductoServiceImp implements ProductoService {

    @Autowired
    ProductoRepository productoRepository;

    @Override
    public List<Producto> all() {

        return productoRepository.findAll();

    }

    @Override
    public Producto find(Long id) {

        return productoRepository.findById(id).get();

    }

    @Override
    public void save(Producto producto) {

        productoRepository.save(producto);

    }

    @Override
    public void delete(Long id) {

        Producto producto = productoRepository.findById(id).get();
        productoRepository.delete(producto);

    }

    @Override
    public void update(Producto producto) {

        Producto productoDB = productoRepository.findById(producto.getId()).get();

        productoDB.setNombre(producto.getNombre());
        productoDB.setCodigo(producto.getCodigo());
        productoDB.setTecnologia(producto.getTecnologia());

        productoRepository.save(productoDB);

    }

}

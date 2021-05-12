package com.example.producto.repository;

import java.util.List;

import com.example.producto.model.Producto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepository extends CrudRepository<Producto,Long> {

    @Override
    public List<Producto> findAll();

}

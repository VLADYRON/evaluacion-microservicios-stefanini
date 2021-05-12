package com.example.cliente.dao;

import com.example.cliente.model.Cliente;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface ClienteRepository extends CrudRepository<Cliente, Long>{

    @Override
    public  List<Cliente> findAll();
    
    
}

package com.example.cliente.service;

import java.util.List;

import com.example.cliente.model.Cliente;

public interface ClienteService {

    public List<Cliente> all();

    public Cliente find(Long id);

    public void save(Cliente cliente);

    public void delete(Long id);

    public void update(Cliente cliente);

}

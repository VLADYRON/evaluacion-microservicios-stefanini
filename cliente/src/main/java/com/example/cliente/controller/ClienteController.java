package com.example.cliente.controller;

import java.util.List;

import com.example.cliente.model.Cliente;
import com.example.cliente.service.ClienteService;

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
@RequestMapping("/api/v1/clientes")
public class ClienteController {

    @Autowired
    ClienteService service;

    @GetMapping
    public List<Cliente> all() {

        return service.all();

    }

    @GetMapping("/{id}")
    public Cliente find(@PathVariable Long id) {

        return service.find(id);

    }

    @PostMapping
    public void save(@RequestBody Cliente cliente) {

        service.save(cliente);

    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {

        service.delete(id);

    }

    @PutMapping
    public void update(@RequestBody Cliente cliente) {

        service.update(cliente);

    }

}

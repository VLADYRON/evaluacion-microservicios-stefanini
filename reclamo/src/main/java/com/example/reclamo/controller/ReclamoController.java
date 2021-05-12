package com.example.reclamo.controller;

import java.util.List;

import com.example.reclamo.model.Reclamo;
import com.example.reclamo.service.ReclamoService;

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
@RequestMapping("/api/v1/reclamos")
public class ReclamoController {

    @Autowired
    ReclamoService service;

    @GetMapping
    public List<Reclamo> all() {

        return service.all();

    }

    @GetMapping("/{id}")
    public Reclamo find(@PathVariable Long id) {

        return service.find(id);

    }

    @PostMapping
    public void save(@RequestBody Reclamo reclamo) {

        service.save(reclamo);

    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {

        service.delete(id);

    }

    @PutMapping
    public void update(@RequestBody Reclamo reclamo) {

        service.update(reclamo);

    }
    
}

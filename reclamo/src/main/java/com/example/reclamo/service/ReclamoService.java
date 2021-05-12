package com.example.reclamo.service;

import java.util.List;

import com.example.reclamo.model.Reclamo;

public interface ReclamoService {

    public List<Reclamo> all();

    public Reclamo find(Long id);

    public void save(Reclamo reclamo);

    public void delete(Long id);

    public void update(Reclamo reclamo) ;
    
}

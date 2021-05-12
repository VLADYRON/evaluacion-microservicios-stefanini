package com.example.reclamo.service;

import java.util.List;

import javax.transaction.Transactional;

import com.example.reclamo.model.Reclamo;
import com.example.reclamo.repository.ReclamoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ReclamoServiceImp implements ReclamoService {


    @Autowired
    ReclamoRepository reclamoRepository;


    @Override
    public List<Reclamo> all() {

        return reclamoRepository.findAll();

    }

    @Override
    public Reclamo find(Long id) {

        return reclamoRepository.findById(id).get();

    }

    @Override
    public void save(Reclamo reclamo) {

        reclamoRepository.save(reclamo);

    }

    @Override
    public void delete(Long id) {

        Reclamo reclamo= reclamoRepository.findById(id).get();
        reclamoRepository.delete(reclamo);

    }

    @Override
    public void update(Reclamo reclamo) {

        Reclamo reclamoDB = reclamoRepository.findById(reclamo.getId()).get();
        
        reclamoDB.setMotivo(reclamo.getMotivo());
        reclamoDB.setCodigo(reclamo.getCodigo());
        reclamoDB.setDescripcion(reclamo.getDescripcion());

        reclamoRepository.save(reclamoDB);

    }
    
}

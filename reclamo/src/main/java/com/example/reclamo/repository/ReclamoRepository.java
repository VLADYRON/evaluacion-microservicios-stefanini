package com.example.reclamo.repository;

import java.util.List;

import com.example.reclamo.model.Reclamo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReclamoRepository extends CrudRepository<Reclamo,Long> {
    @Override
    public List<Reclamo> findAll();
}

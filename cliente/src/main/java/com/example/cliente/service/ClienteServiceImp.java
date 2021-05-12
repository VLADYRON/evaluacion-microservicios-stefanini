package com.example.cliente.service;

import java.util.List;

import javax.transaction.Transactional;

import com.example.cliente.dao.ClienteRepository;
import com.example.cliente.model.Cliente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ClienteServiceImp implements ClienteService {

    @Autowired
    ClienteRepository clienteRepository;

    @Override
    public List<Cliente> all() {

        return clienteRepository.findAll();

    }

    @Override
    public Cliente find(Long id) {

        return clienteRepository.findById(id).get();

    }

    @Override
    public void save(Cliente cliente) {

        clienteRepository.save(cliente);

    }

    @Override
    public void delete(Long id) {

        Cliente cliente = clienteRepository.findById(id).get();
        clienteRepository.delete(cliente);

    }

    @Override
    public void update(Cliente cliente) {

        Cliente clienteDB = clienteRepository.findById(cliente.getId()).get();

        clienteDB.setNombre(cliente.getNombre());
        clienteDB.setApellidos(cliente.getApellidos());
        clienteDB.setCodigo(cliente.getCodigo());
        clienteDB.setFechaNacimiento(cliente.getFechaNacimiento());
        clienteDB.setTipoDocumento(cliente.getTipoDocumento());

        clienteRepository.save(clienteDB);

    }

}

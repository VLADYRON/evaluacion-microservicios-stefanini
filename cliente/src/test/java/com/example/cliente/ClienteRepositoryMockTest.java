package com.example.cliente;

import java.util.Date;
import java.util.List;

import com.example.cliente.dao.ClienteRepository;
import com.example.cliente.model.Cliente;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
public class ClienteRepositoryMockTest {

    @Autowired
    ClienteRepository clienteRepository;

    @Test
    public void createClienteThenListCliente() {

        Cliente cliente = Cliente.builder()
                .tipoDocumento("DNI")
                .numeroDocumento("4248473987")
                .nombre("Bladymir")
                .apellidos("Chavez")
                .codigo("001")
                .fechaNacimiento(new Date())
                .build();

        clienteRepository.save(cliente);

        List<Cliente> clientes = clienteRepository.findAll();

        Assertions.assertThat(clientes.size()).isGreaterThan(0);

    }

}

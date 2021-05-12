package com.example.reclamo;

import java.util.List;

import com.example.reclamo.model.Reclamo;
import com.example.reclamo.repository.ReclamoRepository;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
public class ReclamoRepositoryMockTest {

    @Autowired
    ReclamoRepository reclamoRepository;

    @Test
    public void createReclamoThenListReclamo() {

        Reclamo reclamo = Reclamo.builder()
                .codigo("0001")
                .motivo("motivo desconocido")
                .descripcion("blablabla")
                .build();

                reclamoRepository.save(reclamo);

        List<Reclamo> reclamos = reclamoRepository.findAll();

        Assertions.assertThat(reclamos.size()).isGreaterThan(0);

    }

}

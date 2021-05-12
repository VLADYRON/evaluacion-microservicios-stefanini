package com.example.configuracion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfiguracionApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfiguracionApplication.class, args);
    }

}

package ma.projet.grpc;


import ma.projet.grpc.Entity.Compte;
import ma.projet.grpc.repository.CompteRepository;
import ma.projet.grpc.service.CompteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class Grpc2Application implements CommandLineRunner {
    @Autowired
    private CompteRepository compteRepository;
    @Autowired
    private CompteService compteService;

    public static void main(String[] args) {
        SpringApplication.run(Grpc2Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {


    }
}

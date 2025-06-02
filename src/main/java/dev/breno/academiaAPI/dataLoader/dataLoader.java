package dev.breno.academiaAPI.dataLoader;

import dev.breno.academiaAPI.model.clientModel;
import dev.breno.academiaAPI.repository.clientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class dataLoader implements CommandLineRunner {

    @Autowired
    private clientRepository ClientRepository;

    @Override
    public void run(String... args) {
        ClientRepository.save(new clientModel(null, "test", 10));
        ClientRepository.save(new clientModel(null, "testando", 100));

        System.out.println("Dados inseridos com sucesso!");
    }
}

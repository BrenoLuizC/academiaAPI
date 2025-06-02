package dev.breno.academiaAPI.service;

import dev.breno.academiaAPI.model.clientModel;
import dev.breno.academiaAPI.repository.clientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class clientService {

    @Autowired
    private clientRepository clientRepository;

    public List<clientModel> listAll() {
        return clientRepository.findAll();
    }

    public clientModel save(clientModel client) {
        return clientRepository.save(client);
    }
}

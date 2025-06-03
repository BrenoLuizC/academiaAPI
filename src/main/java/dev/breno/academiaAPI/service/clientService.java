package dev.breno.academiaAPI.service;

import dev.breno.academiaAPI.model.clientModel;
import dev.breno.academiaAPI.repository.clientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class clientService {

    @Autowired
    private clientRepository clientRepository;

    public List<clientModel> listAll() {
        return clientRepository.findAll();
    }

    public ResponseEntity<List<clientModel>> listAllById(Long id) {
        if(!clientRepository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        List<clientModel> list = clientRepository.findAllById(Collections.singleton(id));
        return ResponseEntity.status(HttpStatus.OK).body(list);
    }

    public ResponseEntity<clientModel> save(clientModel client) {
        clientRepository.save(client);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    public ResponseEntity<Void> deleteById(Long id) {
        if (!clientRepository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }

        clientRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}

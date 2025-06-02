package dev.breno.academiaAPI.controller;


import dev.breno.academiaAPI.model.clientModel;
import dev.breno.academiaAPI.service.clientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class clientController {

    @Autowired
    private clientService clientService;

    @GetMapping
    public List<clientModel> list() {
        return clientService.listAll();
    }

    @PostMapping
    public ResponseEntity<clientModel> criarClient(@RequestBody clientModel client) {
        clientModel salvo = clientService.save(client);
        return ResponseEntity.status(HttpStatus.CREATED).body(salvo);
    }
}

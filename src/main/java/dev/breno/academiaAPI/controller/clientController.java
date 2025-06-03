package dev.breno.academiaAPI.controller;


import dev.breno.academiaAPI.model.clientModel;
import dev.breno.academiaAPI.service.clientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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

    @GetMapping("/{id}")
    public ResponseEntity<List<clientModel>> listById(@PathVariable Long id) {
        return clientService.listAllById(id);
    }

    @PostMapping
    public ResponseEntity<clientModel> createClient(@RequestBody clientModel client) {
        return clientService.save(client);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteClient(@PathVariable Long id) {
        return clientService.deleteById(id);
    }
}

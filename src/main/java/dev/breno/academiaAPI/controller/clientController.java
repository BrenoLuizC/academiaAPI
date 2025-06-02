package dev.breno.academiaAPI.controller;


import dev.breno.academiaAPI.model.clientModel;
import dev.breno.academiaAPI.service.clientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}

package com.br.pecas.controller;

import com.br.pecas.model.Loja;
import com.br.pecas.service.LojaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api")
public class LojaController {
    @Autowired
    private LojaService lojaService;

    @GetMapping("/lojas")
    public List<Loja> getAllStores() {
        return lojaService.getAllLojas();
    }

    @PostMapping("/lojas")
    public Loja createLoja(@RequestBody Loja loja) {
        return lojaService.saveLoja(loja);
    }

    @GetMapping("/lojas/{id}")
    public Loja getLojaById(@PathVariable Long id) {
        return lojaService.getLojaById(id).orElse(null);
    }
}

package com.br.pecas.controller;

import com.br.pecas.model.Produto;
import com.br.pecas.repository.ProdutoRepository;
import com.br.pecas.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api")
public class ProdutoController {
    @Autowired
    private ProdutoService produtoService;

    @GetMapping("/produtos")
    public List<Produto> getAllProdutos() {
        return produtoService.getAllProdutos();
    }

    @PostMapping("/produtos")
    public Produto createProduto(@RequestBody Produto produto) {
        return produtoService.saveProduto(produto);
    }

    @GetMapping("/produtos/{id}")
    public Produto getProdutoById(@PathVariable Long id) {
        return produtoService.getProdutoById(id).orElse(null);
    }
}

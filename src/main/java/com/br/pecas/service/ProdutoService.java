package com.br.pecas.service;

import com.br.pecas.model.Produto;
import com.br.pecas.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class ProdutoService {
    @Autowired
    private ProdutoRepository produtoRepository;

    public List<Produto> getAllProdutos() {
        return produtoRepository.findAll();
    }

    public Optional<Produto> getProdutoById(Long id) {
        return produtoRepository.findById(id);
    }

    public Produto saveProduto(Produto produto) {
        return produtoRepository.save(produto);
    }

    public List<Produto> getProdutosByLojaId(Long lojaId) {
        return produtoRepository.findByLojaId(lojaId);
    }

    //public Optional<Produto> getProdutoByIdPublic(UUID idPublic) {
      //  return produtoRepository.findByIdPublic(idPublic);
    //}

}

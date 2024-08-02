package com.br.pecas.repository;

import com.br.pecas.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    Optional<Produto> findById(Long id);
    List<Produto> findByLojaId(Long lojaId);
    //List<Produto> findByLojaIdPublic(UUID lojaIdPublic);
}

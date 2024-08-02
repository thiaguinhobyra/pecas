package com.br.pecas.repository;

import com.br.pecas.model.Loja;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface LojaRepository extends JpaRepository<Loja, Long> {
    Optional<Loja> findById(Long id);
}

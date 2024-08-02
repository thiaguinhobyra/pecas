package com.br.pecas.service;

import com.br.pecas.model.Loja;
import com.br.pecas.repository.LojaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class LojaService {
    @Autowired
    private LojaRepository lojaRepository;

    public List<Loja> getAllLojas() {
        return lojaRepository.findAll();
    }

    public Optional<Loja> getLojaById(Long id) {
        return lojaRepository.findById(id);
    }

    //public Optional<Loja> getLojaByIdPublic(UUID idPublic) {
      //  return lojaRepository.findByIdPublic(idPublic);
    //}

    public Loja saveLoja(Loja loja) {
        return lojaRepository.save(loja);
    }
}

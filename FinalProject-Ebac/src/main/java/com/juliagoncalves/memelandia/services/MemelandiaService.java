package com.juliagoncalves.memelandia.services;

import com.juliagoncalves.memelandia.entity.CategoriaMeme;
import com.juliagoncalves.memelandia.repositories.MemelandiaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class MemelandiaService {

    @Autowired
    private final MemelandiaRepository memelandiaRepository;

    public MemelandiaService(MemelandiaRepository memelandiaRepository) {
        this.memelandiaRepository = memelandiaRepository;
    }

    public Iterable<CategoriaMeme> buscarTodasAsCategorias() {
        return memelandiaRepository.findAll();
    }

    public CategoriaMeme criarCategoriaMeme(CategoriaMeme categoriaMeme) {
        return memelandiaRepository.save(categoriaMeme);
    }

    public CategoriaMeme buscarCategoriaMemePorId(Long id) {
        Optional<CategoriaMeme> memelandia = memelandiaRepository.findById(id);
        return memelandia.orElseThrow(() -> new RuntimeException("CategoriaMeme não encontrada!"));
        }
    }

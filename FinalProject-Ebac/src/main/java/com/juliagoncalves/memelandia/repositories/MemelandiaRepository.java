package com.juliagoncalves.memelandia.repositories;

import com.juliagoncalves.memelandia.entity.CategoriaMeme;
import org.springframework.data.repository.CrudRepository;


public interface MemelandiaRepository extends CrudRepository<CategoriaMeme, Long> {
}


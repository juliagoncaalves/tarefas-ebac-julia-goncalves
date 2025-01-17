package meme.repository;

import meme.entity.Meme;
import org.springframework.data.repository.CrudRepository;

public interface MemeRepository extends CrudRepository<Meme, Long> {
}

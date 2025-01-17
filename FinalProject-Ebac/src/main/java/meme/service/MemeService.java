package meme.service;

import meme.repository.MemeRepository;
import meme.entity.Meme;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MemeService {

    @Autowired
    private final MemeRepository memeRepository;

    public MemeService(MemeRepository memeRepository) {
        this.memeRepository = memeRepository;
    }

    public Meme criarMeme(Meme meme) {
        return memeRepository.save(meme);
    }

    public Iterable<Meme> buscarTodosMemes() {
        return memeRepository.findAll();
    }
}

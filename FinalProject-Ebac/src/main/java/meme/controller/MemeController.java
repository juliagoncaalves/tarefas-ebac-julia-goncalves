package meme.controller;

import meme.client.MemeClient;
import meme.entity.CategoriaMeme;
import meme.entity.Meme;
import meme.entity.Usuario;
import meme.service.MemeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@RestController
@RequestMapping("memelandia")
public class MemeController {

    private static final Logger logger = LoggerFactory.getLogger(MemeController.class);
    private final MemeService memeService;
    private final MemeClient memeClient;

    @Autowired
    public MemeController(MemeService memeService, MemeClient memeClient) {
        this.memeService = memeService;
        this.memeClient = memeClient;
    }

    @GetMapping
    public Iterable<Meme> buscarTodosMemes() {
        logger.info("Buscando todos memes.");
        Iterable<Meme> memes = memeService.buscarTodosMemes();
        Long contador = StreamSupport.stream(memes.spliterator(), false).count();
        logger.info("Memes {} encontrados ", contador);
        return memes;
    }

    @PostMapping
    public Meme criarMeme(@RequestBody Meme meme) {
        logger.info("Criando meme {}", meme);
        Long usuarioId = meme.getUsuarioId();
        Long categoriaMemeId = meme.getCategoriaMemeId();
        Usuario usuario =  memeClient.encontrarUsuarioPorId(usuarioId);
        CategoriaMeme categoriaMeme = memeClient.encontrarCategoriaMemePorId(categoriaMemeId);

        if (usuario == null || categoriaMeme == null) {
            logger.warn("Usuário ou Categoria não encontrada para o Meme: {}", meme);
            return null;
        }

        meme.setUsuarioId(usuario.getId());
        meme.setCategoriaMemeId(categoriaMeme.getId());
        Meme novoMeme = memeService.criarMeme(meme);
        logger.info("Meme criado com sucesso: {}", novoMeme);
        return novoMeme;
    }

    @GetMapping("/categorias-meme")
    public Iterable<CategoriaMeme> encontrarTodasCategoriasMemes() {
        logger.info("Encontrando todas categorias meme.");
        Iterable<CategoriaMeme> categorias = memeClient.encontrarTodasCategoriasMemes();
        Long contador = StreamSupport.stream(categorias.spliterator(), false).count();
        logger.info("Categorias {} encontrados ", contador);
        return categorias;
    }

    @GetMapping("/usuarios")
    public Iterable<Usuario> encontrarTodosUsuarios() {
        logger.info("Encontrando todas usuarios.");
        Iterable<Usuario> usuarios = memeClient.encontrarTodosUsuarios();
        Long contador = StreamSupport.stream(usuarios.spliterator(), false).count();
        logger.info("Usuarios encontrados ", contador);
        return usuarios;
    }

    @GetMapping("/meme-do-dia")
    public Meme encontrarMemeDoDia() {
        logger.info("Encontrando meme do dia.");
        List<Meme> memes = StreamSupport.stream(memeService.buscarTodosMemes().spliterator(), false).collect(Collectors.toList());

        if (memes.isEmpty()) {
            logger.warn("Nenhum meme encontrado");
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Nenhum meme encontrado no banco de dados");
        }

        Collections.shuffle(memes);
        Meme memeDoDia = memes.get(0);
        logger.info("Meme encontrado: {}", memeDoDia);
        return memeDoDia;
    }
}

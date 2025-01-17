package user.controller;

import user.entity.Usuario;
import user.service.UsuarioService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UsuarioController {

    private static final Logger logger = LoggerFactory.getLogger(UsuarioController.class);
    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @PostMapping
    public Usuario criarUsuario(@RequestBody Usuario usuario) {
        logger.info("Criando usuário: {}", usuario);
        Usuario usuarioCriado = usuarioService.criar(usuario);
        logger.info("Usuário criado: {}", usuarioCriado);
        return usuarioCriado;
    }

    @GetMapping
    public Iterable<Usuario> buscarPorTodos() {
        logger.info("Buscando todos usuários");
        Iterable<Usuario> usuarios = usuarioService.buscarTodos();
        logger.info("Usuário {} encontrado", usuarios.spliterator().getExactSizeIfKnown());
        return usuarios;
    }

    @GetMapping("/{id}")
    public Usuario buscarPorId(@PathVariable Long id) {
        logger.info("Buscando usuário com id: {} ", id);
        Usuario usuarios = usuarioService.buscarPorId(id);
        logger.info("Usuário encontrado: {}", usuarios);
        return usuarios;
    }

}

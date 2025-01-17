package meme.client;

import meme.entity.CategoriaMeme;
import meme.entity.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Configuration
@EnableFeignClients
@EnableDiscoveryClient
public class MemeClient {

    @Autowired
    private ICategoriaClient iCategoriaClient;

    @Autowired
    private IUsuarioClient iUsuarioClient;

    @FeignClient(name = "categoria")
    interface ICategoriaClient {
        @RequestMapping(value = "/categorias-meme", method = RequestMethod.GET)
        @ResponseBody Iterable<CategoriaMeme> encontrarTodasCategoriasMemes();

        @RequestMapping(value = "/categorias-meme/{id}", method = RequestMethod.GET)
        @ResponseBody CategoriaMeme encontrarCategoriaMemePorId(@PathVariable("id") Long id);
    }

    @FeignClient(name = "usuario")
    interface IUsuarioClient {
        @RequestMapping(value = "/usuarios", method = RequestMethod.GET)
        @ResponseBody Iterable<Usuario> encontrarTodosUsuarios();

        @RequestMapping(value = "/usuarios/{id}", method = RequestMethod.GET)
        @ResponseBody Usuario encontrarUsuarioPorId(@PathVariable("id") Long id);
    }

    public Iterable<CategoriaMeme> encontrarTodasCategoriasMemes() {
        return iCategoriaClient.encontrarTodasCategoriasMemes();
    }

    public Iterable<Usuario> encontrarTodosUsuarios() {
        return iUsuarioClient.encontrarTodosUsuarios();
    }

    public Usuario encontrarUsuarioPorId(Long id) {
        return iUsuarioClient.encontrarUsuarioPorId(id);
    }

    public CategoriaMeme encontrarCategoriaMemePorId(Long id) {
        return iCategoriaClient.encontrarCategoriaMemePorId(id);
    }
}

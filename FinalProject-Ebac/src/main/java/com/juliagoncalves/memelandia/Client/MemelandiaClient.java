package com.juliagoncalves.memelandia.Client;

import com.juliagoncalves.memelandia.entity.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Configuration
@EnableFeignClients
@EnableDiscoveryClient
@Lazy
public class MemelandiaClient {

    @Autowired
    private MemelandiaClient categoriaMemeClient;

    @FeignClient(name = "user")
    interface ICategoriaMemeClient {
        @RequestMapping(path = "/users", method = RequestMethod.GET)
        @ResponseBody Iterable<Usuario> buscarTodos();

        @RequestMapping(path = "/users/{id}", method = RequestMethod.GET)
        @ResponseBody Usuario buscarPorId(@PathVariable("id") Long id);
    }

    public Iterable<Usuario> buscarTodos() {
        return categoriaMemeClient.buscarTodos();
    }

    public Usuario buscarPorId(Long id) {
        return categoriaMemeClient.buscarPorId(id);
    }
}

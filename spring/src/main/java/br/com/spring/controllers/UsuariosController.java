package br.com.spring.controllers;

import br.com.spring.model.Usuarios;
import br.com.spring.repository.UsuariosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/usuarios")
public class UsuariosController {

    @Autowired
    private UsuariosRepository usuariosRepository;


    @RequestMapping(value={"", "/"}, method = RequestMethod.GET)
    public List<Usuarios> index() {
        return this.usuariosRepository.findAll();
    }

    @RequestMapping(value={"/cadastrar", "/editar"}, method = RequestMethod.POST)
    public Usuarios cadastrarEditar(@RequestBody Usuarios usuarios) {
        try {
            return this.usuariosRepository.save(usuarios);
        } catch (Exception e) {
            return null;
        }
    }

    @PostMapping("/excluir/{id}")
    public void excluir(@PathVariable("id") long id) {
        List<Usuarios> ret_usuario = this.usuariosRepository.retornaUsuarioOndePessoaNull(id);
        if (!ret_usuario.isEmpty()) {
            this.usuariosRepository.deleteById(id);
        }
    }

}

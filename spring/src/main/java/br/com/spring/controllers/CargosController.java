package br.com.spring.controllers;

import br.com.spring.model.Cargos;
import br.com.spring.repository.CargosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/cargos")
public class CargosController {

    @Autowired
    private CargosRepository cargosRepository;


    @RequestMapping(value={"", "/"}, method = RequestMethod.GET)
    public List<Cargos> index() {
        return this.cargosRepository.findAll();
    }

    @RequestMapping(value={"/cadastrar", "/editar"}, method = RequestMethod.POST)
    public Cargos cadastrarEditar(@RequestBody Cargos cargos) {
        return this.cargosRepository.save(cargos);
    }

    @PostMapping("/excluir/{id}")
    public void excluir(@PathVariable("id") long id) {
        this.cargosRepository.deleteById(id);
    }

}

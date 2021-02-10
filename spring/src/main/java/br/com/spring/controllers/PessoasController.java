package br.com.spring.controllers;

import br.com.spring.model.Pessoas;
import br.com.spring.repository.PessoasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/pessoas")
public class PessoasController {

    @Autowired
    private PessoasRepository pessoasRepository;


    @RequestMapping(value={"", "/"}, method = RequestMethod.GET)
    public List<Pessoas> index() {
        return this.pessoasRepository.findAll();
    }

    @RequestMapping(value={"/cadastrar", "/editar"}, method = RequestMethod.POST)
    public Pessoas cadastrarEditar(@RequestBody Pessoas pessoas) {
        return this.pessoasRepository.save(pessoas);
    }

    @PostMapping("/excluir/{id}")
    public void excluir(@PathVariable("id") long id) {
        this.pessoasRepository.deleteById(id);
    }

}

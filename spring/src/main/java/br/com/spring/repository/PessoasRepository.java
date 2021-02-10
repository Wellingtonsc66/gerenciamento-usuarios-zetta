package br.com.spring.repository;

import br.com.spring.model.Pessoas;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PessoasRepository extends JpaRepository<Pessoas, Long> {

}

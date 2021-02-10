package br.com.spring.repository;

import br.com.spring.model.Cargos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CargosRepository extends JpaRepository<Cargos, Long> {

}

package br.com.spring.repository;

import br.com.spring.model.Usuarios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface UsuariosRepository extends JpaRepository<Usuarios, Long> {

    @Query("SELECT u FROM Usuarios u ORDER BY u.usuarioDescricao")
    public List<Usuarios> listaUsuariosEmOrdemAlfabetica();

    @Query("SELECT u FROM Usuarios u where u.usuarioId = :id AND u.pessoaId IS NULL")
    public List<Usuarios> retornaUsuarioOndePessoaNull(@Param("id") long id);

}

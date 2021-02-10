package br.com.spring.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Usuarios {
    @Id
    @Column(name = "usuario_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long usuarioId;

    @Column(name = "usuario_descricao", length = 45, nullable = false, unique = true)
    private String usuarioDescricao;

    @JoinColumn(name="pessoaId")
    @ManyToOne(cascade = CascadeType.ALL)
    private Pessoas pessoaId;

}

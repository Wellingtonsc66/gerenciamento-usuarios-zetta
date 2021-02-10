package br.com.spring.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Pessoas {
    @Id
    @Column(name = "pessoa_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long pessoaId;

    @Column(name = "pessoa_nome", nullable = false)
    private String pessoaName;

    @Column(name = "pessoa_cpf", length = 11, nullable = false, unique = true)
    private String pessoaCpf;

    @Column(name = "pessoa_sexo", length = 1)
    private String pessoaSexo;

    @Temporal(TemporalType.TIMESTAMP)
    private Date dataNascimento;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false)
    private Date dataCadastro;

    @JoinColumn(name="cargoId")
    @ManyToOne(cascade = CascadeType.ALL)
    private Cargos cargoId;

}

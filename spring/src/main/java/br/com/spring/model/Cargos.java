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
public class Cargos {
    @Id
    @Column(name = "cargo_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cargoId;

    @Column(name = "cargo_descricao", nullable = false)
    private String cargoDescricao;

}

package io.github.anjosdev.acesso_api.adapter.entities;

import io.github.anjosdev.acesso_api.core.domain.Pessoa;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_morador")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class MoradorEntity {

    @Id
    @GeneratedValue
    private Long id;
    private String nome;
    private String cpf;
    private String endereco;
    private String celular;
    private Pessoa pessoa;

    @OneToOne
    @JoinColumn(name = "pessoa_id")
    private PessoaEntity pessoaEntity;

}

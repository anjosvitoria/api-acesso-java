package io.github.anjosdev.acesso_api.adapter.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_pessoa")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class PessoaEntity {

    @Id
    @GeneratedValue
    private long id;
    private String nome;

}

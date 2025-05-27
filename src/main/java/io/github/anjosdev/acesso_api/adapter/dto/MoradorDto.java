package io.github.anjosdev.acesso_api.adapter.dto;

import io.github.anjosdev.acesso_api.core.domain.Pessoa;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class MoradorDto {
    private long id;
    private String email;
    private String senha;
    private Boolean adm;
    private String nome;
    private Pessoa pessoa;
}

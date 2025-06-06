package io.github.anjosdev.acesso_api.adapter.dto;

import io.github.anjosdev.acesso_api.core.domain.Pessoa;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class MoradorDto {
    private Long id;
    private String nome;
    private String cpf;
    private String endereco;
    private String celular;
}

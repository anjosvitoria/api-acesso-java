package io.github.anjosdev.acesso_api.adapter.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class UsuarioDto {
    private Long id;
    private String email;
    private String senha;
    private Boolean adm;
    private String nome;


}

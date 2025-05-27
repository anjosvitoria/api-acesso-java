package io.github.anjosdev.acesso_api.adapter.converters;

import io.github.anjosdev.acesso_api.adapter.dto.UsuarioDto;
import io.github.anjosdev.acesso_api.core.domain.Pessoa;
import io.github.anjosdev.acesso_api.core.domain.Usuario;
import org.springframework.stereotype.Component;

@Component
public class UsuarioConverter {

    public Usuario toDomain(UsuarioDto usuarioDto){
        return new Usuario(usuarioDto.getId(),
                usuarioDto.getEmail(),
                usuarioDto.getSenha(),
                usuarioDto.getAdm(),
                new Pessoa(null, usuarioDto.getNome())
                );
    }

    public UsuarioDto toDto (Usuario usuario){
        return new UsuarioDto(
                usuario.getId(),
                usuario.getEmail(),
                usuario.getSenha(),
                usuario.getAdm(),
                usuario.getPessoa().getNome());
    }
}

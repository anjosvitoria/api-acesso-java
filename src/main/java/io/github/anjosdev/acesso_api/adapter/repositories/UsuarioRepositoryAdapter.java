package io.github.anjosdev.acesso_api.adapter.repositories;

import io.github.anjosdev.acesso_api.core.domain.Usuario;
import io.github.anjosdev.acesso_api.core.ports.UsuarioRepositoryPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UsuarioRepositoryAdapter implements UsuarioRepositoryPort {

    private  final UsuarioRepository usuarioRepository;

    @Override
    public Usuario create(Usuario usuario) {
        return ;
    }
}

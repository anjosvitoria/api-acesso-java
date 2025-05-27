package io.github.anjosdev.acesso_api.core.service;

import io.github.anjosdev.acesso_api.core.domain.Usuario;
import io.github.anjosdev.acesso_api.core.ports.UsuarioRepositoryPort;
import io.github.anjosdev.acesso_api.core.ports.UsuarioServicePort;

public class UsuarioService implements UsuarioServicePort {

    private final UsuarioRepositoryPort usuarioRepositoryPort;

    public UsuarioService(UsuarioRepositoryPort usuarioRepositoryPort) {
        this.usuarioRepositoryPort = usuarioRepositoryPort;
    }


    @Override
    public Usuario createUsuario(Usuario usuario) throws IllegalAccessException {
        Usuario usuarioExiste = usuarioRepositoryPort.obtainByEmail(usuario.getEmail());
        if (usuarioExiste != null) {
            throw new IllegalAccessException("Usuario já existe");
        }
        return usuarioRepositoryPort.create(usuario);
    }
}

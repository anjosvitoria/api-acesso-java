package io.github.anjosdev.acesso_api.core.service;

import io.github.anjosdev.acesso_api.core.domain.Usuario;
import io.github.anjosdev.acesso_api.core.ports.UsuarioServicePort;

public class UsuarioService implements UsuarioServicePort {


    @Override
    public Usuario createUsuario(Usuario usuario) {

        return usuario;
    }
}

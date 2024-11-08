package io.github.anjosdev.acesso_api.core.domain.ports;

import io.github.anjosdev.acesso_api.core.domain.Usuario;

public interface UsuarioServicePort {
    Usuario createUsuario(Usuario usuario);
}

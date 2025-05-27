package io.github.anjosdev.acesso_api.core.ports;

import io.github.anjosdev.acesso_api.core.domain.Usuario;

public interface UsuarioRepositoryPort {
    public Usuario create(Usuario usuario);
    public Usuario obtainByEmail (String email);
}

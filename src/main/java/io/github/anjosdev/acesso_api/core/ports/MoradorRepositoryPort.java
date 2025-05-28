package io.github.anjosdev.acesso_api.core.ports;

import io.github.anjosdev.acesso_api.core.domain.Usuario;

public interface MoradorRepositoryPort {
    public Usuario create(Usuario usuario);
    public Usuario obtainByEmail (String email);
}

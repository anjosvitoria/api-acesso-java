package io.github.anjosdev.acesso_api.core.ports;

import io.github.anjosdev.acesso_api.core.domain.Morador;
import io.github.anjosdev.acesso_api.core.domain.Usuario;

public interface MoradorRepositoryPort {
    public Morador create(Morador morador);
    public Morador obtainByCpf(String cpf);
}

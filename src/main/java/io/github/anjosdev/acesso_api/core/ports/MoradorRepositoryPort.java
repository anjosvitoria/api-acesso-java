package io.github.anjosdev.acesso_api.core.ports;

import io.github.anjosdev.acesso_api.core.domain.Morador;

import java.util.Collection;

public interface MoradorRepositoryPort {
     Morador create(Morador morador);
     Morador obtainByCpf(String cpf);
     Collection<Morador> findAll();
}

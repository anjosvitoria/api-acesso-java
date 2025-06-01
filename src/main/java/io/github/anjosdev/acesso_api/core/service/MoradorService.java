package io.github.anjosdev.acesso_api.core.service;

import io.github.anjosdev.acesso_api.core.domain.Morador;
import io.github.anjosdev.acesso_api.core.ports.MoradorRepositoryPort;
import io.github.anjosdev.acesso_api.core.ports.MoradorServicePort;

public class MoradorService implements MoradorServicePort {

    private final MoradorRepositoryPort moradorRepositoryPort;

    public MoradorService(MoradorRepositoryPort moradorRepositoryPort) {
        this.moradorRepositoryPort = moradorRepositoryPort;
    }

    @Override
    public Morador createMorador(Morador morador) throws IllegalAccessException {
        return moradorRepositoryPort.create(morador);
    }
}

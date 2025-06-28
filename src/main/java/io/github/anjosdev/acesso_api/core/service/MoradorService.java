package io.github.anjosdev.acesso_api.core.service;

import io.github.anjosdev.acesso_api.core.domain.Morador;
import io.github.anjosdev.acesso_api.core.ports.MoradorRepositoryPort;
import io.github.anjosdev.acesso_api.core.ports.MoradorServicePort;

import java.util.Collection;

public class MoradorService implements MoradorServicePort {

    private final MoradorRepositoryPort moradorRepositoryPort;

    public MoradorService(MoradorRepositoryPort moradorRepositoryPort) {
        this.moradorRepositoryPort = moradorRepositoryPort;
    }

    @Override
    public Morador createMorador(Morador morador) throws IllegalAccessException {
        Morador moradorExistente = moradorRepositoryPort.obtainByCpf((morador.getCpf()));
        if(moradorExistente != null){
            throw new IllegalAccessException("morador ja existe");
        }
        return moradorRepositoryPort.create(morador);
    }

    @Override
    public Collection<Morador> findAll() {
        return moradorRepositoryPort.findAll();
    }
}

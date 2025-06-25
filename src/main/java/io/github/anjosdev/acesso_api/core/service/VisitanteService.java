package io.github.anjosdev.acesso_api.core.service;

import io.github.anjosdev.acesso_api.core.Exceptions.BusinessException;
import io.github.anjosdev.acesso_api.core.domain.Visitante;
import io.github.anjosdev.acesso_api.core.ports.VisitanteRepositoryPort;
import io.github.anjosdev.acesso_api.core.ports.VisitanteServicePort;

import java.util.Collection;

public class VisitanteService implements VisitanteServicePort {

    private final VisitanteRepositoryPort visitanteRepositoryPort;

    public VisitanteService(VisitanteRepositoryPort visitanteRepositoryPort) {
        this.visitanteRepositoryPort = visitanteRepositoryPort;
    }

    @Override
    public Visitante createVisitante(Visitante visitante) {
        visitanteRepositoryPort.obtainByRg(visitante.getRg())
                .ifPresent(v -> {
                    throw new BusinessException("visitante já existe");
                });
        return visitanteRepositoryPort.create(visitante);
    }

    @Override
    public Visitante obtainByRg(String rg) {
       return visitanteRepositoryPort.obtainByRg(rg)
                .orElseThrow(() -> new IllegalArgumentException("visitante não encontrado"));
    }


    @Override
    public Collection<Visitante> listAll() {
        return visitanteRepositoryPort.listAll();
    }
}

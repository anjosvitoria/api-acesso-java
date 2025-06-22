package io.github.anjosdev.acesso_api.core.service;

import io.github.anjosdev.acesso_api.core.domain.Visitante;
import io.github.anjosdev.acesso_api.core.ports.VisitanteRepositoryPort;
import io.github.anjosdev.acesso_api.core.ports.VisitanteServicePort;

public class VisitanteService implements VisitanteServicePort {

    private final VisitanteRepositoryPort visitanteRepositoryPort;

    public VisitanteService(VisitanteRepositoryPort visitanteRepositoryPort) {
        this.visitanteRepositoryPort = visitanteRepositoryPort;
    }

    @Override
    public Visitante createVisitante(Visitante visitante) throws IllegalAccessException {

        Visitante visitanteExistente = visitanteRepositoryPort.obtainByRg(visitante.getRg());

        if (visitanteExistente != null) {
            throw new IllegalAccessException("visitante já existe");
        }
        return visitanteRepositoryPort.create(visitante);
    }
}

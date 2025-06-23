package io.github.anjosdev.acesso_api.core.ports;

import io.github.anjosdev.acesso_api.core.domain.Morador;
import io.github.anjosdev.acesso_api.core.domain.Visitante;

import java.util.Collection;

public interface VisitanteServicePort {

    Visitante createVisitante(Visitante visitante) throws IllegalAccessException;

    Visitante obtainByRg(String rg);

    Collection<Visitante> listAll();
}

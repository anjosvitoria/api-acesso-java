package io.github.anjosdev.acesso_api.core.ports;

import io.github.anjosdev.acesso_api.core.domain.Morador;
import io.github.anjosdev.acesso_api.core.domain.Visitante;

public interface VisitanteServicePort {

    Visitante createVisitante(Visitante visitante) throws IllegalAccessException;
}

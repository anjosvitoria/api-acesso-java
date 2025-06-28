package io.github.anjosdev.acesso_api.core.ports;

import io.github.anjosdev.acesso_api.adapter.dto.MoradorDto;
import io.github.anjosdev.acesso_api.core.domain.Morador;

import java.util.Collection;

public interface MoradorServicePort {
    Morador createMorador(Morador morador) throws IllegalAccessException;
    Collection<Morador> findAll();
}

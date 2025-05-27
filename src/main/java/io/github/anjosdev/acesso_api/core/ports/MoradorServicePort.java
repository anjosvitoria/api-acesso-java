package io.github.anjosdev.acesso_api.core.ports;

import io.github.anjosdev.acesso_api.core.domain.Morador;

public interface MoradorServicePort {
    Morador createMorador(Morador morador) throws IllegalAccessException;
}

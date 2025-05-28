package io.github.anjosdev.acesso_api.adapter.Controller;

import io.github.anjosdev.acesso_api.adapter.converters.MoradorConverter;
import io.github.anjosdev.acesso_api.adapter.dto.MoradorDto;
import io.github.anjosdev.acesso_api.core.domain.Morador;
import io.github.anjosdev.acesso_api.core.ports.MoradorServicePort;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/moradores")
@RequiredArgsConstructor
public class MoradorController {

    private final MoradorServicePort moradorServicePort;
    private final MoradorConverter moradorConverter;

    @PostMapping
    @ResponseStatus(HttpStatus.ACCEPTED)
    public MoradorDto create(@RequestBody MoradorDto moradorDto) throws IllegalAccessException {
        Morador novoMorador = moradorServicePort.createMorador(moradorConverter.toDomain(moradorDto));
        return  moradorConverter.toDto(novoMorador);
    }
}

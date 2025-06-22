package io.github.anjosdev.acesso_api.adapter.Controller;

import io.github.anjosdev.acesso_api.adapter.converters.VisitanteConverter;
import io.github.anjosdev.acesso_api.adapter.dto.VisitanteDto;
import io.github.anjosdev.acesso_api.core.domain.Visitante;
import io.github.anjosdev.acesso_api.core.ports.VisitanteServicePort;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/visitantes")
@RequiredArgsConstructor
public class VisitanteController {

    private final VisitanteConverter visitanteConverter;
    private final VisitanteServicePort visitanteServicePort;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public VisitanteDto create(@RequestBody VisitanteDto visitanteDto) throws IllegalAccessException {
        Visitante visitante =  visitanteServicePort.createVisitante(visitanteConverter.toDomain(visitanteDto));
        return VisitanteConverter.toDto(visitante);
    }
}

package io.github.anjosdev.acesso_api.adapter.converters;

import io.github.anjosdev.acesso_api.adapter.dto.VisitanteDto;
import io.github.anjosdev.acesso_api.core.domain.Pessoa;
import io.github.anjosdev.acesso_api.core.domain.Visitante;
import org.springframework.stereotype.Component;

@Component
public class VisitanteConverter {

    public Visitante toDomain(VisitanteDto visitanteDto){
        return new Visitante(
                visitanteDto.getId(),
                visitanteDto.getRg(),
                new Pessoa(null, visitanteDto.getNome())
        );
    }

    public VisitanteDto toDto(Visitante visitante){
        return new VisitanteDto(visitante.getId(),
                visitante.getPessoa().getNome(),
                visitante.getRg()
        );
    }
}

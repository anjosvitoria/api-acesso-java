package io.github.anjosdev.acesso_api.adapter.repositories;

import io.github.anjosdev.acesso_api.adapter.entities.VisitanteEntity;
import io.github.anjosdev.acesso_api.core.domain.Visitante;
import io.github.anjosdev.acesso_api.core.ports.VisitanteRepositoryPort;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class VisitanteRepositoryAdapter implements VisitanteRepositoryPort {

    private final VisitanteRepository visitanteRepository;
    private final PessoaRepositoryAdpater pessoaRepositoryAdpater;
    private final ModelMapper modelMapper;
    @Override
    public Visitante create(Visitante visitante) {
        VisitanteEntity entity = modelMapper.map(visitante, VisitanteEntity.class);
        entity.setPessoaEntity(pessoaRepositoryAdpater.createpessoa(visitante.getPessoa()));
        return modelMapper.map(visitanteRepository.save(entity), Visitante.class);
    }

    @Override
    public Visitante obtainByRg(String rg) {
        VisitanteEntity visitanteByrg = visitanteRepository.findByrg(rg);

        if(visitanteByrg == null) {
            return null;
        }
        return modelMapper.map(visitanteByrg, Visitante.class);
    }
}

package io.github.anjosdev.acesso_api.adapter.repositories;

import io.github.anjosdev.acesso_api.adapter.entities.MoradorEntity;
import io.github.anjosdev.acesso_api.core.domain.Morador;
import io.github.anjosdev.acesso_api.core.ports.MoradorRepositoryPort;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class MoradorRepositoryAdapter implements MoradorRepositoryPort {

    private final MoradorRepository moradorRepository;
    private final PessoaRepositoryAdpater pessoaRepositoryAdpater;
    private final ModelMapper modelMapper;

    @Override
    public Morador create(Morador morador) {

        MoradorEntity entity = modelMapper.map(morador, MoradorEntity.class);
        entity.setPessoaEntity(pessoaRepositoryAdpater.createpessoa(morador.getPessoa()));
        MoradorEntity novoMorador = moradorRepository.save(entity);
        return modelMapper.map(novoMorador, Morador.class);
    }

    @Override
    public Morador obtainByCpf(String cpf) {
        MoradorEntity moradorByCpf = moradorRepository.findByCpf(cpf);
        if (moradorByCpf == null) {
            return null;
        }
        return modelMapper.map(moradorByCpf, Morador.class);
    }
}

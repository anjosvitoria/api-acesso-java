package io.github.anjosdev.acesso_api.adapter.repositories;

import io.github.anjosdev.acesso_api.adapter.entities.MoradorEntity;
import io.github.anjosdev.acesso_api.adapter.entities.PessoaEntity;
import io.github.anjosdev.acesso_api.core.domain.Morador;
import io.github.anjosdev.acesso_api.core.domain.Pessoa;
import io.github.anjosdev.acesso_api.core.ports.MoradorRepositoryPort;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class MoradorRepositoryAdapter implements MoradorRepositoryPort {

    private final MoradorRepository moradorRepository;
    private final PessoaRepository pessoaRepository;
    private final ModelMapper modelMapper;


    @Override
    public Morador create(Morador morador) {
        MoradorEntity entity = modelMapper.map(morador, MoradorEntity.class);
        entity.setPessoaEntity(createpessoa(morador.getPessoa()));
        MoradorEntity novoMorador = moradorRepository.save(entity);
        return modelMapper.map(novoMorador, Morador.class);
    }

    @Override
    public Morador obtainByCpf(String cpf) {
        return null;
    }

    private PessoaEntity createpessoa(Pessoa pessoa){
        PessoaEntity pessoaEntity = modelMapper.map(pessoa, PessoaEntity.class);
        return  pessoaRepository.save(pessoaEntity);
    }
}

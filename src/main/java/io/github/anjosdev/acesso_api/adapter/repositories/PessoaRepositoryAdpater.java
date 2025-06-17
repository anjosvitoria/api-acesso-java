package io.github.anjosdev.acesso_api.adapter.repositories;

import io.github.anjosdev.acesso_api.adapter.entities.PessoaEntity;
import io.github.anjosdev.acesso_api.core.domain.Pessoa;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class PessoaRepositoryAdpater {

    private final PessoaRepository pessoaRepository;
    private final ModelMapper modelMapper;
    public PessoaEntity createpessoa(Pessoa pessoa){
        PessoaEntity pessoaEntity = modelMapper.map(pessoa, PessoaEntity.class);
        return  pessoaRepository.save(pessoaEntity);
    }
}

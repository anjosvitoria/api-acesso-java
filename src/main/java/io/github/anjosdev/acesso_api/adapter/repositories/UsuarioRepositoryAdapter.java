package io.github.anjosdev.acesso_api.adapter.repositories;

import io.github.anjosdev.acesso_api.adapter.entities.PessoaEntity;
import io.github.anjosdev.acesso_api.adapter.entities.UsuarioEntity;
import io.github.anjosdev.acesso_api.core.domain.Usuario;
import io.github.anjosdev.acesso_api.core.ports.UsuarioRepositoryPort;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UsuarioRepositoryAdapter implements UsuarioRepositoryPort {

    private final UsuarioRepository usuarioRepository;
    private final PessoaRepository pessoaRepository;
    private final ModelMapper modelMapper;

    @Override
    public Usuario create(Usuario usuario) {
        PessoaEntity pessoaEntityMap = modelMapper.map(usuario.getPessoa(), PessoaEntity.class);
        PessoaEntity pessoaEntity = pessoaRepository.save(pessoaEntityMap);
        UsuarioEntity novoUsuario = usuarioRepository.
                save(modelMapper.map(usuario, UsuarioEntity.class));
        return modelMapper.map(novoUsuario, Usuario.class);
    }
}

package io.github.anjosdev.acesso_api.adapter.repositories;

import io.github.anjosdev.acesso_api.adapter.entities.PessoaEntity;
import io.github.anjosdev.acesso_api.adapter.entities.UsuarioEntity;
import io.github.anjosdev.acesso_api.core.domain.Pessoa;
import io.github.anjosdev.acesso_api.core.domain.Usuario;
import io.github.anjosdev.acesso_api.core.ports.UsuarioRepositoryPort;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UsuarioRepositoryAdapter implements UsuarioRepositoryPort {

    private final UsuarioRepository usuarioRepository;
    private final PessoaRepositoryAdpater pessoaRepositoryAdpater;
    private final ModelMapper modelMapper;

    @Override
    public Usuario create(Usuario usuario) {
        UsuarioEntity usuarioEntity = modelMapper.map(usuario, UsuarioEntity.class);
        usuarioEntity.setPessoaEntity(pessoaRepositoryAdpater.createpessoa(usuario.getPessoa()));
        UsuarioEntity novoUsuario = usuarioRepository.save(usuarioEntity);

        return modelMapper.map(novoUsuario, Usuario.class);
    }

    @Override
    public Usuario obtainByEmail(String email) {
        UsuarioEntity usuarioByEmail = usuarioRepository.findByEmail(email);

        if(usuarioByEmail == null){
            return null;
        }

        return modelMapper.map(usuarioByEmail, Usuario.class);
    }
}

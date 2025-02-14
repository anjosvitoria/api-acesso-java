package io.github.anjosdev.acesso_api.adapter.repositories;

import io.github.anjosdev.acesso_api.adapter.entities.UsuarioEntity;
import io.github.anjosdev.acesso_api.core.domain.Usuario;
import io.github.anjosdev.acesso_api.core.ports.UsuarioRepositoryPort;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UsuarioRepositoryAdapter implements UsuarioRepositoryPort {

    private  final UsuarioRepository usuarioRepository;

    private  final ModelMapper modelMapper;

    @Override
    public Usuario create(Usuario usuario) {
        return modelMapper.map(usuarioRepository.save(modelMapper.map(usuario, UsuarioEntity.class)), Usuario.class);
    }
}

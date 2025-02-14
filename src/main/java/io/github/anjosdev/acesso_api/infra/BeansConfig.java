package io.github.anjosdev.acesso_api.infra;

import io.github.anjosdev.acesso_api.core.ports.UsuarioRepositoryPort;
import io.github.anjosdev.acesso_api.core.ports.UsuarioServicePort;
import io.github.anjosdev.acesso_api.core.service.UsuarioService;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeansConfig {
    @Bean
    public ModelMapper modelMapper(){
        return new ModelMapper();
    }

@Bean
 public UsuarioServicePort usuarioServiceImpl(UsuarioRepositoryPort usuarioRepositoryPort){

        return new UsuarioService(usuarioRepositoryPort);
 }
}

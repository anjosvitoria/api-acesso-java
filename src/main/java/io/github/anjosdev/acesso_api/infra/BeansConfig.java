package io.github.anjosdev.acesso_api.infra;

import io.github.anjosdev.acesso_api.core.ports.*;
import io.github.anjosdev.acesso_api.core.service.MoradorService;
import io.github.anjosdev.acesso_api.core.service.UsuarioService;
import io.github.anjosdev.acesso_api.core.service.VisitanteService;
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

     @Bean
     public MoradorServicePort moradorServicePort(MoradorRepositoryPort moradorRepositoryPort){
         return new MoradorService(moradorRepositoryPort);
     }

    @Bean
    public VisitanteServicePort visitanteServicePort(VisitanteRepositoryPort visitanteRepositoryPort){
        return new VisitanteService(visitanteRepositoryPort);
    }
}

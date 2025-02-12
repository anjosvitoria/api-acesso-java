package io.github.anjosdev.acesso_api.infra;

import io.github.anjosdev.acesso_api.core.ports.UsuarioServicePort;
import io.github.anjosdev.acesso_api.core.service.UsuarioService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeansConfig {

@Bean
 public UsuarioServicePort usuarioServiceImpl(){
     return new UsuarioService();
 }
}

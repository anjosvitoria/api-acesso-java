package io.github.anjosdev.acesso_api.adapter.repositories;

import io.github.anjosdev.acesso_api.adapter.entities.UsuarioEntity;
import io.github.anjosdev.acesso_api.core.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository <UsuarioEntity, Long>{
    UsuarioEntity findByEmail(String email);
}

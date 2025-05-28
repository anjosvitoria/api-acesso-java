package io.github.anjosdev.acesso_api.adapter.repositories;

import io.github.anjosdev.acesso_api.adapter.entities.MoradorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MoradorRepository extends JpaRepository <MoradorEntity, Long>{
    MoradorEntity findByCpf(String cpf);
}

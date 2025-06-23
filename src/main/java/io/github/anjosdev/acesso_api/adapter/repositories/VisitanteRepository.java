package io.github.anjosdev.acesso_api.adapter.repositories;

import io.github.anjosdev.acesso_api.adapter.entities.VisitanteEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface VisitanteRepository extends JpaRepository<VisitanteEntity, Long> {

    Optional <VisitanteEntity> findByrg(String rg);
}

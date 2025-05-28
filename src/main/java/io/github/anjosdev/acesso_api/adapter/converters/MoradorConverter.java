package io.github.anjosdev.acesso_api.adapter.converters;

import io.github.anjosdev.acesso_api.adapter.dto.MoradorDto;
import io.github.anjosdev.acesso_api.adapter.dto.UsuarioDto;
import io.github.anjosdev.acesso_api.core.domain.Morador;
import io.github.anjosdev.acesso_api.core.domain.Pessoa;
import io.github.anjosdev.acesso_api.core.domain.Usuario;
import org.springframework.stereotype.Component;

@Component
public class MoradorConverter {

    public Morador toDomain(MoradorDto moradorDto){
        return new Morador(moradorDto.getId(),
                moradorDto.getCpf(),
                moradorDto.getEndereco(),
                moradorDto.getCelular(),
                new Pessoa(null, moradorDto.getNome())
                );
    }

    public MoradorDto toDto (Morador morador){
        return new MoradorDto(
                morador.getId(),
                morador.getCpf(),
                morador.getEndereco(),
                morador.getCelular(),
                morador.getPessoa().getNome());
    }
}

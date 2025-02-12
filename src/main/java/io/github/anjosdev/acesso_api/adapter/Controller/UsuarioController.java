package io.github.anjosdev.acesso_api.adapter.Controller;

import io.github.anjosdev.acesso_api.adapter.converters.UsuarioConverter;
import io.github.anjosdev.acesso_api.adapter.dto.UsuarioDto;
import io.github.anjosdev.acesso_api.core.ports.UsuarioServicePort;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/usuarios")
@RequiredArgsConstructor
public class UsuarioController {

    private final UsuarioServicePort usuarioServicePort;
    private final UsuarioConverter usuarioConverter;


    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public UsuarioDto create(@RequestBody UsuarioDto usuarioDto){

        return usuarioConverter.toDto(usuarioServicePort.createUsuario(usuarioConverter.toDomain(usuarioDto)));
    }
}

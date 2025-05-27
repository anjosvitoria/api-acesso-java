package io.github.anjosdev.acesso_api.adapter.Controller;

import io.github.anjosdev.acesso_api.adapter.dto.MoradorDto;
import io.github.anjosdev.acesso_api.core.ports.MoradorServicePort;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/moradores")
@RequiredArgsConstructor
public class MoradorController {

    private final MoradorServicePort moradorServicePort;
    public MoradorDto create(@RequestBody MoradorDto moradorDto){

    }
}

package com.poli.taller1.controller.Fila;

import com.poli.taller1.persistence.entity.Fila;
import com.poli.taller1.services.Fila.FilaService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/fila")
@RequiredArgsConstructor
public class FilaController {
    private final FilaService filaService;

    @PostMapping
    public Fila crear_fila(@RequestBody Fila fila) {
        return filaService.crear_filas(fila);
    }

    @GetMapping
    public List<Fila> obtener_filas() {
        return filaService.obtener_filas();
    }
}

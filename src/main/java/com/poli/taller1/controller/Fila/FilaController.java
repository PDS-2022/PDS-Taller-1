package com.poli.taller1.controller.Fila;

import com.google.gson.Gson;
import com.poli.taller1.controller.Usuario.ResponseDeleteDTO;
import com.poli.taller1.persistence.entity.Fila;
import com.poli.taller1.persistence.entity.Tarea;
import com.poli.taller1.services.Fila.FilaService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
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


    @PutMapping
    @Transactional
    public void modificar_fila(@RequestBody Fila fila) {
        filaService.editar_fila(fila);
    }

    @DeleteMapping
    public String eliminar_fila(@RequestBody Fila fila) {
        filaService.eliminar_fila(fila);
        return new Gson().toJson(new ResponseDeleteDTO(true, "Fila eliminada con exito"));
    }
}

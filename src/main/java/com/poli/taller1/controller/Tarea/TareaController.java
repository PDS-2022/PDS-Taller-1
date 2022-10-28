package com.poli.taller1.controller.Tarea;

import com.google.gson.Gson;
import com.poli.taller1.controller.Usuario.ResponseDeleteDTO;
import com.poli.taller1.persistence.entity.Tarea;
import com.poli.taller1.services.Tarea.TareaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

@RestController
@RequestMapping("/tarea")
@RequiredArgsConstructor
public class TareaController {
    private final TareaService tareaService;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public Tarea crear_tarea(@RequestBody Tarea tarea) {
        return tareaService.crear_tarea(tarea);
    }

    @GetMapping
    public List<Tarea> obtener_tareas() {
        return tareaService.obtener_tareas();
    }

    @PutMapping
    @Transactional
    public void modificar_tarea(@RequestBody Tarea tarea) {
        tareaService.editar_tarea(tarea);
    }

    @DeleteMapping
    public String eliminar_tarea(@RequestBody Tarea tarea) {
        tareaService.eliminar_tarea(tarea);
        return new Gson().toJson(new ResponseDeleteDTO(true, "Tarea eliminada con exito"));
    }
}

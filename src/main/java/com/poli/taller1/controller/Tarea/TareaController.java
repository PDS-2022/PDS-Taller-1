package com.poli.taller1.controller.Tarea;

import com.poli.taller1.persistence.entity.Tarea;
import com.poli.taller1.services.Tarea.DTO.TareaInDTO;
import com.poli.taller1.services.Tarea.TareaService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tarea")
@RequiredArgsConstructor
public class TareaController {
    private final TareaService tareaService;

    @PostMapping
    public Tarea crear_tarea(@RequestBody TareaInDTO tareaInDTO) {
        return tareaService.crear_tarea(tareaInDTO);
    }

    @GetMapping
    public List<Tarea> obtener_tareas() {
        return tareaService.obtener_tareas();
    }

}

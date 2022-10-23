package com.poli.taller1.services.Fila.DTO;

import com.poli.taller1.persistence.entity.Tarea;
import lombok.Data;

@Data
public class FilaInDTO {
    private Long id_fila;
    private Tarea tarea;
    private Integer duracion;
}

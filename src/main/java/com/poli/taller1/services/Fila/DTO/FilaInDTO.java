package com.poli.taller1.services.Fila.DTO;

import com.poli.taller1.services.Tarea.DTO.TareaInDTO;
import com.poli.taller1.services.Usuarios.DTO.UsuarioInDTO;
import lombok.Data;

@Data
public class FilaInDTO {
    private TareaInDTO tarea;
    private Integer duracion;
    private UsuarioInDTO usuario;
}

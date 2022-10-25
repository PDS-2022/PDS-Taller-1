package com.poli.taller1.services.Usuarios.DTO;

import com.poli.taller1.persistence.entity.Dependencia;
import com.poli.taller1.services.Fila.DTO.FilaInDTO;
import lombok.Data;

import java.sql.Date;
import java.util.List;

@Data
public class UsuarioInDTO {
    private Date fecha_nacimiento;
    private Dependencia dependencia;
    private Boolean activo;
    private String[] perfil;
    private List<FilaInDTO> filas;

}


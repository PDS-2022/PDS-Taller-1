package com.poli.taller1.services.Fila.DTO;

import com.poli.taller1.persistence.entity.Fila;
import com.poli.taller1.services.IMapper;

import java.util.List;

public class FilaInDTOToFila implements IMapper<List<FilaInDTO>, List<Fila>> {
    @Override
    public List<Fila> map(List<FilaInDTO> in) {
        List<Fila> listFilas = null;

        for (int i = 0; i < in.size(); i++) {
            listFilas.get(i).setId_fila(in.get(i).getId_fila());
            listFilas.get(i).setTarea(in.get(i).getTarea());
            listFilas.get(i).setDuracion(in.get(i).getDuracion());
        }
        return listFilas;
    }
}

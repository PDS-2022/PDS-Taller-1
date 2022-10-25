package com.poli.taller1.services.Fila;

import com.poli.taller1.persistence.entity.Fila;
import com.poli.taller1.persistence.repository.FilaRepository;
import com.poli.taller1.services.Fila.ABC.IFilaService;
import com.poli.taller1.services.Fila.DTO.FilaInDTO;
import com.poli.taller1.services.Fila.DTO.FilaInDTOToFila;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FilaService implements IFilaService {
    private final FilaRepository filaRepository;
    private final FilaInDTOToFila filaInDTOToFila;

    @Override
    public Fila crear_filas(FilaInDTO filaInDTO) {
        Fila fila = filaInDTOToFila.map(filaInDTO);
        return this.filaRepository.save(fila);
    }

    @Override
    public List<Fila> obtener_filas() {
        return this.filaRepository.findAll();
    }
}

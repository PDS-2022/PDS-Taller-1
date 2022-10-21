package com.poli.taller1.persistence.entity;

import javax.persistence.Column;

public class Fila {
    @Column(name = "tarea")
    private Tarea tarea;
    @Column(name = "duracion")
    private Integer duracion;
}

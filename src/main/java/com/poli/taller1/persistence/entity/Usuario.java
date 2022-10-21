package com.poli.taller1.persistence.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Date;
import java.util.List;

public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "fecha_nacimiento")
    private Date fecha_nacimiento;
    @Column(name = "activo")
    private Boolean activo;
    @Column(name = "perfil")
    private Perfil[] perfil;
    @Column(name = "filas")
    private List<Fila> filas;
}

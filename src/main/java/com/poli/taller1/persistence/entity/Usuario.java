package com.poli.taller1.persistence.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "usuarios")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario")
    private Long id_usuario;

    @Column(name = "fecha_nacimiento")
    private Date fecha_nacimiento;

    @Column(name = "activo")
    private Boolean activo;

    @Enumerated(EnumType.STRING)
    @Column(name = "dependencia")
    private Dependencia dependencia;

    @Enumerated(EnumType.STRING)
    @Column(name = "perfil")
    @Type(type = "String[]")
    private String[] perfil;

    @OneToMany(mappedBy = "usuario", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Fila> filas;
}

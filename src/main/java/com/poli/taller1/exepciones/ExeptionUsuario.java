package com.poli.taller1.exepciones;


public class ExeptionUsuario extends RuntimeException {

    private String message;
    private Boolean status;

    public ExeptionUsuario() {
    }

    public ExeptionUsuario(Boolean status, String msg) {
        super(msg);
        this.message = msg;
        this.status = status;
    }
}
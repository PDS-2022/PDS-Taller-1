package com.poli.taller1.controller.Usuario;

import lombok.Data;

@Data
public class ResponseDeleteDTO {
    private Boolean status;
    private String message;

    public ResponseDeleteDTO(Boolean status, String message) {
        this.message = message;
        this.status = status;
    }
}

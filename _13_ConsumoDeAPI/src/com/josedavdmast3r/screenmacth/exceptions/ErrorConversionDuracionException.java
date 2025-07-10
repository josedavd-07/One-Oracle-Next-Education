package com.josedavdmast3r.screenmacth.exceptions;

public class ErrorConversionDuracionException extends RuntimeException {
    private String mensaje;

    public ErrorConversionDuracionException(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public String getMessage() {
        return this.mensaje;
    }
}


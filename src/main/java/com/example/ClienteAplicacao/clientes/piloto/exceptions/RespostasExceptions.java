package com.example.ClienteAplicacao.clientes.piloto.exceptions;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RespostasExceptions {

    private final String titulo;
    private final int status;
    private String detalhes;
    private String msgdev;

}

package com.example.DTO;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Contar {

    private String mensagem;

    private long numeroDoVisitante;

}

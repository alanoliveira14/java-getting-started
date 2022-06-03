package com.example.DTO;

import lombok.Data;
import lombok.NonNull;

@Data
public class Pessoa {

    @NonNull
    private String nome;

    @NonNull
    private String sobrenome;

    @NonNull
    private Integer idade;

    @NonNull
    private String profissao;


}

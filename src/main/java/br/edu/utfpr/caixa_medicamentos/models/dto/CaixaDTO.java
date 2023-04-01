package br.edu.utfpr.caixa_medicamentos.models.dto;

import lombok.Data;
import lombok.NonNull;

import java.util.Date;

@Data
public class CaixaDTO {
    @NonNull
    private String nome;
}

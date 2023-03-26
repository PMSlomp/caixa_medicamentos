package br.edu.utfpr.caixa_medicamentos.models.dto;

import lombok.Data;
import lombok.NonNull;

import java.util.Date;

@Data
public class MedicamentoDTO {
    @NonNull
    private String nome;
    @NonNull
    private String tipo;
    @NonNull
    private Date vencimento;
}

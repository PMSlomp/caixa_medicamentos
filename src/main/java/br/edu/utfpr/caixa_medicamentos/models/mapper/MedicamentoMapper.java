package br.edu.utfpr.caixa_medicamentos.models.mapper;

import br.edu.utfpr.caixa_medicamentos.models.domain.Medicamento;
import br.edu.utfpr.caixa_medicamentos.models.dto.MedicamentoDTO;

public class MedicamentoMapper {

    public static Medicamento toEntity(Medicamento dto){
        Medicamento entity = new Medicamento(dto.getNome(), dto.getTipo(), dto.getVencimento(), dto.getCaixa());
        return entity;
    }

    public static MedicamentoDTO toDTO(Medicamento entity){
        MedicamentoDTO dto = new MedicamentoDTO(entity.getNome(), entity.getTipo(), entity.getVencimento(), entity.getCaixa());
        return dto;
    }

}

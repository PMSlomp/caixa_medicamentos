package br.edu.utfpr.caixa_medicamentos.models.mapper;

import br.edu.utfpr.caixa_medicamentos.models.domain.Caixa;
import br.edu.utfpr.caixa_medicamentos.models.dto.CaixaDTO;

public class CaixaMapper {

    public static Caixa toEntity(Caixa dto){
        Caixa entity = new Caixa(dto.getNome());
        return entity;
    }

    public static CaixaDTO toDTO(Caixa entity){
        CaixaDTO dto = new CaixaDTO(entity.getNome());
        return dto;
    }

}

package br.edu.utfpr.caixa_medicamentos.service;

import br.edu.utfpr.caixa_medicamentos.models.dao.MedicamentoDAO;
import br.edu.utfpr.caixa_medicamentos.models.domain.Medicamento;

public class MedicametoService extends AbstractService<Long, Medicamento> {

    public MedicametoService() {
        dao = new MedicamentoDAO();
    }

}

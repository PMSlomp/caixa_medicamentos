package br.edu.utfpr.caixa_medicamentos.service;

import br.edu.utfpr.caixa_medicamentos.models.dao.CaixaDAO;
import br.edu.utfpr.caixa_medicamentos.models.domain.Caixa;

public class CaixaService extends AbstractService<Long, Caixa> {

    public CaixaService() {
        dao = new CaixaDAO();
    }

}

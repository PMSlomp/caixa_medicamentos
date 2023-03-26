package br.edu.utfpr.caixa_medicamentos.controller;

import br.edu.utfpr.caixa_medicamentos.models.domain.Medicamento;
import br.edu.utfpr.caixa_medicamentos.models.dto.MedicamentoDTO;
import br.edu.utfpr.caixa_medicamentos.models.mapper.MedicamentoMapper;
import br.edu.utfpr.caixa_medicamentos.service.MedicametoService;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "NovoMedicamento", value = "/novo-med")
public class NovoMedicamento extends HttpServlet {
    private static final long serialVersionUID = 1L;
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        RequestDispatcher req =  request.getRequestDispatcher("/WEB-INF/view/novoMedicamento.jsp");
        req.forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        MedicametoService medService = new MedicametoService();

        String nomeMed = request.getParameter("nome");
        String tipoMed = request.getParameter("tipo");
        String vencMed = request.getParameter("vencimento");

        Date datMed;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            datMed = sdf.parse(vencMed);
        }
        catch (ParseException e) {
            throw new NumberFormatException();
        }

        List<Medicamento> medApp = (List<Medicamento>) getServletContext().getAttribute("medicamentos");
        if(medApp == null){
            medApp = new ArrayList<Medicamento>();
            getServletContext().setAttribute("medicamentos", medApp);
        }

        Medicamento med = new Medicamento(nomeMed, tipoMed, datMed);
        //ESCOPO DE REQUISIÇÃO
        request.setAttribute("flash.med", med);

        medService.save(med);
        MedicamentoDTO medDTO = MedicamentoMapper.toDTO(med);

        medApp.add(med);
        getServletContext().setAttribute("medicamentos", medApp);

        request.setAttribute("medicamentos", medDTO);

        request.getRequestDispatcher("/tempo").forward(request,response);
    }

}

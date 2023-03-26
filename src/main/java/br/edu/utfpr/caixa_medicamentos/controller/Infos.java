package br.edu.utfpr.caixa_medicamentos.controller;

import br.edu.utfpr.caixa_medicamentos.models.domain.Medicamento;
import br.edu.utfpr.caixa_medicamentos.models.dto.MedicamentoDTO;
import br.edu.utfpr.caixa_medicamentos.models.mapper.MedicamentoMapper;
import br.edu.utfpr.caixa_medicamentos.service.MedicametoService;
import br.edu.utfpr.caixa_medicamentos.util.Constants;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@WebServlet(name = "Informações", value = "/infos")
public class Infos extends HttpServlet {
    private static final long serialVersionUID = 1L;
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //ESCOPO DE APLICAÇÃO
        Integer counterApplication = (Integer) getServletContext().getAttribute(Constants.COUNTER_APPLICATION);
        if(counterApplication == null){
            counterApplication = 0;
        }
        getServletContext().setAttribute(Constants.COUNTER_APPLICATION, counterApplication);

        //ESCOPO DE SESSÃO
        Integer counterSession = (Integer) request.getSession(true).getAttribute(Constants.COUNTER_SESSION);
        if(counterSession == null){
            counterSession = 0;
        }
        request.getSession(true).setAttribute(Constants.COUNTER_SESSION, counterSession);

        RequestDispatcher req =  request.getRequestDispatcher("/WEB-INF/view/infos.jsp");
        req.forward(request, response);
    }

}

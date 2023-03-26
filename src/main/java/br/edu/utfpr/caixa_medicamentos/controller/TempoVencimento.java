package br.edu.utfpr.caixa_medicamentos.controller;

import br.edu.utfpr.caixa_medicamentos.models.domain.Medicamento;
import br.edu.utfpr.caixa_medicamentos.models.dao.MedicamentoDAO;
import br.edu.utfpr.caixa_medicamentos.models.dto.MedicamentoDTO;
import br.edu.utfpr.caixa_medicamentos.util.Constants;

import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

@WebServlet(name = "TempoVencimento", value = "/tempo")
public class TempoVencimento extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        calculaTempo(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        calculaTempo(request, response);
    }

    private void calculaTempo(HttpServletRequest request, HttpServletResponse response) throws IOException {
        Medicamento med = (Medicamento) request.getAttribute("flash.med");

        Date agora = new Date();
        long tempo = Math.abs(agora.getTime() - med.getVencimento().getTime());
        long dias = TimeUnit.DAYS.convert(tempo, TimeUnit.MILLISECONDS);


        //ESCOPO DE APLICAÇÃO
        Integer counterApplication = (Integer) getServletContext().getAttribute(Constants.COUNTER_APPLICATION);
        if(counterApplication == null){
            counterApplication = 0;
        }
        counterApplication++;
        getServletContext().setAttribute(Constants.COUNTER_APPLICATION, counterApplication);

        //ESCOPO DE SESSÃO
        Integer counterSession = (Integer) request.getSession(true).getAttribute(Constants.COUNTER_SESSION);
        if(counterSession == null){
            counterSession = 0;
        }
        counterSession++;
        request.getSession(true).setAttribute(Constants.COUNTER_SESSION, counterSession);

        MedicamentoDAO medDao = new MedicamentoDAO();
        long quantidade = medDao.count();
        System.out.println(quantidade);

        Cookie cookie1 = new Cookie("quantMed", String.valueOf(quantidade));
        cookie1.setMaxAge(60 * 60 * 24);
        Cookie cookie2 = new Cookie("tempo", String.valueOf(dias));
        cookie2.setMaxAge(-1);

        response.addCookie(cookie1);
        response.addCookie(cookie2);
        response.sendRedirect("lista-med");
    }
}

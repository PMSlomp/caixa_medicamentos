package br.edu.utfpr.caixa_medicamentos.controller;

import br.edu.utfpr.caixa_medicamentos.models.domain.Medicamento;

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
        Medicamento med = (Medicamento) request.getAttribute("medicamento");

        Date agora = new Date();
        long tempo = Math.abs(agora.getTime() - med.getVencimento().getTime());
        long dias = TimeUnit.DAYS.convert(tempo, TimeUnit.MILLISECONDS);
        med.setTempo(dias);

        int quantidade = med.getListaMed().size();
        Cookie cookie = new Cookie("quantMed", String.valueOf(quantidade));
        cookie.setMaxAge(60 * 60 * 24);

        response.addCookie(cookie);
        response.sendRedirect("lista-med");
    }
}

package br.edu.utfpr.caixa_medicamentos.controller;

import br.edu.utfpr.caixa_medicamentos.models.domain.Medicamento;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/lista-med")
public class ListaMedicamentos extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Medicamento medicamento = new Medicamento();

        RequestDispatcher req =  request.getRequestDispatcher("/WEB-INF/view/listaMed.jsp");
        request.setAttribute("listagem", medicamento.getListaMed());
        req.forward(request, response);
    }

}

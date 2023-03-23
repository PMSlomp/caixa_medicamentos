package br.edu.utfpr.caixa_medicamentos.controller;

import br.edu.utfpr.caixa_medicamentos.models.domain.Medicamento;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

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

        Medicamento med = new Medicamento(nomeMed, tipoMed, datMed);

        request.setAttribute("medicamento", med);
        request.getRequestDispatcher("/tempo").forward(request,response);
    }

}

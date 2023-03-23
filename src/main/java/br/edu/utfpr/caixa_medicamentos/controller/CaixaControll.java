package br.edu.utfpr.caixa_medicamentos.controller;

import br.edu.utfpr.caixa_medicamentos.models.domain.Caixa;
import com.google.gson.Gson;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "Caixa", value = "/caixas")
public class CaixaControll extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        List<Caixa> caixas = Caixa.getCaixas();
        List<String> caixas = new ArrayList<>();
        caixas.add("Caixa 1");
        caixas.add("Caixa 2");

        String json = new Gson().toJson(caixas);
        json = new String(json.getBytes(), "UTF-8");

        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");
        response.getWriter().write(json);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}

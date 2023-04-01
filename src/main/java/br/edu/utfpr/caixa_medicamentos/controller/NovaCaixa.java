package br.edu.utfpr.caixa_medicamentos.controller;

import br.edu.utfpr.caixa_medicamentos.models.domain.Caixa;
import br.edu.utfpr.caixa_medicamentos.models.domain.Medicamento;
import br.edu.utfpr.caixa_medicamentos.models.dto.CaixaDTO;
import br.edu.utfpr.caixa_medicamentos.models.mapper.CaixaMapper;
import br.edu.utfpr.caixa_medicamentos.models.mapper.MedicamentoMapper;
import br.edu.utfpr.caixa_medicamentos.service.CaixaService;

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

@WebServlet(name = "NovaCaixa", value = "/nova-caixa")
public class NovaCaixa extends HttpServlet {
    private static final long serialVersionUID = 1L;
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        RequestDispatcher req =  request.getRequestDispatcher("/WEB-INF/view/novaCaixa.jsp");
        req.forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        CaixaService caixaService = new CaixaService();

        String nomeCaixa = request.getParameter("nome");

        Caixa caixa = new Caixa(nomeCaixa);
        //ESCOPO DE REQUISIÇÃO
        request.setAttribute("flash.med", caixa);

        caixaService.save(caixa);
        CaixaDTO caixaDTO = CaixaMapper.toDTO(caixa);

        request.setAttribute("caixas", caixaDTO);

        List<Caixa> caixaApp = (List<Caixa>) getServletContext().getAttribute("caixas");
        if(caixaApp == null){
            caixaApp = new ArrayList<Caixa>();
            getServletContext().setAttribute("caixas", caixaApp);
        }
        caixaApp.add(caixa);
        getServletContext().setAttribute("caixass", caixaApp);

        response.sendRedirect("nova-caixa");
//        request.getRequestDispatcher("/tempo").forward(request,response);
    }

}

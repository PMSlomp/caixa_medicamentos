package br.edu.utfpr.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/listagem")
public class Listagem extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nomeMed = request.getParameter("nome");
		String tipoMed = request.getParameter("tipo");
		
		Medicamento medicamento = new Medicamento(nomeMed, tipoMed);
		
		PrintWriter out = response.getWriter();
		out.println("<h1> ID: " + medicamento.getId()+ " Nome: " + nomeMed + "</h1>");
		
	}

}

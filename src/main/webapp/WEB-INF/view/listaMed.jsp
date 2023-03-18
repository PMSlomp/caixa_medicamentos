<%@ page language="java" contentType="text/html" %>
<%@ page import="java.util.List, br.edu.utfpr.models.Medicamento" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<c:url value="/novo-med" var="adicionar"/>

<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8" lang="pt-br">

  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>Caixa Medicamentos</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
</head>

<body>

<div class="container text-center">
  <ul class="nav">
    <li class="nav-item">
      <a class="nav-link active" aria-current="page" href="#">Criar Caixa</a>
    </li>
    <li class="nav-item">
      <a class="nav-link" href="${ adicionar }">Adicionar Medicamento</a>
    </li>
  </ul>

  <div class="row align-items-start">
    <div class="card">
      <div class="card-body">
        <img src="logo.png" alt="LOGO"/>
        <c:if test="${ not empty listagem}">
          <h2>Caixa 1</h2>
          <table class="table table-striped">
            <tr>
              <th>id</th>
              <th>nome</th>
              <th>tipo</th>
              <th>vencimento</th>
              <th>Dias para vencer</th>
            </tr>
            <c:forEach items="${ listagem }" var="medicamento">
              <tr>
                <td>${ medicamento.getId() }</td>
                <td>${ medicamento.getNome() }</td>
                <td>${ medicamento.getTipo() }</td>
                <td><fmt:formatDate value="${ medicamento.getVencimento() }" pattern="dd/MM/yyyy"/></td>
                <td>${ medicamento.getTempo() }</td>
              </tr>
            </c:forEach>
          </table>
        </c:if>

        <c:if test="${ empty listagem}">
          Caixa vazia
        </c:if>

      </div>
    </div>
  </div>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>
</body>
</html>
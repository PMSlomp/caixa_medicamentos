<%@ page language="java" contentType="text/html" %>
<%@ page import="java.util.List, br.edu.utfpr.caixa_medicamentos.models.domain.Medicamento" %>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<c:url value="/novo-med" var="adicionar"/>

<t:template titulo="Listagem">
  <jsp:body>

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

  </jsp:body>
</t:template>

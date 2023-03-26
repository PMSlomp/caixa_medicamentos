<%@ page language="java" contentType="text/html" %>
<%@ page import="java.util.List, br.edu.utfpr.caixa_medicamentos.models.domain.Medicamento" %>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<c:url value="/novo-med" var="adicionar"/>

<t:template titulo="Listagem">
  <jsp:body>

    <p>Acessos Globais: ${counterApplication}</p>
    <p>Acessos Sessão: ${counterSession}</p>

  </jsp:body>
</t:template>

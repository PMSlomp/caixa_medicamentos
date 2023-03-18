<%@ page language="java" contentType="text/html" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/novo-med" var="adicionar"/>

<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8" lang="pt-br">
  <title>Caixa Medicamentos</title>
</head>

<body>

<form action="${ adicionar }" method="post">

  Nome: <input type="text" name="nome">
  Tipo: <input type="text" name="tipo">
  Data de Vencimento: <input type="text" name="vencimento">
  <input type="submit">

</form>

</body>

</html>
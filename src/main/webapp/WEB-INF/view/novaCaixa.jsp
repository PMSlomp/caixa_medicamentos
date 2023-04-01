<%@ page language="java" contentType="text/html" %>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/nova-caixa" var="adicionar"/>


<t:template titulo="Nova Caixa">
  <jsp:body>

    <form class="row g-3"action="${ adicionar }" method="post">
      <div class="col-md-4">
      </div>
      <div class="col-md-4">
        <label for="inputNome" class="form-label">Nome da Caixa</label>
        <input type="text" class="form-control" id="inputNome" name="nome">
      </div>
      <div class="col-md-4">
      </div>
      <br>
      <div class="col-12">
        <button type="submit" class="btn btn-primary">Cadastrar</button>
      </div>
    </form>

  </jsp:body>
</t:template>

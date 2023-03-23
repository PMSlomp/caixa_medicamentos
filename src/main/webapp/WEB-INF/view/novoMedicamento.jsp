<%@ page language="java" contentType="text/html" %>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/novo-med" var="adicionar"/>


<t:template titulo="Novo Medicamento">
  <jsp:body>

    <form class="row g-3"action="${ adicionar }" method="post">
      <div class="col-md-4">
        <label for="inputNome" class="form-label">Nome do medicamento</label>
        <input type="text" class="form-control" id="inputNome" name="nome">
      </div>

      <div class="col-md-3">
        <label for="inputTipo" class="form-label">Tipo do medicamento</label>
        <input type="text" class="form-control" id="inputTipo" name="tipo">
      </div>

      <div class="col-md-2">
        <label for="inputVenc" class="form-label">Vencimento</label>
        <input type="text" class="form-control" id="inputVenc" placeholder="01/01/1900" name="vencimento">
      </div>

      <div class="col-md-3">
        <label for="select-caixa" class="form-label">Caixa</label>
        <select id="select-caixa" class="form-select">
          <option value="" disabled selected>Escolha a caixa para armazenar</option>
        </select>
      </div>


      <div class="col-12">
        <button type="submit" class="btn btn-primary">Cadastrar</button>
      </div>
    </form>

    <script src="assets/libraries/jquery-2.2.4.min.js"></script
    <script src="assets/libraries/jquery.mask.min.js"></script>
    <script>
      window.onload = function () {
        $('#inputVenc').mask('00/00/0000');

        $.get('caixas', function(data) {
          let $select = $('#select-caixa');
          $.each(data, function(index, item) {
            $('<option>').val(index).text(item).appendTo($select);
          });
        });

        $('#select-caixa').change(function () {
          localStorage['caixa'] = $(this).find(':selected').text();
        })

      }
    </script>

  </jsp:body>
</t:template>

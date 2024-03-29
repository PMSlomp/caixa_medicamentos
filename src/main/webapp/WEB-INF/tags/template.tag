<%@attribute name="titulo"%>

<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html" charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <title>${ titulo }</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous"/>
</head>

<body class="d-flex flex-column min-vh-100">
<main>
<div class="container text-center">
    <ul class="nav">
        <li class="nav-item">
            <a class="nav-link" href="nova-caixa">Criar Caixa</a>
        </li>
        <li class="nav-item">
            <a class="nav-link" href="novo-med">Adicionar Medicamento</a>
        </li>
        <li class="nav-item">
            <a class="nav-link" href="infos">INFOS</a>
        </li>
    </ul>

    <div class="row align-items-start">
        <div class="card">
            <div class="card-body">
                <img src="assets/resources/img/logo.png" alt="LOGO" style="width: 300px"/>

                <jsp:doBody></jsp:doBody>

            </div>
        </div>
    </div>
</div>
</main>

<footer class="mt-auto">
    <div class="container text-center">
        Desenvolvido por PMS. Todos os direitos reservados - &#169;Copyright

    </div>
</footer>

<%--<script src="assets/libraries/jquery-2.2.4.min.js" type="text/javascript"></script>--%>
<script src="https://code.jquery.com/jquery-2.2.4.js"></script>
<%--<script src="assets/libraries/jquery.mask.min.js" type="text/javascript"></script>--%>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>
</body>
</html>
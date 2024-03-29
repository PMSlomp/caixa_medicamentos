# Caixa de Medicamentos

**Figma**: https://www.figma.com/file/zQACArH9LJkaUM1EqVN1jG/CaixaMedicamentos?node-id=0%3A1&t=5vtW5UWflNVRT1kY-1 

## Checklist

**Encaminhamento e redirecionamento**
- [x] Usar encaminhamento fora do modelo MVC (i.e. um servlet encaminhando a requisição para outro servlet). A dica é dividir um processamento complexo em duas etapas, ou seja, em dois servlets.
- [x] Usar redirecionamento depois de requisições POST de um formulário para evitar o reenvio destes dados ao atualizar a página com F5.
- [x] Para uma mesma rota de um Servlet, usar doGet para encaminhar a uma página e doPost para recuperar os dados da página/formulário

**Cookies**
- [x] Cookie que dura apenas uma sessão do navegador
- [x] Cookie com tempo de vida customizado além de uma sessão do navegador

**Controle de erros e exceção via web.xml**
- [x] Tratamento por código de status ou exceção específica
- [x] Tratamento de erros genérico

**JSTL e TagLib**
- [x] forEach
- [x] if
- [x] Template com cabeçalho e rodapé

**JavaScript**
- [x] Requisição AJAX
- [x] Armazenamento no LocalStorage
- [x] Uso de plugin JQuery

**JPA**
- [x] No mínimo 2 entidades
- [x] Operações de CRUD (apenas CREATE/INSERT e READ/SELECT).

**Outros**
- [x] Escopo de requisição, sessão e aplicação
- [x] Expression Language (EL) para acessar os objetos de domínio (beans) da camada de modelo do MVC
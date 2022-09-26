<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="pt br">

<head>
  <meta charset='utf-8'>
  <meta http-equiv='X-UA-Compatible' content='IE=edge'>
  <title>JT Viagens</title>
  <meta name='viewport' content='width=device-width, initial-scale=1'>
  <link rel="stylesheet" href="css/estilo.css">
  <script src='main.js'></script>

  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
    integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>

<body>
  <div class="container">
    <!-- conteiner principal-->

    <header>
      <!-- inicio da navbar-->

      <nav class="navbar navbar-expand-lg navbar-light backcolor">
        <div class="container-fluid">
          <a class="navbar-brand" href="#">JT Viagens</a> <!-- logo -->
          <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavAltMarkup"
            aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
          </button>
          <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
            <div class="navbar-nav">
              <a class="nav-link active" aria-current="page" href="index.jsp">Home</a>
                            <a class="nav-link" href="destino.jsp">Destinos</a>
                            <a class="nav-link" href="promocao.jsp">Promoções</a>
              <!--<a class="nav-link disabled" href="#" tabindex="-1" aria-disabled="true">Disabled</a> -->
              <!-- item desabilitado, usar numa próxima expansao -->
            </div>
          </div>
        </div>
      </nav>

    </header> <!-- fim da navbar-->


    <section>
      <!-- inicio do jumbotron-->

      <div class="mt-4 p-5 backcolor2 text-white rounded">
        <h1>Rio de Janeiro 20% OFF!:</h1>
        <h2>Para turmas com mais de 40 participantes!</h2>
      </div>


    </section> <!-- fim do jumbotron-->

<br/>

<!-- inicio do conteiner promocao-->

<section class="container">
<div class="row"> <!-- linha 1 dos cards de opçoes-->
<div class="col"> <!-- coluna 1-->
  <div class="card" style="width: 18rem ;">
      <img src="img/card_cristored2.jpg" class="card-img-top" alt="...">
      <div class="card-body">
          <h5 class="card-title">Cristo Redentor</h5>
          <h6 class="card-title" style="color: red;">R$ 52,00 por pessoa</h6>
          <p class="card-text">No topo do morro do Corcovado, com vista para a cidade do Rio.</p>
          <a href="agendamento.jsp" class="btn btn-primary backcolor3">Quero agendar!</a>
      </div>
  </div>
</div>
</div>
</section>

<!-- fim do conteiner promocao-->


    <!-- inicio do rodapé-->

        <div class="container my-5">

            <footer class="backcolor2 text-center text-white">
            
          
            <!-- Copyright -->
            <div class="text-center p-3" style="background-color: rgba(0, 0, 0, 0.2);">
              © 2022 Copyright:
              <a class="text-white" href="https://jtviagens.com">JTViagens.com</a>
            </div>
            <!-- Copyright -->
          </footer>
            
          </div>
          <!-- fim do rodapé-->

  </div> <!-- conteiner principal-->


  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
    integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
    crossorigin="anonymous"></script>
</body>

</html>
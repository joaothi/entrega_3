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
        <h1>JT Viangens:</h1>
        <h2>Faça sua viagem / excursão escolar de forma descomplicada!</h2>
        <p>Pacotes para destinos incríveis no Rio de Janeiro (em breve em todo o Brasil).</p>
      </div>


    </section> <!-- fim do jumbotron-->


    <!-- inicio do formulário-->

    <form class="container" method="post">

      <!-- escolha de destino-->
      <br>
      <select class="form-select" aria-label="Default select example">
        <option selected>Escolha o seu pacote</option>
        <option value="1">Bom Jardim</option>
        <option value="2">Cristo Redentor</option>
        <option value="3">Ilha da Madeira</option>
        <option value="3">Saquarema</option>
      </select>
      <!-- fim da escolha de destino-->


      <div class="form-row">
        <div class="form-group col-md-6">
          <label for="inputEmail4">Nome</label>
          <input type="email" class="form-control" id="inputEmail4" placeholder="Nome">
        </div>
        
        <div class="form-group">
        <label for="inputAddress">CPF</label>
        <input type="text" class="form-control" id="inputAddress" placeholder="CPF">
      </div>
        

      </div>
      <div class="form-group">
        <label for="inputAddress">Endereço</label>
        <input type="text" class="form-control" id="inputAddress" placeholder="Endereco">
      </div>
      
      <div class="form-row">
        <div class="form-group col-md-6">
          <label for="inputCity">Idade</label>
          <input type="text" class="form-control" id="Idade">
        </div>
        
      </div>
      
      <br/>
      
      <button type="submit" class="btn btn-primary">Enviar</button>
    </form>

    <br>

    <!-- fim do formulário-->


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
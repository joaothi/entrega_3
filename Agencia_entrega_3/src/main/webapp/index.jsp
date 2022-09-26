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
                    <a class="navbar-brand" href="#">JT Viagens</a>
                    <button class="navbar-toggler" type="button" data-bs-toggle="collapse"
                        data-bs-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup" aria-expanded="false"
                        aria-label="Toggle navigation">
                        <span class="navbar-toggler-icon"></span>
                    </button>
                    <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
                        <div class="navbar-nav">
                            <a class="nav-link active" aria-current="page" href="index.jsp">Home</a>
                            <a class="nav-link" href="destino.jsp">Destinos</a>
                            <a class="nav-link" href="promocao.jsp">Promo��es</a>
                            
                            <!--<a class="nav-link disabled" href="#" tabindex="-1" aria-disabled="true">Disabled</a> -->
                        </div>
                    </div>
                </div>
            </nav>

        </header> <!-- fim da navbar-->


        <section>
            <!-- inicio do jumbotron-->

            <div class="mt-4 p-5 backcolor2 text-white rounded">
                <h1>JT Viangens:</h1>
                <h2>Fa�a sua viagem / excurs�o escolar de forma descomplicada!</h2>
                <p>Pacotes para destinos incr�veis no Rio de Janeiro (em breve em todo o Brasil).</p>
            </div>


        </section> <!-- fim do jumbotron-->


<!-- come�o do carrossel-->

        <div id="carouselExampleCaptions" class="carousel slide" data-bs-ride="carousel">
            <div class="carousel-indicators">
              <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="0" class="active" aria-current="true" aria-label="Slide 1"></button>
              <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="1" aria-label="Slide 2"></button>
              <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="2" aria-label="Slide 3"></button>
            </div>
            <div class="carousel-inner">
              <div class="carousel-item active">
                <img src="img/carrossel1.jpg" class="d-block w-100" alt="...">
                <div class="carousel-caption d-none d-md-block">
                  <h5>Turmas de qualquer tamanho.</h5>
                  <p>N�o h� n�mero m�nimo de participantes.</p>
                </div>
              </div>
              <div class="carousel-item">
                <img src="img/carossel2.png" class="d-block w-100" alt="...">
                <div class="carousel-caption d-none d-md-block">
                  <h5>Guia e motorista incluso.</h5>
                  <p>N�o h� preocupa��es quanto a equipe de apoio, resolvemos isso pra voc�!</p>
                </div>
              </div>
              <div class="carousel-item">
                <img src="img/carrossel3.jpg" class="d-block w-100" alt="...">
                <div class="carousel-caption d-none d-md-block">
                  <h5>Pagamento facilitado.</h5>
                  <p>Parcele em at� 12x no cart�o ou no boleto.</p>
                </div>
              </div>
              
            </div>
            <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide="prev">
              <span class="carousel-control-prev-icon" aria-hidden="true"></span>
              <span class="visually-hidden">Previous</span>
            </button>
            <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide="next">
              <span class="carousel-control-next-icon" aria-hidden="true"></span>
              <span class="visually-hidden">Next</span>
            </button>
          </div>


<!-- fim do carrossel-->

        <section class="container">
            <br>
            <!-- inicio cards de op�oes-->

            <div class="row"> <!-- linha 1 dos cards de op�oes-->
                
                <div class="col"> <!-- coluna 1-->
                    <div class="card" style="width: 18rem;">
                        <img src="img/card_saquarema1.jpg" class="card-img-top" alt="...">
                        <div class="card-body">
                            <h5 class="card-title">Saquarema</h5>
                            <h6 class="card-title">R$ 75,00 por pessoa</h6>
                            <p class="card-text">Destaca-se pelas suas belas praias, lagoas, cachoeiras e montanhas.</p>
                            <a href="agendamento.jsp" class="btn btn-primary backcolor3">Quero agendar!</a>
                        </div>
                    </div>
                </div>

                <div class="col"> <!-- coluna 2-->
                    <div class="card" style="width: 18rem;">
                        <img src="img/card_cristored2.jpg" class="card-img-top" alt="...">
                        <div class="card-body">
                            <h5 class="card-title">Cristo Redentor</h5>
                            <h6 class="card-title">R$ 65,00 por pessoa</h6>
                            <p class="card-text">No topo do morro do Corcovado, com vista para a cidade do Rio.</p>
                            <a href="agendamento.jsp" class="btn btn-primary backcolor3">Quero agendar!</a>
                        </div>
                    </div>
                </div>

                <div class="col"> <!-- coluna 3-->
                    <div class="card" style="width: 18rem;">
                        <img src="img/card_bomjard3.jpg" class="card-img-top" alt="...">
                        <div class="card-body">
                            <h5 class="card-title">Bom Jardim</h5>
                            <h6 class="card-title">R$ 80,00 por pessoa</h6>
                            <p class="card-text">Regi�o serrana, � cercada de muitas �reas verdes e altas montanhas.</p>
                            <a href="agendamento.jsp" class="btn btn-primary backcolor3">Quero agendar!</a>
                        </div>
                    </div>
                </div>

                <div class="col"> <!-- coluna 4-->
                    <div class="card" style="width: 18rem;">
                        <img src="img/card_ilhamade4.jpg" class="card-img-top" alt="...">
                        <div class="card-body">
                            <h5 class="card-title">Ilha da Madeira</h5>
                            <h6 class="card-title">R$ 60,00 por pessoa</h6>
                            <p class="card-text">Destaca-se pelas suas belas praias, lagoas, cachoeiras e montanhas.</p>
                            <a href="agendamento.jsp" class="btn btn-primary backcolor3">Quero agendar!</a>
                        </div>
                    </div>
                </div>

                
            </div> <!-- fim da linha 1 dos cards de op�oes-->


        </section> <!-- fim dos cards de op�oes-->


<!-- inicio do rodap�-->

        <div class="container my-5">

            <footer class="backcolor2 text-center text-white">
            
          
            <!-- Copyright -->
            <div class="text-center p-3" style="background-color: rgba(0, 0, 0, 0.2);">
              � 2022 Copyright:
              <a class="text-white" href="https://jtviagens.com">JTViagens.com</a>
            </div>
            <!-- Copyright -->
          </footer>
            
          </div>
          <!-- fim do rodap�-->


    </div> <!-- conteiner principal-->


    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
        crossorigin="anonymous"></script>
</body>

</html>
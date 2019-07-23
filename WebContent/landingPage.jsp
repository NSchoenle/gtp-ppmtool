<!doctype html>
<html lang="en">

<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB"
        crossorigin="anonymous">



    <link rel="stylesheet" href="App.css">

    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.2.0/css/all.css" integrity="sha384-hWVjflwFxL6sNzntih27bfxkr27PmbbK/iSvJ+a4+0owXq79v+lsFkW54bOGbiDQ"
        crossorigin="anonymous">

    <title>Kanban Tool</title>
</head>
<!-- Spring Boot / React Students please ignore above -->

<body>


  <jsp:include page="navbar.jsp"/>

    <!-- Start of landing component -->

    <div class="landing">
        <div class="light-overlay landing-inner text-dark">
            <div class="container">
                <div class="row">
                    <div class="col-md-12 text-center">
                        <h1 class="display-3 mb-4">Personal Kanban Tool</h1>
                        <p class="lead">
                            Create your account to join active projects or start you own
                        </p>
                        <hr />
                        <a href="register.html" class="btn btn-lg btn-primary mr-2">
                            Sign Up
                        </a>
                        <a href="login.html" class="btn btn-lg btn-secondary mr-2">
                            Login
                        </a>
                    </div>
                </div>
            </div>
        </div>
    </div>


    <!-- End of Landing Component -->
   <jsp:include page="commonjsplib.jsp">
</body>

</html>
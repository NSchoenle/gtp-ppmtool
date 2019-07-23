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

    <!-- Start of Registration Form -->
    <div class="register">
        <div class="container">
            <div class="row">
                <div class="col-md-8 m-auto">
                    <h1 class="display-4 text-center">Sign Up</h1>
                    <p class="lead text-center">Create your Account</p>
                    <form action="create-profile.html">
                        <div class="form-group">
                            <input type="text" class="form-control form-control-lg" placeholder="Name" name="name"
                                required />
                        </div>
                        <div class="form-group">
                            <input type="email" class="form-control form-control-lg" placeholder="Email Address" name="email" />

                        </div>
                        <div class="form-group">
                            <input type="password" class="form-control form-control-lg" placeholder="Password" name="password" />
                        </div>
                        <div class="form-group">
                            <input type="password" class="form-control form-control-lg" placeholder="Confirm Password"
                                name="password2" />
                        </div>
                        <input type="submit" class="btn btn-info btn-block mt-4" />
                    </form>
                </div>
            </div>
        </div>
    </div>



    <!-- End of Registration Form -->

   <jsp:include page="commonjsplib.jsp"/>
</body>

</html>
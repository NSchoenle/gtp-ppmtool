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

    <!-- <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.2.0/css/all.css" integrity="sha384-hWVjflwFxL6sNzntih27bfxkr27PmbbK/iSvJ+a4+0owXq79v+lsFkW54bOGbiDQ"
        crossorigin="anonymous"> -->

    <title>PPM Tool</title>
</head>
<!-- Spring Boot / React Students please ignore above -->

<body>


    <jsp:include page="navbar.jsp"/>
    <!-- Start of Project FORM -->

    <div class="project">
        <div class="container">
            <div class="row">
                <div class="col-md-8 m-auto">
                    <h5 class="display-4 text-center">Create / Edit Project form</h5>
                    <hr />
                    <form action="./AddProjectController" method="post">
                        <div class="form-group">
                            <input type="text" name="project_name" class="form-control form-control-lg " placeholder="Project Name" />
                        </div>
                        <div class="form-group">
                            <input type="text" name="project_Identifier" class="form-control form-control-lg" placeholder="Unique Project ID"
                                 />
                        </div>
                        <!-- disabled for Edit Only!! remove "disabled" for the Create operation -->
                        <div class="form-group">
                            <textarea  name ="description" class="form-control form-control-lg" placeholder="Project Description"></textarea>
                        </div>
                        <h6>Start Date</h6>
                        <div class="form-group">
                            <input type="date" class="form-control form-control-lg" name="start_date" />
                        </div>
                        <h6>Estimated End Date</h6>
                        <div class="form-group">
                            <input type="date" class="form-control form-control-lg" name="end_date" />
                        </div>

                        <input type="submit" class="btn btn-primary btn-block mt-4" />
                    </form>
                </div>
            </div>
        </div>
    </div>

    <!-- END OF PROJECT FORM -->

    <!-- Spring Boot / React Students please ignore below -->


    <jsp:include page="commonjsplib.jsp"/>
</body>

</html>
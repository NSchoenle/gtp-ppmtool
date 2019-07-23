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
   
    <!-- Project Board Starts Here MIND OTHER COMPONENTS WHEN COPY AND PASTING -->
    <div class="container">
        <a href=# class="btn btn-primary mb-3">
            <i class="fas fa-plus-circle"> Create Project Task</i>
        </a>
        <br />
        <hr />
        <!-- Backlog STARTS HERE -->
        <div class="container">
            <div class="row">
                <div class="col-md-4">
                    <div class="card text-center mb-2">
                        <div class="card-header bg-secondary text-white">
                            <h3>TO DO</h3>
                        </div>
                    </div>

                    <!-- SAMPLE PROJECT TASK STARTS HERE -->
                    <div class="card mb-1 bg-light">

                        <div class="card-header text-primary">
                            ID: projectSequence -- Priority: priorityString
                        </div>
                        <div class="card-body bg-light">
                            <h5 class="card-title">project_task.summary</h5>
                            <p class="card-text text-truncate ">
                                project_task.acceptanceCriteria
                            </p>
                            <a href=# class="btn btn-primary">
                                View / Update
                            </a>

                            <button class="btn btn-danger ml-4">
                                Delete
                            </button>
                        </div>
                    </div>

                    <!-- SAMPLE PROJECT TASK ENDS HERE -->
                </div>
                <div class="col-md-4">
                    <div class="card text-center mb-2">
                        <div class="card-header bg-primary text-white">
                            <h3>In Progress</h3>
                        </div>
                    </div>
                    <!-- SAMPLE PROJECT TASK STARTS HERE -->

                    <!-- SAMPLE PROJECT TASK ENDS HERE -->
                </div>
                <div class="col-md-4">
                    <div class="card text-center mb-2">
                        <div class="card-header bg-success text-white">
                            <h3>Done</h3>
                        </div>
                    </div>
                    <!-- SAMPLE PROJECT TASK STARTS HERE -->

                    <!-- SAMPLE PROJECT TASK ENDS HERE -->
                </div>
            </div>
        </div>

        <!-- Backlog ENDS HERE -->
    </div>

    <!-- PROJECT BOARD ENDS HERE -->
    <!-- Spring Boot / React Students please ignore below -->


    <jsp:include page="commonjsplib.jsp"/>
</body>

</html>
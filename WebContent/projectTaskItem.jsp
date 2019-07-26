<!-- SAMPLE PROJECT TASK STARTS HERE -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
                    <div class="card mb-1 bg-light">

                        <div class="card-header text-primary">
                            Task ID: ${project_task.id}  -- Task Priority: ${project_task.priority }
                        </div>
                        <div class="card-body bg-light">
                            <h5 class="card-title">${project_task.summary}</h5>
                            <p class="card-text text-truncate ">
                                ${project_task.acceptanceCriteria}
                            </p>
                            <a href=# class="btn btn-primary">
                                View / Update
                            </a>

                           <!--  <button class="btn btn-danger ml-4">
                                Delete
                            </button> --> 
                            
                            <c:if test="${user.role != 3}">
                            <a href="./DeleteProjectTaskController?id=${project_task.id}" class="btn btn-danger ml-4">
                                       Delete
                            </a>
                            </c:if>
                            
                        </div>
                    </div>

<!-- SAMPLE PROJECT TASK ENDS HERE -->
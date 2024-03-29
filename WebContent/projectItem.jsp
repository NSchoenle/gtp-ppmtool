<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
    
   <c:forEach items="${requestScope.projects}" var= "project">
   	
  
    
<!-- Project Item Component -->
                    <div class="container">
                        <div class="card card-body bg-light mb-3">
                            <div class="row">
                                <div class="col-2">
                                    <span class="mx-auto"> ${project.project_Identifier}</span>
                                </div>
                                <div class="col-lg-6 col-md-4 col-8">
                                    <h3>${project.project_name }</h3>
                                    <p>${project.description }</p>
                                </div>
                                <div class="col-md-4 d-none d-lg-block">
                                    <ul class="list-group">
                                        <a href="#">
                                            <li class="list-group-item board">
                                                <i class="fa fa-flag-checkered pr-1">Project Board </i>
                                            </li>
                                        </a>
                                        
                                        <c:if test="${user.role != 3}">
                                        <a href="./UpdateProjectController?id=${project.id }">
                                            <li class="list-group-item update">
                                                <i class="fa fa-edit pr-1">Update Project Info</i>
                                            </li>
                                        </a>
                                        </c:if>
                                        
                                        <c:if test="${user.role == 1}">
                                        <a href="./DeleteProjectController?id=${project.id}">
                                            <li class="list-group-item delete">
                                                <i class="fa fa-minus-circle pr-1">Delete Project</i>
                                            </li>
                                        </a>
                                        </c:if>
                                        
                                    </ul>
                                </div>
                            </div>
                        </div>
                    </div>
                    <!-- End of Project Item Component -->
 </c:forEach>
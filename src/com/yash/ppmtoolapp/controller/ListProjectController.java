package com.yash.ppmtoolapp.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yash.ppmtoolapp.domain.Project;
import com.yash.ppmtoolapp.service.ProjectService;
import com.yash.ppmtoolapp.serviceimpl.ProjectServiceImpl;

/**
 * Servlet implementation class ListProjectController
 */
@WebServlet("/ListProjectController")
public class ListProjectController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private ProjectService projectService = null;

    public ListProjectController() {
        super();
     	projectService = new ProjectServiceImpl();
     	}

    
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Project> projects = projectService.getAllProjects();
		
//		for (Project p : projects) {
//			System.out.println(p);
//		}
		
		//Share the list with the resquest
		request.setAttribute("projects", projects);
		
		//Send the request on with the request dispatcher for the WHOLE app (aka the reason we use servlet context)
		getServletContext().getRequestDispatcher("/dashboard.jsp").forward(request, response);
		//response.sendRedirect("./ListProjectController");
	}


}

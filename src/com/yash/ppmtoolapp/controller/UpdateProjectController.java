package com.yash.ppmtoolapp.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yash.ppmtoolapp.domain.Project;
import com.yash.ppmtoolapp.service.ProjectService;
import com.yash.ppmtoolapp.serviceimpl.ProjectServiceImpl;

/**
 * Servlet implementation class UpdateProjectController
 */
@WebServlet("/UpdateProjectController")
public class UpdateProjectController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private ProjectService projectService = null;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateProjectController() {
        super();
        projectService= new ProjectServiceImpl();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1: Get the id of the clicked project
		Long id = Long.parseLong(request.getParameter("id"));
		
		//2: Fetch the project of the given id
		Project project = projectService.getProject(id);
		
		//3: Prepare the model-Happens in DAO
		
		
		//4: Share the model on edit page
		request.setAttribute("project", project);
		
		
		//5: Send the info on
		getServletContext().getRequestDispatcher("/editProject.jsp").forward(request, response);
		//response.sendRedirect("./editProject.jsp");
	}


}

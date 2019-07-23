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
 * Servlet implementation class DeleteProjectController
 */
@WebServlet("/DeleteProjectController")
public class DeleteProjectController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private ProjectService projectService = null;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteProjectController() {
        super();
        projectService = new ProjectServiceImpl();
			
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Long id = Long.parseLong(request.getParameter("id"));
		projectService.removeProject(id);
		//getServletContext().getRequestDispatcher("/dashboard.jsp").forward(request, response);
		
		//URL Rewriting (aka the adding of the msg to the string)
		response.sendRedirect("./ListProjectController?msg=Record Deleted Successfully!");
	}


}

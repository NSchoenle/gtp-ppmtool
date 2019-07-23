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
 * Servlet implementation class AddProjectController
 */
@WebServlet("/AddProjectController")
public class AddProjectController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private ProjectService projectService = null;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AddProjectController() {
		super();
		projectService = new ProjectServiceImpl();
	}

	
//	protected void doGet(HttpServletRequest request, HttpServletResponse response)
//			throws ServletException, IOException {
//		// TODO: Take data from form
//
//		Project project = new Project();
//		project.setProject_name("thing");
//		project.setDescription("this is another test");
//		project.setProject_Identifier("MO1");
//		projectService.createProject(project);
//		
//		getServletContext().getRequestDispatcher("/dashboard.jsp").forward(request, response);
//	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Take input from form
		Project project = new Project();
		project.setProject_name(request.getParameter("project_name"));
		project.setProject_Identifier(request.getParameter("project_Identifier"));
		project.setDescription(request.getParameter("description"));
		
//		project.setStart_date(request.getParameter("start_date"));
//		project.setEnd_date(request.getParameter("end_date"));
		
		projectService.createProject(project);
		
		//getServletContext().getRequestDispatcher("/dashboard.jsp").forward(request, response);
		response.sendRedirect("./ListProjectController?msg=Project Created Successfully");
	}
}

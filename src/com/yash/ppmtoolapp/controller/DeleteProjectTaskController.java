package com.yash.ppmtoolapp.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yash.ppmtoolapp.service.ProjectService;
import com.yash.ppmtoolapp.serviceimpl.ProjectServiceImpl;

/**
 * Servlet implementation class DeleteProjectTaskController
 */
@WebServlet("/DeleteProjectTaskController")
public class DeleteProjectTaskController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 private ProjectTaskService projectTaslService = null;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteProjectTaskController() {
        super();
        projectTaskService = new ProjectTaskServiceImpl();
		
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Long id = Long.parseLong(request.getParameter("id"));
		projectTaskService.removeProjectTask(id);
		//getServletContext().getRequestDispatcher("/dashboard.jsp").forward(request, response);
		
		//URL Rewriting (aka the adding of the msg to the string)
		response.sendRedirect("./ListProjectTaskController?msg=Task Deleted Successfully!");
	}

}

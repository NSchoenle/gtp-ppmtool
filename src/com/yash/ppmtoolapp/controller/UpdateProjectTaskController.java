package com.yash.ppmtoolapp.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yash.ppmtoolapp.domain.Project;
import com.yash.ppmtoolapp.domain.ProjectTask;
import com.yash.ppmtoolapp.service.ProjectService;
import com.yash.ppmtoolapp.service.ProjectTaskService;
import com.yash.ppmtoolapp.serviceimpl.ProjectServiceImpl;
import com.yash.ppmtoolapp.serviceimpl.ProjectTaskServiceImpl;

/**
 * Servlet implementation class UpdateProjectController
 */
@WebServlet("/UpdateProjectController")
public class UpdateProjectTaskController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private ProjectTaskService projectTaskService = null;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateProjectTaskController() {
        super();
        projectTaskService= new ProjectTaskServiceImpl();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1: Get the id of the clicked project
//		Long id = Long.parseLong(request.getParameter("id"));
		int id = Integer.parseInt(request.getParameter("id"));
		
		//2: Fetch the project of the given id
		ProjectTask task = projectTaskService.getProjectTask(id);
		
		//3: Prepare the model-Happens in DAO
		
		
		//4: Share the model on edit page
		request.setAttribute("task", task);
		
		
		//5: Send the info on
		getServletContext().getRequestDispatcher("/editProjectTask.jsp").forward(request, response);
		//response.sendRedirect("./editProject.jsp");
	}


}

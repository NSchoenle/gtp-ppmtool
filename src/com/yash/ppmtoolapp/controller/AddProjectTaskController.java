package com.yash.ppmtoolapp.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yash.ppmtoolapp.domain.Project;
import com.yash.ppmtoolapp.domain.ProjectTask;
import com.yash.ppmtoolapp.service.ProjectTaskService;
import com.yash.ppmtoolapp.serviceimpl.ProjectTaskServiceImpl;

/**
 * Servlet implementation class AddProjectTaskController
 */
@WebServlet("/AddProjectTaskController")
public class AddProjectTaskController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private ProjectTaskService projectTaskService = null;
			
    public AddProjectTaskController() {
        super();
        projectTaskService = new ProjectTaskServiceImpl();
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ProjectTask projectTask = new ProjectTask();
	//	
		projectTask.setDescription(request.getParameter("summary"));
		
		projectTask.setAcceptanceCriteria(request.getParameter("acceptanceCriteria"));
		
		projectTask.setPriority((Integer.parseInt(request.getParameter("priority"))));
		
//		project.setStart_date(request.getParameter("start_date"));
//		project.setEnd_date(request.getParameter("end_date"));
		
		projectTaskService.createProjectTask(projectTask);
		
		//getServletContext().getRequestDispatcher("/dashboard.jsp").forward(request, response);
		response.sendRedirect("./ListProjectTaskController?msg=Project Task Created Successfully");
	}

}

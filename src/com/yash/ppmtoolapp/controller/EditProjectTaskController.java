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
 * Servlet implementation class EditProjectController
 */
@WebServlet("/EditProjectTaskController")
public class EditProjectTaskController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ProjectTaskService projectTaskService = null;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditProjectTaskController() {
        super();
        projectTaskService= new ProjectTaskServiceImpl();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Take input from form
				//Long id = Long.parseLong(request.getParameter("id"));
				int id = Integer.parseInt(request.getParameter("id"));
				ProjectTask task = new ProjectTask();
				task.setProject_task_id(id);
				
				
//				task.setProjectTask_name(request.getParameter("project_name"));
//				task.setProjectTask_Identifier(request.getParameter("project_Identifier"));
//				task.setDescription(request.getParameter("description"));
				
//				project.setStart_date(request.getParameter("start_date"));
//				project.setEnd_date(request.getParameter("end_date"));
				
				projectTaskService.updateProjectTask(task);
				
				//getServletContext().getRequestDispatcher("/dashboard.jsp").forward(request, response);
				response.sendRedirect("./ListProjectTaskController?msg=Task Updated Successfully");
	}

}

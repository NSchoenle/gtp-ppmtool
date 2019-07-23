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
 * Servlet implementation class EditProjectController
 */
@WebServlet("/EditProjectController")
public class EditProjectController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ProjectService projectService = null;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditProjectController() {
        super();
        projectService= new ProjectServiceImpl();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Take input from form
				Long id = Long.parseLong(request.getParameter("id"));
				Project project = new Project();
				project.setId(id);
				project.setProject_name(request.getParameter("project_name"));
				project.setProject_Identifier(request.getParameter("project_Identifier"));
				project.setDescription(request.getParameter("description"));
				
//				project.setStart_date(request.getParameter("start_date"));
//				project.setEnd_date(request.getParameter("end_date"));
				
				projectService.updateProject(project);
				
				//getServletContext().getRequestDispatcher("/dashboard.jsp").forward(request, response);
				response.sendRedirect("./ListProjectController?msg=Record Updated Successfully");
	}

}

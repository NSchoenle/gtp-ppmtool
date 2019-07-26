package com.yash.ppmtoolapp.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yash.ppmtoolapp.domain.Project;

/**
 * Servlet implementation class ListProjectTaskController
 */
@WebServlet("/ListProjectTaskController")
public class ListProjectTaskController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	private ProjectTaskService projectTaskService = null;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListProjectTaskController() {
        super();
        projectTaskService = new ProjectTaskServiceImpl();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Project> tasks = projectTaskService.getAllTasks();
		
		//Share the list with the resquest
		request.setAttribute("tasks", tasks); //Might need 3 attributes filtered by the status
		
		//Send the request on with the request dispatcher for the WHOLE app (aka the reason we use servlet context)
		getServletContext().getRequestDispatcher("/projectBoard.jsp").forward(request, response);
		
	}

}

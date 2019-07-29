package com.yash.ppmtoolapp.test;

import java.util.List;

import com.yash.ppmtoolapp.dao.ProjectTaskDAO;
import com.yash.ppmtoolapp.daoimpl.ProjectTaskDAOImpl;
import com.yash.ppmtoolapp.domain.ProjectTask;

public class FindAllProjectTasksTest {
	
	///suppose to 

	public static void main(String[] args) {
		
		
		ProjectTaskDAO dao = new ProjectTaskDAOImpl();
		
		List<ProjectTask> tasks = dao.findAllProjectTask();
		
		for(ProjectTask p : tasks) {
			System.out.println(p.toString());
		}

	}

}

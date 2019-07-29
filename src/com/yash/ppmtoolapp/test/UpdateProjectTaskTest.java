package com.yash.ppmtoolapp.test;

import com.yash.ppmtoolapp.daoimpl.ProjectTaskDAOImpl;
import com.yash.ppmtoolapp.domain.ProjectTask;

public class UpdateProjectTaskTest {

	public static void main(String[] args) {
	
		ProjectTaskDAOImpl dao = new ProjectTaskDAOImpl();
		
		ProjectTask p = new ProjectTask();
		
		p.setAcceptance_criteria("Completed");
		p.setId(5);
		p.setProject_id(5);
		p.setStatus("connect to the database");
		p.setPriority("high");
		dao.updateProjectTask(p);
		System.out.println("done");
		
	

	}

}

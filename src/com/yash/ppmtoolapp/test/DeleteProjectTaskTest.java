package com.yash.ppmtoolapp.test;

import com.yash.ppmtoolapp.dao.ProjectTaskDAO;
import com.yash.ppmtoolapp.daoimpl.ProjectTaskDAOImpl;
import com.yash.ppmtoolapp.domain.ProjectTask;

public class DeleteProjectTaskTest {
	
	
	public static void main(String[] args) {
	
	ProjectTaskDAO dao = new ProjectTaskDAOImpl();
	
	//ProjectTask p = new ProjectTask();
	
	
	
	
	
	
	dao.deleteProjectTask(5);
	

}
}

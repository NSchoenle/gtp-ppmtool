package com.yash.ppmtoolapp.dao;

import com.yash.ppmtoolapp.domain.Developer;
import com.yash.ppmtoolapp.domain.ProjectTask;

public interface ManagerDAO {
	
	
	public void assignTask(ProjectTask p, Developer d);
	
	public void deleteTask(ProjectTask p);
	
	
	public void updateTask(ProjectTask p);
	
	

}

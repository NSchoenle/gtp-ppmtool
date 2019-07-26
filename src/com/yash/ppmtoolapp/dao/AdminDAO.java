package com.yash.ppmtoolapp.dao;

import com.yash.ppmtoolapp.domain.Manager;
import com.yash.ppmtoolapp.domain.Project;

public interface AdminDAO {
	
	public void createProject(Project p);
	
	
	public void AssignProject(Project p, Manager m);
	
	

}

	

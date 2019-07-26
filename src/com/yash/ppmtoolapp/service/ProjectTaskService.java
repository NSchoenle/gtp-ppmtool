package com.yash.ppmtoolapp.service;

import java.util.List;

import com.yash.ppmtoolapp.domain.ProjectTask;

public interface ProjectTaskService {
	void createProjectTask(ProjectTask p);
	void removeProjectTask(ProjectTask p);
	void removeProjectTask(int id );
	void updateProjectTask(ProjectTask p);
	ProjectTask getProjectTask(int id);
	List <ProjectTask> getAllProjectTasks();
	
	
	

}

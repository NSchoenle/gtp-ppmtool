package com.yash.ppmtoolapp.dao;

import java.util.List;

import com.yash.ppmtoolapp.domain.ProjectTask;

public interface ProjectTaskDAO {
	
	void saveProjectTask(ProjectTask p);
	
	
	void deleteProjectTask(ProjectTask p);
	
	
	void updateProjectTask(ProjectTask p);
	
	
	void deleteProjectTask(int id);
	
	
	
	
	ProjectTask findProjectTaskById(int id);
	
	
	List<ProjectTask> findAllProjectTask();
	
	
	

}

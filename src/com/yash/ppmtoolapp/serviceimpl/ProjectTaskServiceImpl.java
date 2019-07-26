package com.yash.ppmtoolapp.serviceimpl;

import java.util.List;

import com.yash.ppmtoolapp.dao.ProjectTaskDAO;
import com.yash.ppmtoolapp.daoimpl.ProjectTaskDAOImpl;
import com.yash.ppmtoolapp.domain.ProjectTask;
import com.yash.ppmtoolapp.service.ProjectTaskService;

public class ProjectTaskServiceImpl implements ProjectTaskService{
	
	private ProjectTaskDAO projectTaskDAO= null;

	@Override
	public void createProjectTask(ProjectTask p) {
		this.projectTaskDAO =new ProjectTaskDAOImpl();
		
	}
	
	//here is the new staged file

	@Override
	public void removeProjectTask(ProjectTask p) {
		projectTaskDAO.deleteProjectTask(p);
		
	}

	@Override
	public void removeProjectTask(int id) {
		projectTaskDAO.deleteProjectTask(id);
	}

	@Override
	public void updateProjectTask(ProjectTask p) {
		projectTaskDAO.updateProjectTask(p);
		
	}

	@Override
	public ProjectTask getProjectTask(int id) {
		
		return projectTaskDAO.findProjectTaskById(id);
	}

	@Override
	public List<ProjectTask> getAllProjectTasks() {
		
		return projectTaskDAO.findAllProjectTask();
	}

}

package com.yash.ppmtoolapp.domain;

import java.util.ArrayList;
import java.util.List;

public class Manager {
	
	private int user_id;
	
	private List<Project> assignedProjects = new ArrayList<>();

	public List<Project> getAssignedProjects() {
		return assignedProjects;
	}
	
	
	public void setAssignedProject(Project p) {
		assignedProjects.add(p);
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	
	
	
	

}

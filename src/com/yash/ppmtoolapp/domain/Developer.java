package com.yash.ppmtoolapp.domain;

import java.util.ArrayList;
import java.util.List;

public class Developer {
	
	
	private int user_id;
	
	private String name;
	
	private List<ProjectTask> projecttasks = new ArrayList<>();

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public List<ProjectTask> getProjecttasks() {
		return projecttasks;
	}

	public void setProjecttasks(List<ProjectTask> projecttasks) {
		this.projecttasks = projecttasks;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	

}

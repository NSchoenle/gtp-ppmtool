package com.yash.ppmtoolapp.domain;

import java.util.Date;

public class ProjectTask {
	
	private int project_task_id;
	
	private int project_id;
	
	
	private Date start_date;
	
	private int priority;
	
	private String status;
	
	private String description;
	
	private Date end_date;
	
	
	private int duration;
	
	private String project_task_name;
	
	
	public int getProject_task_id() {
		return project_task_id;
	}

	public void setProject_task_id(int project_task_id) {
		this.project_task_id = project_task_id;
	}

	public int getProject_id() {
		return project_id;
	}

	public void setProject_id(int project_id) {
		this.project_id = project_id;
	}

	public Date getStart_date() {
		return start_date;
	}

	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getEnd_date() {
		return end_date;
	}

	public void setEnd_date(Date end_date) {
		this.end_date = end_date;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public String getProject_task_name() {
		return project_task_name;
	}

	public void setProject_task_name(String project_task_name) {
		this.project_task_name = project_task_name;
	}

	@Override
	public String toString() {
		return "ProjectTask [project_task_id=" + project_task_id + ", project_id=" + project_id + ", start_date="
				+ start_date + ", priority=" + priority + ", status=" + status + ", description=" + description
				+ ", end_date=" + end_date + ", duration=" + duration + ", project_task_name=" + project_task_name
				+ "]";
	}
	
	

}

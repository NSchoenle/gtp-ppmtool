package com.yash.ppmtoolapp.domain;

import java.util.Date;

public class ProjectTask {
	
	private int id;
	
	private int project_id;
	
	private String priority;
	
	private String status;
	
	private String summary;
	
	private Date due_date;
	
	private String acceptance_criteria;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getProject_id() {
		return project_id;
	}

	public void setProject_id(int project_id) {
		this.project_id = project_id;
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public Date getDue_date() {
		return due_date;
	}

	public void setDue_date(Date due_date) {
		this.due_date = due_date;
	}

	public String getAcceptance_criteria() {
		return acceptance_criteria;
	}

	public void setAcceptance_criteria(String acceptance_criteria) {
		this.acceptance_criteria = acceptance_criteria;
	}

	@Override
	public String toString() {
		return "ProjectTask [id=" + id + ", project_id=" + project_id + ", priority=" + priority + ", status=" + status
				+ ", summary=" + summary + ", due_date=" + due_date + ", acceptance_criteria=" + acceptance_criteria
				+ "]";
	}
	
	
	
	

	
	

}

package com.yash.ppmtoolapp.domain;

import java.util.Date;

/**
 * This project domain is used as a data traveler object from layer to layer
 * @author nolanschoenle
 *
 */
public class Project {
	/**
	 * Id of the project
	 * PK
	 */
	private Long id;
	/**
	 * Name of the project
	 */
	private String project_name;
	/**
	 * This is a unique field used for creating project tasks (instead of using the id)
	 */
	private String project_Identifier;
	/**
	 * This is the short description of the project
	 */
	private String description;
	/**
	 * This is the start date of the project
	 */
	private Date start_date;
	/**
	 * Projected end date of the project
	 */
	private Date end_date;
	/**
	 * Date project was first created in the system
	 */
	private Date created_at;
	/**
	 * Date of most recent update to the project
	 */
	private Date updated_at;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getProject_name() {
		return project_name;
	}
	public void setProject_name(String project_name) {
		this.project_name = project_name;
	}
	public String getProject_Identifier() {
		return project_Identifier;
	}
	public void setProject_Identifier(String project_Identifier) {
		this.project_Identifier = project_Identifier;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getStart_date() {
		return start_date;
	}
	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}
	public Date getEnd_date() {
		return end_date;
	}
	public void setEnd_date(Date end_date) {
		this.end_date = end_date;
	}
	public Date getCreated_at() {
		return created_at;
	}
	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}
	public Date getUpdated_at() {
		return updated_at;
	}
	public void setUpdated_at(Date updated_at) {
		this.updated_at = updated_at;
	}
	@Override
	public String toString() {
		return "Project [id=" + id + ", project_name=" + project_name + ", project_Identifier=" + project_Identifier
				+ ", description=" + description + ", start_date=" + start_date + ", end_date=" + end_date
				+ ", created_at=" + created_at + ", updated_at=" + updated_at + "]";
	}
	
	
}

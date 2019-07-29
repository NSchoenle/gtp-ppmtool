package com.yash.ppmtoolapp.daoimpl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.List;

import com.yash.ppmtoolapp.dao.ProjectTaskDAO;
import com.yash.ppmtoolapp.domain.Project;
import com.yash.ppmtoolapp.domain.ProjectTask;
import com.yash.ppmtoolapp.util.JDBCUtil;

public class ProjectTaskDAOImpl extends JDBCUtil implements ProjectTaskDAO {

	@Override
	public void saveProjectTask(ProjectTask p) {
		String sql = "Insert into project_task(id, summary, acceptence_criteria,  priority, status, project_id) values (?,?,?,?,?,?)";
		
	
		PreparedStatement psmt = createPreparedStatement(sql);
		try{
			psmt.setInt(1, p.getId());
			psmt.setString(2, p.getSummary());
			psmt.setString(3, p.getAcceptance_criteria());
			//psmt.setDate(4, p.getDue_date());
			psmt.setString(4, p.getPriority());
			psmt.setString(5, p.getStatus());
			psmt.setInt(6,  p.getProject_id());
			psmt.execute();
			
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void deleteProjectTask(ProjectTask p) {
		String sql = "Delete from project_task where id = " + p.getId();
		PreparedStatement psmt = createPreparedStatement(sql);
		try {
			psmt.execute();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void updateProjectTask(ProjectTask p) {
		int id = p.getId();
		String whereStmt = "WHERE id=" + id + ";";
		
		String sql = "UPDATE project_task SET status='" + p.getStatus()+ "' "
				+ ", summary='" + p.getSummary() + "' "
				+ ", priority='" + p.getPriority() +"' "
				
				+ whereStmt;
		
		try {
			pstmt = createPreparedStatement(sql);
			pstmt.execute();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}

	@Override
	public void deleteProjectTask(int id) {
		String sql = "DELETE FROM project_task WHERE id="+id;
		
		PreparedStatement pstmt = createPreparedStatement(sql);
		
		try {
			pstmt.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	

	@Override
	public ProjectTask findProjectTaskById(int id) {
		ProjectTask p = null;
		String sql = "SELECT * from project_task WHERE id =" + id;
		try {
			PreparedStatement pstmt = createPreparedStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			DateFormat df= DateFormat.getDateInstance();
			if (rs.next()) { 
				p =new ProjectTask();
				p.setId(rs.getInt("id"));
				p.setSummary(rs.getString("summary"));
				p.setPriority(rs.getString("priority"));
				p.setStatus(rs.getString("status"));
				p.setProject_id(rs.getInt("project_id"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return p;
	}

	@Override
	public List<ProjectTask> findAllProjectTask() {
		
		List<ProjectTask> projecttasks = new ArrayList<>();
		String sql = "SELECT * from project_task";	
		PreparedStatement pstmt = createPreparedStatement(sql);
		
		try {
			ResultSet rs = pstmt.executeQuery(sql);
			ProjectTask projectTask = null;
			DateFormat df= DateFormat.getDateInstance();
		
			while (rs.next()) {
			
				projectTask = new ProjectTask();
				projectTask.setId(rs.getInt("id"));
				projectTask.setSummary(rs.getString("summary"));
				projectTask.setPriority(rs.getString("priority"));
				projectTask.setProject_id(rs.getInt("project_id"));
				projectTask.setStatus(rs.getString("status"));
				projectTask.setAcceptance_criteria(rs.getString("acceptence_criteria"));
				projecttasks.add(projectTask);
				
			
			}
				
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return projecttasks;
	}

}

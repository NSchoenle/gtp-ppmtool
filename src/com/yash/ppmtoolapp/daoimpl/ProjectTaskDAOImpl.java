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
		String sql = "Insert into ProjectTasks(project_task_id, project_id, project_task_name) values (?,?,?)";
		
		
		PreparedStatement psmt = createPreparedStatement(sql);
		try{
			psmt.setInt(1, p.getProject_task_id());
			psmt.setInt(2, p.getProject_id());
			psmt.setString(3, p.getProject_task_name());
			psmt.execute();
			
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void deleteProjectTask(ProjectTask p) {
		String sql = "Delete from ProjectTasks where project_task_id = " + p.getProject_task_id();
		PreparedStatement psmt = createPreparedStatement(sql);
		try {
			psmt.execute();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void updateProjectTask(ProjectTask p) {
		int id = p.getProject_task_id();
		String whereStmt = "WHERE project_task_id=" + id + ";";
		
		String sql = "UPDATE ProjectTask SET status='" + p.getStatus()+ "' "
				+ ", description='" + p.getDescription() + "' "
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
		String sql = "DELETE FROM ProjectTask WHERE project_task_id="+id;
		
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
		String sql = "SELECT * from projects WHERE project_task_id =" + id;
		try {
			PreparedStatement pstmt = createPreparedStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			DateFormat df= DateFormat.getDateInstance();
			if (rs.next()) { 
				p =new ProjectTask();
				p.setProject_task_id(rs.getInt("project_task_id"));
				p.setDescription(rs.getString("project_task_name"));
				p.setPriority(rs.getInt("priority"));
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
		String sql = "SELECT * from ProjectTasks";	
		PreparedStatement pstmt = createPreparedStatement(sql);
		
		try {
			ResultSet rs = pstmt.executeQuery(sql);
			ProjectTask projectTask = null;
			DateFormat df= DateFormat.getDateInstance();
		
			while (rs.next()) {
			
				projectTask = new ProjectTask();
				projectTask.setProject_id(rs.getInt("project_task_id"));
				projectTask.setDescription(rs.getString("description"));
				projectTask.setPriority(rs.getInt("priority"));
				projectTask.setProject_task_id(rs.getInt("project_task_id"));
				projectTask.setStatus(rs.getString("status"));
				projectTask.setProject_task_name(rs.getString("project_task_name"));
				projecttasks.add(projectTask);
				
			
			}
				
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return projecttasks;
	}

}

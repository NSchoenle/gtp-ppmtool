package com.yash.ppmtoolapp.daoimpl;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.yash.ppmtoolapp.dao.ProjectTaskDAO;
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
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateProjectTask(ProjectTask p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteProjectTask(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ProjectTask findProjectTaskById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ProjectTask> findAllProjectTask() {
		// TODO Auto-generated method stub
		return null;
	}

}

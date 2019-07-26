package com.yash.ppmtoolapp.daoimpl;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.yash.ppmtoolapp.dao.ManagerDAO;
import com.yash.ppmtoolapp.domain.Developer;
import com.yash.ppmtoolapp.domain.ProjectTask;
import com.yash.ppmtoolapp.util.JDBCUtil;

public class ManagerDAOImpl extends JDBCUtil implements ManagerDAO {

	@Override
	public void assignTask(ProjectTask p, Developer d) {
		String sql = "Insert into project_task(developer_id) values(?)";
		
		PreparedStatement pstmt = createPreparedStatement(sql);
		
		try {
			pstmt.setInt(1, d.getUser_id());
			pstmt.execute();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}

	@Override
	public void deleteTask(ProjectTask p) {
	
		String sql = "Delete from project_task WHERE id = " + p.getId();
		
		PreparedStatement pstmt = createPreparedStatement(sql);
		
		try {
			pstmt.execute();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
 		
	}

	@Override
	public void updateTask(ProjectTask p) {
		
		int id = p.getId();
		
		String whereStmt = "WHERE id =" + id + ";";
		String sql = "Update project_task set priority = '" + p.getPriority() + "'" + whereStmt;
		
		PreparedStatement pstmt = createPreparedStatement(sql);
		
		try {
			pstmt.execute();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}

}

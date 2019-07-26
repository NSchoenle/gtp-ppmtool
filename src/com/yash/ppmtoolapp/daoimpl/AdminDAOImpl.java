package com.yash.ppmtoolapp.daoimpl;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.yash.ppmtoolapp.dao.AdminDAO;
import com.yash.ppmtoolapp.dao.ProjectDAO;
import com.yash.ppmtoolapp.domain.Admin;
import com.yash.ppmtoolapp.domain.Manager;
import com.yash.ppmtoolapp.domain.Project;
import com.yash.ppmtoolapp.util.JDBCUtil;

public class AdminDAOImpl extends JDBCUtil implements AdminDAO {

	
	public void createProject(Project p) {
		
		
		String sql = "Insert into project(id, name) values(?,?)";
		
		PreparedStatement pstmt = createPreparedStatement(sql);
		
		try {
			pstmt.setString(1, p.getProject_name());
			pstmt.setLong(2, p.getId());
		} catch (SQLException e) {
			
			e.printStackTrace();
		}		
	}


	public void AssignProject(Project p, Manager m) {
		String sql = "Insert into project(manager_id) values(?)";
		
		PreparedStatement pstmt = createPreparedStatement(sql);
		
		
		try {
			pstmt.setInt(1, m.getUser_id());
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}
	
	
	//public List<Project> getProjects(Manager m)

}

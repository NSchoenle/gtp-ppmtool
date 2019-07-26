package com.yash.ppmtoolapp.daoimpl;

import java.sql.SQLException;

import com.yash.ppmtoolapp.dao.DeveloperDAO;
import com.yash.ppmtoolapp.domain.ProjectTask;
import com.yash.ppmtoolapp.util.JDBCUtil;

public class DeveloperDAOImpl extends JDBCUtil implements DeveloperDAO {

	@Override
	public void updateProjectTask(ProjectTask p) {
		int id = p.getProject_task_id();//getId();
		String whereStmt = "WHERE id = " + id + ";";
		
		String sql = "Update project_task set status = '" + p.getStatus() + "'" +", summary='"+
						//p.getSummary()
						p.getDescription()+"'"+ whereStmt;
		
		
		pstmt = createPreparedStatement(sql);
		
		try {
			pstmt.execute();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}
	
	

}

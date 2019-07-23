package com.yash.ppmtoolapp.daoimpl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import com.yash.ppmtoolapp.dao.ProjectDAO;
import com.yash.ppmtoolapp.domain.Project;
import com.yash.ppmtoolapp.util.JDBCUtil;

public class ProjectDAOImpl extends JDBCUtil implements ProjectDAO {

	
	@Override
	public void save(Project project) {
		String sql = "INSERT INTO " +
					"projects(project_name, description, project_Identifier)" + 
					"VALUES(?,?,?)";
		PreparedStatement pstmt = createPreparedStatement(sql);
		try {
			pstmt.setString(1, project.getProject_name());
			pstmt.setString(2, project.getDescription());
			pstmt.setString(3, project.getProject_Identifier());

			pstmt.execute();
		} catch (SQLException e) {

			e.printStackTrace();
		}
		releaseResources();
		
	}

	@Override
	public void update(Project project) {
		Long id = project.getId();
		String whereStmt = "WHERE id=" + id + ";";
		
		//TODO: FIX THIS SQL STATEMENT TO DEAL WITH NON-REQUIRED FIELDS 
		String sql = "UPDATE projects SET project_name='" + project.getProject_name()+ "' "
				+ ", description='" + project.getDescription() + "' "
				+ ", project_Identifier='" + project.getProject_Identifier() +"' "
			
//				+ ", start_date='" + project.getStart_date() + "' "
//				+ ", end_date='" + project.getEnd_date() + "' "
//				+ ", created_At='" + project.getCreated_at() + "' "
//				+ ", updated_At='" + project.getUpdated_at() + "' "
				+whereStmt;
		try {
			pstmt = createPreparedStatement(sql);
			pstmt.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void delete(Long id) {
		String sql = "DELETE FROM projects WHERE id="+id;
		
		PreparedStatement pstmt = createPreparedStatement(sql);
		
		try {
			pstmt.execute();
		} catch (SQLException e) {
			//throw new UserIDException("Id not found");
		}
		
		releaseResources();
		
	}

	@Override
	public void delete(Project project) {
		String sql = "DELETE FROM projects WHERE id="+project.getId();
		
		PreparedStatement pstmt = createPreparedStatement(sql);
		
		try {
			pstmt.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		releaseResources();	
		
	}

	@Override
	public Project findById(Long id) {
		Project ret = null;
		
		String sql = "SELECT * from projects WHERE id =" + id;
		try {
			
			PreparedStatement pstmt = createPreparedStatement(sql);

			ResultSet rs = pstmt.executeQuery();
			DateFormat df= DateFormat.getDateInstance();
			// Advance the ResultSet pointer to the first object if there is one
			if (rs.next()) { 
				ret =new Project();
				ret.setId(rs.getLong("id"));
				ret.setProject_name(rs.getString("project_name"));
				ret.setDescription(rs.getString("description"));
				ret.setProject_Identifier(rs.getString("project_Identifier"));
//				ret.setStart_date(df.parse(rs.getString("start_date")));
//				ret.setEnd_date(df.parse(rs.getString("end_date")));
//				ret.setCreated_at(df.parse(rs.getString("created_At")));
//				ret.setUpdated_at(df.parse(rs.getString("updated_At")));
			}
		} catch (SQLException e) { //| ParseException e) {

			e.printStackTrace();
		}

		releaseResources();
		return ret;
	}

	@Override
	public List<Project> findAll() {
		List<Project> projects = new ArrayList<>();
		String sql = "SELECT * from projects";

		PreparedStatement pstmt = createPreparedStatement(sql);

		try {
			ResultSet rs = pstmt.executeQuery();
			Project project = null;
			DateFormat df= DateFormat.getDateInstance();
			// MAPPING from resultset to contact list
			while (rs.next()) {
				project = new Project();
				project.setId(rs.getLong("id"));
				project.setProject_name(rs.getString("project_name"));
				project.setDescription(rs.getString("description"));
				project.setProject_Identifier(rs.getString("project_Identifier"));
				
//				project.setStart_date(df.parse(rs.getString("start_date")));
//				project.setEnd_date(df.parse(rs.getString("end_date")));
//				project.setCreated_at(df.parse(rs.getString("created_At")));
//				project.setUpdated_at(df.parse(rs.getString("updated_At")));
//				
				projects.add(project);
			}
		} catch (SQLException e) {//| ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		releaseResources();
		return projects;
	}

}

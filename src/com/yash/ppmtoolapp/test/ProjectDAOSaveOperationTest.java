package com.yash.ppmtoolapp.test;

import org.apache.log4j.*;

import com.yash.ppmtoolapp.dao.ProjectDAO;
import com.yash.ppmtoolapp.daoimpl.ProjectDAOImpl;
import com.yash.ppmtoolapp.domain.Project;

public class ProjectDAOSaveOperationTest {
	public static void main(String[] args) {
		ProjectDAO dao = new ProjectDAOImpl();
		
		Project project = new Project();
		
		project.setProject_name("thing");
		project.setDescription("this is a test");
		project.setProject_Identifier("MO1214");
		
		Logger log = Logger.getLogger(ProjectDAOSaveOperationTest.class);
		
		dao.save(project);
		log.info("Save successful");
	}
}

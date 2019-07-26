package com.yash.ppmtoolapp.test;

import org.apache.log4j.*;

import com.yash.ppmtoolapp.dao.ProjectDAO;
import com.yash.ppmtoolapp.daoimpl.ProjectDAOImpl;
import com.yash.ppmtoolapp.domain.Project;

public class ProjectDAOUpdateTest {
	public static void main(String[] args) {
		ProjectDAO dao = new ProjectDAOImpl();
		
		Project project = new Project();
		project.setId(1l);
		project.setProject_name("updatedThing");
		project.setDescription("this is a test");
		project.setProject_Identifier("MO14");
		
		Logger log = Logger.getLogger(ProjectDAOSaveOperationTest.class);
		
		dao.update(project);
		log.info("Update successful");
	}
}

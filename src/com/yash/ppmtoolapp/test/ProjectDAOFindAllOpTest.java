package com.yash.ppmtoolapp.test;

import java.util.List;

import com.yash.ppmtoolapp.dao.ProjectDAO;
import com.yash.ppmtoolapp.daoimpl.ProjectDAOImpl;
import com.yash.ppmtoolapp.domain.Project;

public class ProjectDAOFindAllOpTest {
	public static void main(String[] args) {
		ProjectDAO dao = new ProjectDAOImpl();
		
		List<Project> projects = dao.findAll();
		
		for(Project p: projects) {
			System.out.println(p);
		}

	}
}

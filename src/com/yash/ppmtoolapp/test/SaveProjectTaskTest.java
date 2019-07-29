package com.yash.ppmtoolapp.test;

import com.yash.ppmtoolapp.dao.ProjectTaskDAO;
import com.yash.ppmtoolapp.daoimpl.ProjectTaskDAOImpl;
import com.yash.ppmtoolapp.domain.ProjectTask;

public class SaveProjectTaskTest {

	public static void main(String[] args) {
		ProjectTaskDAO dao = new ProjectTaskDAOImpl();
		
		ProjectTask p = new ProjectTask();
		
		p.setAcceptance_criteria("needs to look good");
		p.setId(5);
		p.setProject_id(10);
		p.setStatus("not done");
		p.setSummary("i dont know");
		p.setPriority("high");
		
		dao.saveProjectTask(p);
		System.out.println("done");

	}

}

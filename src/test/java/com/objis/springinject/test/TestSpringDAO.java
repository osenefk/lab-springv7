package com.objis.springinject.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.objis.springinject.dao.EmployeDao;
import com.objis.springinject.domaine.Employe;

import junit.framework.TestCase;

public class TestSpringDAO extends TestCase {

	private Employe emp;
	private EmployeDao springDao;
	private ClassPathXmlApplicationContext appContext;

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		emp = new Employe("sbadji", "passer", "Seynabou", "BADJI", "sbadji@gmail.com", "Assistante");
		appContext = new ClassPathXmlApplicationContext("spring-data.xml");

		springDao = (EmployeDao) appContext.getBean("employeDao");
	}

	@Override
	protected void tearDown() throws Exception {
		super.tearDown();
		emp = null;
		appContext = null;
		springDao = null;
	}

	public void testSaveEmploye() {
		springDao.save(emp);
	}

	public void testFindOne() {
		Employe employe = springDao.findOne(1);
		assertNotNull(employe);
	}

	
}

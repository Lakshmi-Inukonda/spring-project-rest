/**
 * 
 */
package com.tcs.service;

import com.tcs.bean.Professor;

/**
 * @author VENKY_HARI
 *
 */
public class ProfessorServiceOperation implements ProfessorService {
	@Autowired
	private ProfessorDAOInterface professors;
	
	@Override
	public List professorList() {
		// TODO Auto-generated method stub
		return professors.list();
	}

	@Override
	public Professor registeredCourses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Professor viewStudentInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Professor assignGrades() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Professor create(Professor Professor) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void insert(Professor Professor) {
		// TODO Auto-generated method stub
		
	}

}

/**
 * 
 */
package com.tcs.service;

import com.tcs.bean.Professor;

/**
 * @author VENKY_HARI
 *
 */
public interface ProfessorService {
	public List professorList();
	public Professor registeredCourses();
	public Professor viewStudentInfo();
	public Professor assignGrades();
	public Professor create(Professor Professor);
	public void insert(Professor Professor);
}

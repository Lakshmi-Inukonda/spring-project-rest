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
	public List studentList();
	public Professor registeredCourses();
	public Professor viewStudentInfo();
	public Professor assignGrades();
}

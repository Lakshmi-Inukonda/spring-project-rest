/**
 * 
 */
package com.tcs.dao;

import java.util.List;

import com.tcs.bean.Student;

/**
 * @author VENKY_HARI
 *
 */
public interface StudentDAOInterface {
	public List<Student> list();
	public Student getstudentRegNo(Long studentRegNo);
	public Student create(Student Student);
	public Long delete(Long studentRegNo);
	public Student update(Long studentRegNo, Student Student);
	public static void insert(Student Student) {};
}

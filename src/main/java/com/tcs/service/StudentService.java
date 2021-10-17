/**
 * 
 */
package com.tcs.service;

import java.util.List;

import com.tcs.bean.Student;

/**
 * @author VENKY_HARI
 *
 */
public interface StudentService {
	public List studentList();
	public Student getstudentRegNo(Long studentRegNo);
	public Student create(Student Student);
	public Long delete(Long studentRegNo);
	public Student update(Long studentRegNo, Student Student);
	public void insert(Student Student);
}
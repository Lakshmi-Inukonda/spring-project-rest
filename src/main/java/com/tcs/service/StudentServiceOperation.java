package com.tcs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.tcs.bean.Student;
import com.tcs.dao.StudentDAOImpl;
import com.tcs.dao.StudentDAOInterface;

@Service
@Component
public class StudentServiceOperation implements StudentService {
	@Autowired 
	private StudentDAOInterface students;

	@Override
	public List studentList() {
		// TODO Auto-generated method stub
		return students.list();
	}

	@Override
	public Student getstudentRegNo(Long studentRegNo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student create(Student Student) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long delete(Long studentRegNo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student update(Long studentRegNo, Student Student) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insert(Student Student) {
		// TODO Auto-generated method stub
		
	}
	
}
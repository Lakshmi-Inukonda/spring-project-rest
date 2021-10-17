package com.tcs.restcontroller;

import java.util.List;

import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import com.tcs.bean.Student;

import com.tcs.dao.StudentDAOImpl;
import com.tcs.service.StudentServiceOperation;
import com.tcs.service.StudentService;

@RestController
@CrossOrigin
public class StudentController {
	@Autowired //CustomerDAO customerDAOOperation = new CustomerDAO();
	private StudentService students;
	
	@RequestMapping("/students")
	public List getStudents() {
		return students.studentList();
	}
	
	@RequestMapping(value = "/post/students")
	public ResponseEntity create(@RequestBody Student Student) {

		StudentDAOImpl.insert(Student);

		return new ResponseEntity(Student, HttpStatus.OK);
	}

	
	
	
	
	
	
	
	
}
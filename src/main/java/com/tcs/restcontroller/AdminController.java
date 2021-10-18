/**
 * 
 */
package com.tcs.restcontroller;

import javax.ws.rs.core.MediaType;

//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.bean.Admin;

/**
 * @author VENKY_HARI
 *
 */
@RestController
public class AdminController {
		@PostMapping("/CRSadmin")
		public String CRSadmin() {
			
			
			return "Welcome";
	}

		@RequestMapping(produces = MediaType.APPLICATION_JSON, 
			    method = RequestMethod.POST,
			    value = "/admindetails")
			@ResponseBody
		 public Admin profdetails(){
			
			Admin c1=new Admin();
			c1.setAdminId(111);
			c1.setName("Kiran");
				
			
			return c1;
			   
		}
	
	@RequestMapping("/approveStudReg")
	public List getStudents() {
		return students.studentList();
	}
	@RequestMapping("/addNewProf")
	public List getStudents() {
		return students.studentList();
	}	
	@RequestMapping("/removeProf")
	public List getStudents() {
		return students.studentList();
	}	
	@RequestMapping("/generateGradeCard")
	public List getStudents() {
		return students.studentList();
	}	
	@RequestMapping("/addCourses")
	public List getStudents() {
		return students.studentList();
	}
	@RequestMapping(value = "/post/admin")
	public ResponseEntity create(@RequestBody Admin Admin) {

		AdminDAOImpl.insert(Admin);

		return new ResponseEntity(Admin, HttpStatus.OK);
	}	

}

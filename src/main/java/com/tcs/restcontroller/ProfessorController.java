/**
 * 
 */
package com.tcs.restcontroller;

import javax.ws.rs.core.MediaType;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.bean.Professor;

/**
 * @author VENKY_HARI
 *
 */
@RestController
public class ProfessorController {
		@GetMapping("/CRSprof")
		public String CRSprof() {
			
			
			return "Welcome";
	}

		@RequestMapping(produces = MediaType.APPLICATION_JSON, 
			    method = RequestMethod.GET,
			    value = "/profdetails")
			@ResponseBody
		 public Professor profdetails(){
			
			Professor c1=new Professor();
			c1.setProfName("ajay");
			c1.setProfRegId(14);
			c1.setBranch("MECH");
				
			
			return c1;
			   
		}
	
	@Autowired //CustomerDAO customerDAOOperation = new CustomerDAO();
	private ProfessorService professors;
	
	@RequestMapping("/registeredCourses")
	public List getProfessors() {
		return professors.professorList();
	}
	

	@RequestMapping("/viewStudentInfo")
		public List getProfessors() {
			return professors.professorList();
	}

	@RequestMapping("/assignGrades")
		public List getProfessors() {
			return professors.professorList();
	}

	@RequestMapping(value = "/post/professors")
	public ResponseEntity create(@RequestBody Professor Professor) {

		ProfessorDAOImpl.insert(Professor);

		return new ResponseEntity(Professor, HttpStatus.OK);
	}

}

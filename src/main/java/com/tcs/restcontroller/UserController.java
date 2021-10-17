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

import com.tcs.bean.User;

/**
 * @author VENKY_HARI
 *
 */

@RestController
public class UserController {
	@GetMapping("/CRSuser")
	public String CRSuser() {
		
		
		return "Welcome";
}

	@RequestMapping(produces = MediaType.APPLICATION_JSON, 
		    method = RequestMethod.GET,
		    value = "/details")
		@ResponseBody
	 public User details(){
		
		User c1=new User();
		c1.setUserId(1);
		c1.setUsername("amit");
		c1.setEmail("delhi");
		c1.setBranch("CSE");
			
		
		return c1;
		
	}
}
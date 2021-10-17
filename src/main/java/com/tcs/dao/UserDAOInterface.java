/**
 * 
 */
package com.tcs.dao;

import com.tcs.bean.User;

/**
 * @author VENKY_HARI
 *
 */
public interface UserDAOInterface {
	public User createUser();
	public boolean deleteUser();
	public User updateUser();
	public User studentLogin();
	public User professorLogin();
	public User AdminLogin();
}

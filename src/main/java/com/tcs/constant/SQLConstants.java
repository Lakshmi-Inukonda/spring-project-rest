package com.tcs.constant;

public class SQLConstants {

	/**
	 * 
	 * Queries Related to Student Operation
	 * 
	 */

	public static final String ADD_STUDENT = "insert into student (studentRegNo, studentName, sem, branch) values (?,?,?,?)";

	public static final String IS_APPROVED = "select isapproved from student where studentRegNo = ? ";

	public static final String GET_STUDENT_REG_NO = "select studentRegNo from student";
           
	//return studentRegNo;
	
	}
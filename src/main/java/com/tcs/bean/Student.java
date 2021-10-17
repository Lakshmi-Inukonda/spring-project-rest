/**
 * 
 */
package com.tcs.bean;

/**
 * @author VENKY_HARI
 *
 */
public class Student {
	private long studentRegNo;
	private String studentName;
	private int sem;
	private String branch;
	/**
	 * @return the studentName
	 */
	
	public Student(long studentRegNo, String studentName, int sem, String branch) {
		this.studentRegNo=studentRegNo;
		this.studentName = studentName;
		this.sem = sem;
		this.branch = branch;
	}

	public Student() {
	}


	
	
	public String getStudentName() {
		return studentName;
	}
	/**
	 * @param studentName the studentName to set
	 */
	 public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	/**
	 * @return the studentRegNo
	*/
	public long getStudentRegNo() {
		return studentRegNo;
	}
	/**
	 * @param studentRegNo the studentRegNo to set
	*/
	public void setStudentRegNo(long studentRegNo) {
		this.studentRegNo = studentRegNo;
	}
	/**
	 * @return the sem
	 */
	public int getSem() {
		return sem;
	}
	/**
	 * @param sem the sem to set
	 */
	public void setSem(int sem) {
		this.sem = sem;
	}
	/**
	 * @return the branch
	 */
	public String getBranch() {
		return branch;
	}
	/**
	 * @param branch the branch to set
	 */
	public void setBranch(String branch) {
		this.branch = branch;
	}

	public static void add(Student students) {
		// TODO Auto-generated method stub
		
	}
	
}

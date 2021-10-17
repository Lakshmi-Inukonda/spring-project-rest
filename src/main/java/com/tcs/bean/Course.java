/**
 * 
 */
package com.tcs.bean;

/**
 * @author VENKY_HARI
 *
 */
public class Course {
	public int courseId;
	public double coursePrice;
	public String profName;
	/**
	 * @return the courseId
	 */
	public int getCourseId() {
		return courseId;
	}
	/**
	 * @param courseId the courseId to set
	 */
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	/**
	 * @return the coursePrice
	 */
	public double getCoursePrice() {
		return coursePrice;
	}
	/**
	 * @param coursePrice the coursePrice to set
	 */
	public void setCoursePrice(int coursePrice) {
		this.coursePrice = coursePrice;
	}
	/**
	 * @return the profName
	 */
	public String getProfName() {
		return profName;
	}
	/**
	 * @param profName the profName to set
	 */
	public void setProfName(String profName) {
		this.profName = profName;
	}
}

/**
 * 
 */
package com.tcs.bean;
import java.util.*;

/**
 * @author VENKY_HARI
 *
 */
public class PaymentNotification {
	public int transactionId;
	public String paymentStatus;
	private Date transactionTime;
	public int studRegNo;
	/**
	 * @return the transactionId
	 */
	public int getTransactionId() {
		return transactionId;
	}
	/**
	 * @param transactionId the transactionId to set
	 */
	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}
	/**
	 * @return the paymentStatus
	 */
	public String getPaymentStatus() {
		return paymentStatus;
	}
	/**
	 * @param paymentStatus the paymentStatus to set
	 */
	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}
	/**
	 * @return the transactionTime
	 */
	public Date getTransactionTime() {
		return transactionTime;
	}
	/**
	 * @param transactionTime the transactionTime to set
	 */
	public void setTransactionTime(Date transactionTime) {
		this.transactionTime = transactionTime;
	}
	/**
	 * @return the studRegNo
	 */
	public int getStudRegNo() {
		return studRegNo;
	}
	/**
	 * @param studRegNo the studRegNo to set
	 */
	public void setStudRegNo(int studRegNo) {
		this.studRegNo = studRegNo;
	}
}

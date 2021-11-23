package Pension.Management.system.model;

import java.sql.Date;
import java.time.LocalTime;

public class PaymentDetails {

	private int paymentId;
	private Date paymentdate;
	private LocalTime paymentTime;
	private String paymentStatus;
	public PaymentDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PaymentDetails(int paymentId, Date paymentdate, LocalTime paymentTime, String paymentStatus) {
		super();
		this.paymentId = paymentId;
		this.paymentdate = paymentdate;
		this.paymentTime = paymentTime;
		this.paymentStatus = paymentStatus;
	}
	public int getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}
	public Date getPaymentdate() {
		return paymentdate;
	}
	public void setPaymentdate(Date paymentdate) {
		this.paymentdate = paymentdate;
	}
	public LocalTime getPaymentTime() {
		return paymentTime;
	}
	public void setPaymentTime(LocalTime paymentTime) {
		this.paymentTime = paymentTime;
	}
	public String getPaymentStatus() {
		return paymentStatus;
	}
	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}
	@Override
	public String toString() {
		return "PaymentDetails [paymentId=" + paymentId + ", paymentdate=" + paymentdate + ", paymentTime="
				+ paymentTime + ", paymentStatus=" + paymentStatus + "]";
	}
	
	
}

package Pension.Management.system.model;

public class pensionDetails {

	private double amount;
	private double charges;
	private String bankType;
	private int statusCode;
	public pensionDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public pensionDetails(double amount, double charges, String bankType, int statusCode) {
		super();
		this.amount = amount;
		this.charges = charges;
		this.bankType = bankType;
		this.statusCode = statusCode;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public double getCharges() {
		return charges;
	}
	public void setCharges(double charges) {
		this.charges = charges;
	}
	public String getBankType() {
		return bankType;
	}
	public void setBankType(String bankType) {
		this.bankType = bankType;
	}
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	@Override
	public String toString() {
		return "pensionDetails [amount=" + amount + ", charges=" + charges + ", bankType=" + bankType + ", statusCode="
				+ statusCode + "]";
	}
	
}

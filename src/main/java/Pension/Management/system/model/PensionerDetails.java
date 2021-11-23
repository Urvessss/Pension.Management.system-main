package Pension.Management.system.model;

public class PensionerDetails {

	private int age;
	private int aadhar;
	private int pancard;
	private String pensionType;
	public PensionerDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public PensionerDetails(int age, int aadhar, int pancard, String pensionType) {
		super();
		this.age = age;
		this.aadhar = aadhar;
		this.pancard = pancard;
		this.pensionType = pensionType;
	}

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAadhar() {
		return aadhar;
	}
	public void setAadhar(int aadhar) {
		this.aadhar = aadhar;
	}
	public int getPancard() {
		return pancard;
	}
	public void setPancard(int pancard) {
		this.pancard = pancard;
	}
	public String getPensionType() {
		return pensionType;
	}
	public void setPensionType(String pensionType) {
		this.pensionType = pensionType;
	}

	@Override
	public String toString() {
		return "PensionerDetails [age=" + age + ", aadhar=" + aadhar + ", pancard=" + pancard + ", pensionType="
				+ pensionType + "]";
	}
	
	
}

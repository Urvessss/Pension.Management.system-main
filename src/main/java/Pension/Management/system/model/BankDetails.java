package Pension.Management.system.model;

public class BankDetails extends PensionerDetails {

	private String bankName;
	private long accno;
	private String branch;
	private String IFSCCode;
	private String accHolderName;
	
	public BankDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public BankDetails(String bankName, long accno, String branch, String iFSCCode, String accHolderName) {
		super();
		this.bankName = bankName;
		this.accno = accno;
		this.branch = branch;
		IFSCCode = iFSCCode;
		this.accHolderName = accHolderName;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public long getAccno() {
		return accno;
	}

	public void setAccno(long accno) {
		this.accno = accno;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getIFSCCode() {
		return IFSCCode;
	}

	public void setIFSCCode(String iFSCCode) {
		IFSCCode = iFSCCode;
	}

	public String getAccHolderName() {
		return accHolderName;
	}

	public void setAccHolderName(String accHolderName) {
		this.accHolderName = accHolderName;
	}

	@Override
	public String toString() {
		return "BankDetails [bankName=" + bankName + ", accno=" + accno + ", branch=" + branch + ", IFSCCode="
				+ IFSCCode + ", accHolderName=" + accHolderName + "]";
	}
	
	
}

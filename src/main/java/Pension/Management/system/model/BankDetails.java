package Pension.Management.system.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;

import Pension.Management.repository.IBankRepository;
import javassist.SerialVersionUID;

@Entity
@Table(name ="bank_details")
public class BankDetails implements Serializable {
	

	private static final long serialVersionUID = -9165581216674129315L;
@Id
	 private String bankName;
@GeneratedValue(strategy = GenerationType.IDENTITY)
	 @NotNull
	 private Long accno;
	 @Column
	 private String branch;
	 @Column
	 private String ifscCode;
	 @Column
	 private String accHolderName;
//	 @OneToOne
//	 @JoinColumn(name="pensionerid")
//	 private Pensioner pensioner;
	 
	public BankDetails() {
		super();
	}

	public BankDetails(String bankName, Long accno, String branch, String ifscCode, String accHolderName,
			Pensioner pensioner) {
		super();
		this.bankName = bankName;
		this.accno = accno;
		this.branch = branch;
		this.ifscCode = ifscCode;
		this.accHolderName = accHolderName;
		//this.pensioner = pensioner;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public Long getAccno() {
		return accno;
	}

	public void setAccno(Long accno) {
		this.accno = accno;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getIfscCode() {
		return ifscCode;
	}

	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}

	public String getAccHolderName() {
		return accHolderName;
	}

	public void setAccHolderName(String accHolderName) {
		this.accHolderName = accHolderName;
	}

//	public Pensioner getPensionerDetails() {
//		return pensioner;
//	}
//
//	public void setPensionerDetails(Pensioner pensioner) {
//		this.pensioner = pensioner;
//	}

	@Override
	public String toString() {
		return "BankDetails [bankName=" + bankName + ", accno=" + accno + ", branch=" + branch + ", ifscCode="
				+ ifscCode + ", accHolderName=" + accHolderName +  "]";
	}
	
	
}
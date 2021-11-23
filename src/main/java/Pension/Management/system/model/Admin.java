package Pension.Management.system.model;

public class Admin extends AbstractUser{

	private int adminid;

	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Admin(int adminid) {
		super();
		this.adminid = adminid;
	}

	public int getAdminid() {
		return adminid;
	}

	public void setAdminid(int adminid) {
		this.adminid = adminid;
	}

	@Override
	public String toString() {
		return "Admin [adminid=" + adminid + "]";
	}
	
}

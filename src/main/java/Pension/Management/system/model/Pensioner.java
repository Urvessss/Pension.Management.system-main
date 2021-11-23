package Pension.Management.system.model;

public class Pensioner extends AbstractUser {

 private int	pensionerid;

public Pensioner() {
	super();
	// TODO Auto-generated constructor stub
}

public Pensioner(int pensionerid) {
	super();
	this.pensionerid = pensionerid;
}

public int getPensionerid() {
	return pensionerid;
}

public void setPensionerid(int pensionerid) {
	this.pensionerid = pensionerid;
}

@Override
public String toString() {
	return "Pensioner [pensionerid=" + pensionerid + "]";
}
 
}

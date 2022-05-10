package week1.day1;

public class Employeedetails {
public String printEmployeeName(String empName, int empID) {
	return empName;
}
public String getEmployeeAddress(String empAddress) {
	return empAddress;
}
public double printEmployeeMobileNumber(long mobNumber) {
	return mobNumber;
}
public static void main(String[] args) {
	Employeedetails ed=new Employeedetails();
	String Name=ed.printEmployeeName("Mani", "76656");
	System.out.println(Name);
	String Address=ed.getEmployeeAddress("chennai");
	System.out.println(Address);
	long MobileNumber=ed.printEmployeeMobileNumber("6564888554");
	System.out.println(MobNumber);
}
}

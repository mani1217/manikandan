package week4.day3;

public class Students {
public void getStudentInfo(int ID) {
	System.out.println("ID :"+ ID);
}
public void getStudentInf0(String name, int ID) {
	System.out.println("name:"+name+"ID:"+ID );
}
public void getStudentInfo(String email, long PhoneNumber) {
	System.out.println("email:"+email+"PhoneNumber:"+PhoneNumber);
}
public static void main(String[] args) {
	Students stu = new Students();
	stu.getStudentInf0("Jackdaniels", 9865);
	stu.getStudentInfo(348375);
	stu.getStudentInfo("jack@123.com", 8957857);
	
}
}

package week1.day2;

public class Twowheeler {
String bikeName="KTM";
char noofWheels='2';
short noofMirrors=2;
long chassisNumber=346238237;
double runningKm=989;
public static void main(String[] args) {
	Twowheeler obj=new Twowheeler();
	System.out.println("bikeName; "+obj.bikeName);
	System.out.println("chassisNumber "+obj.chassisNumber);
	System.out.println("noofWheels "+obj.noofWheels);
	System.out.println("runningKm "+obj.runningKm);
	System.out.println("noofMirrors "+obj.noofMirrors);
}
}

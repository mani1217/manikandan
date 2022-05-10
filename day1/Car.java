package week1.day1;

public class Car {
public void driveCar() {
	System.out.println("driveCar");
}
public void applyBreak() {
	System.out.println("applyBreak");
}
public void turnonAc() {
	System.out.println("turnonAc");
}
public static void main(String[] args) {
	Car car=new Car();
	car.applyBreak();
	car.turnonAc();
	car.driveCar();
}
}

package week1day5;

public class Amstrongnumber {
public static void main(String[] args) {
	int num = 153,reminder,total=0;
	int number=num;
	while (number>0) {
		reminder=number%10;
		total=total+reminder*reminder*reminder;
		number=number/10;
		
	}if (total==num) {
		System.out.println("it is amstrong number");
	}else {
		System.out.println("it is not amstrong number");
	}
	
	
}
}

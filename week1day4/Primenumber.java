package week1day4;

public class Primenumber {
public static void main(String[] args) {
	int input=13;
	int count=0;
	for (int i = 1; i <=13; i++) {
		if (input%i==0) {
			count++;
		}
		
	}if (count==2) {
		System.out.println("given number is a prime number");
	}else {
		System.out.println("given number is not a prime number");
	}
}
}

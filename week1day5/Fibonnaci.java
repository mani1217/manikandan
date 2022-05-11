package week1day5;

public class Fibonnaci {
public static void main(String[] args) {
	int range=8;
	int a=0;
	System.out.println(a);
	int b=1;
	System.out.println(b);
	int c=a+b;
	for (int i = 3; i < range; i++) {
		 c=a+b;
		System.out.println(c);
		a=b;
		b=c;
		
	}
}
}

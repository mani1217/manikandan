package week1day5;

public class Sumofdigits {
public static void main(String[] args) {
	int num = 654, reminder ,total = 0;
	int number = num;
	while (number>0) {
		reminder = number%10;
		total = total+reminder;
		number = number/10;
	System.out.println(total);
	
}
}
}
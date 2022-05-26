package week4.day3;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class MissingNumbers {
public static void main(String[] args) {
	int[] numbers = {4,6,7,2,3,1,9,10,8,8,6};
	Set<Integer> num = new TreeSet<Integer>();
	num.add(4);
	num.add(6);
	num.add(7);
	num.add(2);
	num.add(3);
	num.add(1);
	num.add(9);
	num.add(10);
	num.add(8);
	num.add(8);
	num.add(6);
	System.out.println(num);
	for (int i = 0; i < numbers.length; i++) {
		System.out.println(+i);
	}
}
}

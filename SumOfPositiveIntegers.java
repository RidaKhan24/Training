import java.io.*;
import java.util.*;
public class SumOfPositiveIntegers {

	public static void main(String[] args) {
		System.out.println("Enter a positive integer");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int sum = n*(n+1)/2;
		System.out.println("sum of integers from 1 to "+ n + " is: "+sum);

	}

}

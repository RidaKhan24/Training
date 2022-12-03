import java.io.*;
import java.util.*;
public class SumOfDigits {

	public static void main(String[] args) {
		System.out.println("Enter a 4 digit number");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int sum =0;
		while(n!=0) {
		int r = n%10;
		 sum = sum + r;
		 n = n/10;
	
	}
		 System.out.println("The sum of digits is " + sum);
	}

}

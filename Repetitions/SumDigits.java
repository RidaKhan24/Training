import java.io.*;
import java.util.*;
public class SumDigits {

	public static void main(String[] args) {
		System.out.println("enter a number");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int sum=0;
		while(num !=0) {
			int r = num%10;
			sum = sum + r;
			num = num/10;
			
			
		}
		System.out.println("the sum of digits " + sum);

	}

}

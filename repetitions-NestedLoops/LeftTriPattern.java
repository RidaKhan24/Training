import java.io.*;
import java.util.*;
public class LeftTriPattern {

	public static void main(String[] args) {
		System.out.println("enter n");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=1;j<2*(n-i);j++) {
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++) {
				System.out.print("* ");
			}
			System.out.println();
			
		}
		

	}

}

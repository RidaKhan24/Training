import java.io.*;
import java.util.*;
public class DownwardLeftTri {

	public static void main(String[] args) {
		System.out.println("enter n");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for(int i=n;i>0;i--) {
			for(int j=n; j>i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}

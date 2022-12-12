import java.io.*;
import java.util.*;
public class DownwardTri {

	public static void main(String[] args) {
		System.out.println("enter n");
		Scanner s = new Scanner(System.in);
		int n =s.nextInt();
		for(int i=n;i>0;i--) {
			for(int j=n-1;j>=n-i;j-- ) {
				System.out.print("*");
						
			}
			System.out.println();
		}

	}

}

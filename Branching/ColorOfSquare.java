import java.io.*;
import java.util.*;
public class ColorOfSquare {

	public static void main(String[] args) {
		System.out.println("enter input");
		Scanner s = new Scanner(System.in);
		String str = s.next();
		 char x = str.charAt(0);
		 int y = str.charAt(1);
		int asciValue = (int)x;
		
		if((98-asciValue)%2 !=0 && y%2 != 0) {
			System.out.println("Black");
		}
		else if((98-asciValue)%2 !=0 && y%2 == 0) {
			System.out.println("White");
		}
		else if((98-asciValue)%2 ==0 && y%2 != 0) {
			System.out.println("White");
		}
		else if((98-asciValue)%2 ==0 && y%2 == 0) {
			System.out.println("Black");
		}
		
		
		
		
		
		
		

	}

}

import java.io.*;
import java.util.*;
public class CheckPassword2 {
	public static boolean isUppper(char ch) {
		return ch>= 'A' && ch<='Z';
	}
	public static boolean isLower(char ch) {
		return ch>='a' && ch<='z';
		
	}
	public static boolean isDigit(int ch) {
		return ch>='0';
	}
	public static boolean checkPassword(String str) {
		boolean upper = false;
		for(int i = 0;i<str.length();i++) {
			if(isUppper(str.charAt(i)))
					upper=true;
		}
		boolean lower = false;
		for(int i =0;i<str.length();i++) {
			if(isLower(str.charAt(i)))
				lower = true;
		}
		boolean digit = false;
		for(int i =0;i<str.length();i++) {
			if(isDigit(str.charAt(i)))
				digit = true;
		}
	
			
			
			if(upper && lower && digit && str.length()>=8){
				
				return true;
				
				
				
			}
			
		
		return false;
		
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter password");
		String str = s.nextLine();
		System.out.println(checkPassword(str));

	}

}

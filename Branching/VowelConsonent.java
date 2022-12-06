import java.io.*;
import java.util.*;
public class VowelConsonent {

	public static void main(String[] args) {
		System.out.println("Enter a letter");
		Scanner s = new Scanner(System.in);
		char c = s.next().charAt(0);
		if(c == 'a' || c == 'e' || c== 'i' || c == 'o' || c == 'u') {
			System.out.println("The letter is vowel");
		}else if(c == 'y') {
				System.out.println("the letter is sometimes vowel and sometimes y is  consonent");
			}
			else {
				System.out.println("the letter is consonent");
				
			}
			
			
		}
		

	}



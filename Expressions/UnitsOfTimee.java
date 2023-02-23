import java.io.*;
import java.util.*;
public class UnitsOfTimee {

	public static void main(String[] args) {
		System.out.println("Enter number of seconds");
		Scanner s = new Scanner(System.in);
		int NumOfSeconds = s.nextInt();
		 int day = NumOfSeconds / (24 * 3600);
	      
	        NumOfSeconds = NumOfSeconds % (24 * 3600);
	        int hour = NumOfSeconds / 3600;
	      
	        NumOfSeconds %= 3600;
	        int minutes = NumOfSeconds / 60 ;
	      
	        NumOfSeconds %= 60;
	        int seconds = NumOfSeconds;
	        System.out.println(String.format("%2d",day)+":"+String.format("%2d",hour)+":"+String.format("%2d",minutes)+ ":"+String.format("%2d",seconds));
	        
		
		

	}

}

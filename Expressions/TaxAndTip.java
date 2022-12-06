import java.io.*;
import java.util.*;
public class TaxAndTip {

	public static void main(String[] args) {
		System.out.println("Enter the cost of the meal");
		Scanner s = new Scanner(System.in);
		float cost = s.nextFloat();
		double tax = 0.18*cost;
		double tip = 0.05*cost;
		System.out.printf("Tax amount is " + tax + "\n" + "Tip amount is " + tip + "\n" + "Grand total is " + "%.2f" + "\n", cost+tax+tip);

	}

}

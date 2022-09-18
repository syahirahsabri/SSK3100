//Authors name: NOOR SYAHIRAH BINTI MOHD SABRI
//Matric number: 207542
//Assignment number: 2

import java.io.IOException;
import java.util.Scanner;
public class MonthlyBill {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner scanner= new Scanner(System.in);
		
		//declare the variable
		double hours;
		double total = 0;
		
		//read input from user
		System.out.print("Enter your package: ");
		char letter= (char)System.in.read();
		System.out.print("Enter number of hours used: ");
		hours= scanner.nextDouble();
		
		//made a decision
		switch (letter) {
		case 'A': case 'a': total=9.95*hours;
		break;
		case 'B': case 'b': total= 13.95*hours;
		break;
		case 'C': case 'c': total=19.95*hours;
		break;
		default : System.out.print("WRONG PACKAGE");
		
		}
		//Display package and total charge
		System.out.print("Letter of package: "+letter);
		System.out.printf("\nTotal Charge per Month: %.2f", total);
		total= scanner.nextDouble();

	}

}

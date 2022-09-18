//Author's name: NOOR SYAHIRAH BINTI MOHD SABRI
//NO Matric: 207542
//Assignment Number: 1

import java.util.Scanner;
public class Final_Amount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		double amount ;
		double finalAmount;
		double discount;
	
		//read amount from user
		System.out.print("Enter the amount: ");
		amount=scanner.nextDouble();
		
		//made a decision and display the result
		if (amount<150) {
			discount=amount*0.05;
			finalAmount= amount-discount;
			System.out.println("The final amount is "+finalAmount);
		}
		else if ((amount>=150) && (amount<600)) {
			discount= amount*0.1;
			finalAmount= amount-discount;
			System.out.println("The final amount is "+finalAmount);
		}
		else {
			discount= amount*0.15;
			finalAmount= amount-discount;
			System.out.println("The final amount is "+finalAmount);
		}
	
		
	}

}

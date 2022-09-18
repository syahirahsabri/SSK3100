//NAME: NOOR SYAHIRAH BINTI MOHD SABRI
//MATRIC NUM: 207542
//ASSIGNMENT NUM: 2

import java.util.Scanner;
public class Telephone_Billing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int packaged,callTime;
		double amount;
		//method
		packaged=readTypeAcc(input);
		callTime=readCallTime(input);
		amount=calculateBill(callTime,packaged);
		printBill(callTime,packaged,amount);
	}//end main method
	
	private static int readTypeAcc(Scanner input) {//prompt user in packaged method
		// TODO Auto-generated method stub
		System.out.print("Choose your monthly packaged: ");
		int packaged=input.nextInt();
		return packaged;	
	}//end packaged method
	
	private static int readCallTime(Scanner input) {//prompt user in call time method
		// TODO Auto-generated method stub
		System.out.print("Enter the amount of call time (in minutes): ");
		int callTime=input.nextInt();
		return callTime;
	}//end call time method

	private static double calculateBill(int callTime, int packaged) {//calculate bill amount 
		// TODO Auto-generated method stub
		double amount = 0;
		//if statement for packaged
		if(packaged==1) { 
			if(callTime<=1000)
				amount=50.00;
			else 
				amount=180 +((callTime-1000)*0.35);
		}
		else if(packaged==2) {
			if(callTime<=1000)
				amount=0.18*callTime;
			else
				amount=180.0+((callTime-1000)*0.55);
		}
		else
			System.out.println("WRONG PACKAGED");
		return amount;
	}//end of calculateBill method

	private static void printBill(int callTime, int packaged, double amount) {//display method
		// TODO Auto-generated method stub
		System.out.println("\nYour monthly packaged type is "+packaged);
		System.out.println("Your amount of telephone usage (call time) in minutes is "+callTime+"min");
		System.out.printf("The total amount to be paid for this month is RM%.2f",amount);
	}//end of display method

	

}

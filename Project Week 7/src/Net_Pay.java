//NAME: NOOR SYAHIRAH BINTI MOHD SABRI
//NO MATRIK: 207542
//ASSIGNMENT NUM: 2

import java.util.Scanner;
public class Net_Pay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner= new Scanner(System.in);
		
		//read input from user
		System.out.print("Enter employee's name: ");
		String name= scanner.next();
		System.out.print("Enter number of hours worked/ week: ");
		int hours= scanner.nextInt();
		System.out.print("Enter hourly pay rate: ");
		double payRate= scanner.nextDouble();
		System.out.print("Enter federal text: ");
		double fedTax=scanner.nextDouble();
		System.out.print("Enter state tax rate: ");
		double stateTax= scanner.nextDouble();
		
		//calculate grosspay
		double grossPay= hours*payRate;
		
		//calculate total deductions
		double newfedTax= fedTax*grossPay;
		double newstateTax= stateTax*grossPay;
		double totalDeduc= newfedTax+newstateTax;
		
		//calculate netpay
		double netPay= grossPay-totalDeduc;
		
		//display output
		System.out.println(".....................");
		System.out.println("Employee Name: "+name);
		System.out.println("Hours worked: "+hours);
		System.out.println("Pay Rate: RM"+payRate);
		System.out.println("Gross Pay: RM"+grossPay);
		System.out.println("Deductions: ");
		System.out.println("\t Federal tax: \t	RM"+newfedTax);
		System.out.println("\t State tax: \t	RM"+newstateTax);
		System.out.println("\t Total Deductions: \tRM"+totalDeduc);
		System.out.printf("Net pay: RM%.2f",netPay);
	}

}

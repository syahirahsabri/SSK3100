//NAME: NOOR SYAHIRAH BINTI MOHD SABRI
//NO MATRIK:207542
//ASSIGNMENT NUM: 2

import java.util.Scanner.*;
import java.io.*;
import java.util.*;

public class Mowing_Service {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		//create file instance
		File file=new File("Mowers.txt");
		if(!file.exists())//check file exist
			System.out.println("File "+file+" not exists");
		
		//Create a file
		PrintWriter output=new PrintWriter(file);
		//Scanner object for input from user
		Scanner input=new Scanner(System.in);
		//declare
		int num;
		int accountnum = 0;
		String name = null;
		double feet = 0;
		double fee;
		double total=0;
		
		//Prompt user
		System.out.println("Press 1 to insert account. Press 2 to exit from the system. Press 3 to review account.");
		System.out.print("Answer: ");
		num=input.nextInt();
		
		//while loop
		while(num==1) {
			System.out.print("Enter your account number: ");
			accountnum=input.nextInt();
			System.out.print("Enter your name: ");
			name=input.next();
			System.out.print("Enter the lawn size in feet: ");
			feet=input.nextDouble();
			
			//if statement for feet
			if(feet<1000)
				fee=50.00;
			else
				fee=75.00;
			System.out.printf("The fee per feet is RM%.2f",fee);
			total=fee*feet;
			System.out.println("\nTotal (RM): "+total);
			System.out.println("\n");
			//prompt user again
			System.out.println("Press 1 to insert account. Press 2 to exit from the system. Press 3 to review account.");
			System.out.print("Answer: ");
			num=input.nextInt();
			output.printf("%-15d %-15s %.4f \t%.2f\t%.2f\n",accountnum,name,feet,fee,total);//output of printwriter in file
		}//end while
		output.close();
		//scanner object read from file
		Scanner scanner=new Scanner(file);
		//review account while loop
		int check;
		while(num==3) {
			System.out.print("Enter your account to review: ");
			check=input.nextInt();
				accountnum=scanner.nextInt();
				name=scanner.next();
				feet=scanner.nextDouble();
				fee=scanner.nextDouble();
				//if statement for account existence
				if(check==accountnum) {
				System.out.printf("\n%-15d %-15s %.4f \t%.2f\t%.2f\n",accountnum,name,feet,fee,total);
				System.out.println();
			}
				else
					System.out.println("Account does not exist");
			//prompt user again
				System.out.println("Press 1 to insert account. Press 2 to exit from the system. Press 3 to review account.");
			System.out.print("Answer: ");
			num=input.nextInt();	
		}//end while
			scanner.close();
	//end of the program
	System.out.println("Exit of the program");
		
	}
}
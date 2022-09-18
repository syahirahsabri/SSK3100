//NAME: NOOR SYAHIRAH BINTI MOHD SABRI
//MATRIC NUM: 207542
//ASSIGNMENT NUM: 1

import java.util.Scanner;
public class Distance_Converter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		double distance,kilometers,inches;
		int num;
		
		//selection for user
		System.out.println("Press 1 to convert into Kilometers.\nPress 2 to convert into Inches.\nPress 3 to Quit");
		num=input.nextInt();
		
		//while loop for selection
		while(num!=3) {
			//prompt user to enter distance
			
			if(num==1) {
				System.out.print("\nEnter a distance in meters: ");
				distance=input.nextDouble();
				System.out.printf(distance+"m in kilometers is  %.2f",showKilometers(distance));
				System.out.print("km");}
			else if(num==2) { 
				System.out.print("\nEnter a distance in meters: ");
				distance=input.nextDouble();
				System.out.printf(distance+"m in inches is %.2f",showInches(distance));
				System.out.print("inch");
			}
			else
				System.out.println("Invalid code. Please choose from the option.");//end if statement
			//selection for user
			System.out.println();
			System.out.println("\nPress 1 to convert into Kilometers.\nPress 2 to convert into Inches.\nPress 3 to Quit");
			num=input.nextInt();
		}//end while loop
		System.out.println("End of the program. Bye!");

	}//end main method

	//inches convert method
	private static double showInches(double distance) {
		// TODO Auto-generated method stub
		double inches= distance*39.37;
		return inches;
	}//end of inch method
	
	//kilometers convert method
	private static double showKilometers(double distance) {
		// TODO Auto-generated method stub
		double kilometer= distance*0.001;
		return kilometer;
	}//end of kilometers method

	

}

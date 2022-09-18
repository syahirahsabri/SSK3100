//Author's name: NOOR SYAHIRAH BINTI MOHD SABRI
//Matric Number: 207542
//Assignment Num: 2

import java.util.Scanner;

public class TotalMarks {
	static Scanner scanner = new Scanner(System.in);
	
	static float firstTest;
	static float secondTest;
	static float assignment1;
	static float assignment2;
	static float assignment3;
	static float total_assignment;
	static float finalExamination;
	static float total_mark;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Read input from the user
		System.out.print("Please enter the marks : \n" );
		System.out.print("First Test        : " + " 50/");
		firstTest = scanner.nextFloat();
		float percentfirstTest = firstTest/50 * 20; //calculate percentage of firstTest
		
		System.out.print("Second test       : " + " 50/");
		secondTest = scanner.nextFloat();
		float percentsecondTest = secondTest/50 *20; //calculate percentage of secondTest
		
		System.out.print("\n");
		System.out.print("Assignment 1      : "+ " 30/");
		assignment1 = scanner.nextFloat();
		System.out.print("Assignment 2      : "+" 30/");
		assignment2 = scanner.nextFloat();
		System.out.print("Assignment 3      : "+" 30/");
		assignment3 = scanner.nextFloat();
		float total_assignment = assignment1 + assignment2 + assignment3 ;
		float percentagetotal_assignment = total_assignment/90 * 30; //calculate total assignment percentage  
		
		System.out.print("\n");
		System.out.print("Final examination : "+"100/");
		finalExamination = scanner.nextFloat();
		float percentagefinalExamination = finalExamination/100 * 30; //calculate percentage final examination
		
		//calculate total marks
		float total_marks= percentfirstTest + percentsecondTest + percentagetotal_assignment + percentagefinalExamination;
		
		System.out.print("\n");
		System.out.print("     CALCULATE MARKS     ");
		System.out.print("\n___________________________\n");
		
		System.out.print("\nFIRST TEST        : " +percentfirstTest+ "%");
		System.out.print("\nSECOND TEST       : " +percentsecondTest+ "%");
		System.out.print("\nASSIGNMENT 1      : " +assignment1 );
		System.out.print("\nASSIGNMENT 2      : " +assignment2);
		System.out.print("\nASSIGNMENT 3      : " +assignment3);
		System.out.print("\nASSIGNMENT TOTAL  : " + percentagetotal_assignment+ "%");
		System.out.print("\nFINAL EXAMINATION : " +percentagefinalExamination+ "%");
		System.out.print("\n___________________________\n");
		System.out.print("\nTOTAL MARK        : " +total_marks+ "%");
		
	}

}

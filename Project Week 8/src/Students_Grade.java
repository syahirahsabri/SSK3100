//NAME: NOOR SYAHIRAH BINTI MOHD SABRI
//NO MATRIK: 207542
//ASSIGNMENT NUM: 1

import java.util.Scanner.*;
import java.io.*;
import java.util.*;
public class Students_Grade {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		String inputfile="C:\\Users\\User\\OneDrive\\Desktop\\SSK3100- PRORAMMING\\Project Week 8\\src\\StudentsData";
		String outputfile="C:\\Users\\User\\OneDrive\\Desktop\\SSK3100- PRORAMMING\\Project Week 8\\src\\StudentsGrade";
		
		//Create a file instance
		File fdata= new File(inputfile);
				if(!fdata.exists()) {//check the file exist
					System.out.println("File "+inputfile+" not exist");
					System.exit(0);
					}
		//Create output file
		File fgrade= new File(outputfile);
		if(!fgrade.exists()) {//check the file exixt
			System.out.println("File "+fgrade+" not exist.");
		System.exit(0);
		}
		
		//Create scanner to read input
		Scanner input= new Scanner(fdata);
		//Create printWritter for output data
		PrintWriter output=new PrintWriter(fgrade);
		
		//Read data from a file
		while(input.hasNext()) {
			String name=input.next();
			int mark1=input.nextInt();
			int mark2=input.nextInt();
			int mark3=input.nextInt();
			int mark4=input.nextInt();
			int mark5=input.nextInt();
	
			//calculate average marks
			double average= (mark1+mark2+mark3+mark4+mark5)/5;
			//determine grade
			char grade;
			//if statement for grade
			if(average>=90)
				grade='A';
			else if(average>=80 && average<90)
				grade='B';
			else if(average>=70 && average<80)
				grade='C';
			else if(average>=60 && average<70)
				grade='D';
			else
				grade='F';
		
		//write output file
		output.printf("%-15s %.2f %3c\n",name,average,grade);
	

	}//end while
		input.close();
		output.close();

}
}

//NAME: NOOR SYAHIRAH BINTI MOHD SABRI
//NO MATRIC: 207542
//ASSIGNMENT NUM: LAB 12(QUEST 1)

import java.util.Scanner;
public class Average_Diogonal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//declare an array
		double[][] m= new double[4][4];
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a 4 by-4 matrix row by row: ");
		
		//prompt input from user
		for(int i=0;i<m.length;i++) {
			for(int j=0;j<m[0].length;j++) {
				m[i][j]=input.nextDouble();
				
			}
		}//end of for loop
		//display the average
		System.out.println("The average of the elements in diagonal major is "+averageMajorDiagonal(m));
	}//end of main method
	
	//create method calculate average
	private static double averageMajorDiagonal(double[][] m) {
		// TODO Auto-generated method stub
		double average;
		double sum=0;
		for(int i=0;i<m.length;i++) {
			sum+=m[i][i];
		}
		average=sum/m.length;
		return average;
	}//end of calculate average method

}

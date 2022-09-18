//Authors name: NOOR SYAHIRAH BINTI MOHD SABRI
//Matrci number: 207542
//Assignment number: 2

import java.util.Scanner;
public class Roots_Equation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a;
		double b;
		double c;
		double root1;
		double root2;
		Scanner scanner = new Scanner(System.in);
		
		//read input from user
		System.out.print("Enter a: ");
		a = scanner.nextDouble();
		System.out.print("Enter b: ");
		b = scanner.nextDouble();
		System.out.print("Enter c: ");
		c= scanner.nextDouble();
		
		//calculate discriminant
		double discriminant = b*b - 4*a*c;
		
		//made a decision
		if (discriminant>0) {
			root1 = (-b +Math.pow(discriminant, 0.5))/(2*a);
			root2 = (-b -Math.pow(discriminant, 0.5))/(2*a);
			System.out.print("The equation has 2 roots");
			System.out.print("\n________________________\n");
			System.out.printf("\nRoot 1= %.2f", root1);
			System.out.printf("\nRoot 2= %.2f", root2);
		}
		else if (discriminant==0) {
			root1 = (-b +Math.pow(discriminant, 0.5))/(2*a);
			System.out.print("The equation has 1 root");
			System.out.print("\n________________________\n");
			System.out.printf("\nRoot= %.2f",root1);
		}
		else
			System.out.println("The equation has no root");
			
	
	}

	}



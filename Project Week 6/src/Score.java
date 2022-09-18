//NAME: NOOR SYAHIRAH BINTI MOHD SABRI
//MATRIC NUM: 207542
//ASIIGNMENT NUM: 2

import java.util.Scanner;
public class Score {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		
		//read input from user
		System.out.print("Enter your score: ");
		int score=scanner.nextInt();
		//run while looping where score!=1
		while(score!=-1) {
			if(score>=65) 
				System.out.println("You pass the exam");
			else
				System.out.println("You don't pass the score");//end if
			System.out.print("\nEnter your score: " );//read input from user again
			score=scanner.nextInt();
		}
		//end while
		System.out.println("End of the program");
				
			
		

	}

}

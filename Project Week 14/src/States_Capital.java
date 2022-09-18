//NAME: NOOR SYAHIRAH BINTI MOHD SABRI
//NO MATRIK: 207542
//ASSIGNMENT NUM: LAB 14 (1)

import java.util.Scanner;
public class States_Capital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create an 2-Dimensional array
		String[][] statesCapital = {	{"Kedah","Alor Setar"},{"Perlis","Kangar"},
										{"Pulau Pinang","Georgetown"},{"Perak","Ipoh"},
										{"Selangor","Shah Alam"},{"Negeri Sembilan","Seremban"},
										{"Melaka","Bandar Melaka"},{"Johor","Johor Bahru"},
										{"Pahang","Kuantan"},{"Terengganu","Kuala Terengganu"},
										{"Kelantan","Kota Bharu"},{"Sarawak","Kuching"},
										{"Sabah","Kota Kinabalu"}	};
		
		int correctAnswer= answerCapital(statesCapital); 
		
		//display correct answer
		System.out.println("The total of correct answer is "+correctAnswer+"/13");					
	}//end of main method
	//create a method that receives answers from user
	private static int answerCapital(String[][] statesCapital) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int count = 0;
		
		for (int i = 0; i<statesCapital.length; i++) {
			
			//prompt user 
			System.out.print("What is the capital of "+statesCapital[i][0]+"?\t\t");
			String answer = input.nextLine();
			
			//selection for correct answer
			if (answer.equalsIgnoreCase(statesCapital[i][1])) {
				System.out.println("Your answer is correct!");
				count++;
			}
			else
				System.out.println("WRONG! The correct answer is "+statesCapital[i][1]);
				
			System.out.println();
		}//end of for loop
		return count;//return total number of correct answer
	}//end of answerCapital method

}

//NAME: NOOR SYAHIRAH BINTI MOHD SABRI
//MATRIC NUM: 207542
//ASSIGNMENT NUM: LAB 11 (QUEST 1)


import java.util.Scanner;
public class DriveTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		//declare the variable
		char answer;
		int rightAnswer, wrongAnswer;
		boolean result;
		
		//array correct answer
		char[] correctAnswer= {'B','D','A', 'A', 'C', 'A', 'B', 'A', 'C', 'D', 'B', 'C', 'D','A','D','C','C','B','D','A'};
		//array user answer
		char[] userAnswer=new char[correctAnswer.length];
		
		//prompt user answer
		System.out.println("Driver's license exam");
		System.out.println("Enter you answer below: \n(Only accept fot A/B/C/D)");
		for(int i=0;i<20;i++) {
			do {
				System.out.print((i+1)+" ");
				userAnswer[i]=Character.toUpperCase(scan.next().charAt(0));	
				i++;
			}while(i<20);//end of do while loop
				
		}//end for loop
	
		//invoke method
		rightAnswer=totalCorrect(correctAnswer, userAnswer);
		wrongAnswer=totalIncorrect(correctAnswer, userAnswer);
		result=passed(rightAnswer);
		int[] missQuest=questionMissed(correctAnswer, userAnswer);
		println(result,rightAnswer,wrongAnswer,missQuest);
	}
	
//create println method to display
	private static void println(boolean result, int rightAnswer, int wrongAnswer, int[] missQuest) {
		// TODO Auto-generated method stub
		System.out.println();
		
		//print pass or fail
		if(result==true)
			System.out.println("You have passed the exam");
		else
			System.out.println("You have failed the exam");
		
		System.out.println("Total number of correct answers = "+rightAnswer);//print total correct answer
		System.out.println("Total number of incorrect answers = "+wrongAnswer);//print total incorrect answer
		System.out.print("The question number that missed: No.");//print question number that missed
		for(int i=0;i<missQuest.length;i++) {
			System.out.print(missQuest[i]+" ");
		}
		
	}
	
	//create boolean method to determine pass or fail
	private static boolean passed(int rightAnswer) {
		// TODO Auto-generated method stub
		if(rightAnswer>=15)
		return true;
		else
		return false;
	}
	//create question missed method
	private static int[] questionMissed(char[] correctAnswer, char[] userAnswer) {
		// TODO Auto-generated method stub
		int count=0;
		for(int i=0; i<userAnswer.length; i++) {
			if(userAnswer[i]== '0') 
				count++;
			}
			int[] missQuest=new int[count];
			int n=0;
			for(int i=0; i<userAnswer.length;i++) {
				if(userAnswer[i]=='0') {
					missQuest[n]=i+1;
					n++;
			}	
			}
			return missQuest;
		}
		
//create total incorrect answer method
	public static int totalIncorrect(char[] correctAnswer, char[] userAnswer) {
		// TODO Auto-generated method stub
		int incorrectnum=0;
		for(int i=0;i<userAnswer.length;i++) {
			if(userAnswer[i]!=correctAnswer[i])
				incorrectnum++;
		}
		return incorrectnum;
	}
//create total correct answer
	public static int totalCorrect(char[] correctAnswer, char[] userAnswer) {
		// TODO Auto-generated method stub
		int correctnum=0;
		for(int i=0;i<correctAnswer.length;i++) {
			if(userAnswer[i]==correctAnswer[i])
				correctnum++;		
	}
		return correctnum;
	}
	
	}

	




//NAME: NOOR SYAHIRAH BINTI MOHD SABRI
//MATRIC NUM: 207542
//ASSIGNMENT NUM: LAB 13 (2)

import java.util.Scanner;
public class Password_Length {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String password;
		boolean hasUpperCase;
		boolean hasLowerCase;
		boolean hasDigits;
		
		Scanner input=new Scanner(System.in);
		System.out.println("* * * IMPORTANT! * * *");
		System.out.println("This program accept password that: "
				+ "\n-The password must contain at least 6 characters "
				+ "\n-The password should at least one uppercase and at least one lowercase letter. "
				+ "\n-The password should have at least one digit.");
		
		System.out.print("\nEnter your username: ");
		String username=input.nextLine();
		System.out.print("Enter your password: ");
		password=input.nextLine();
		
		if (isValid(password))
			System.out.println("\nValid password.");
		else
			System.out.println("\nInvalid password.");
}


	private static boolean isValid(String password) {
		// TODO Auto-generated method stub
		boolean status;
		if (isLongerThenSix(password) && hasUpperCase(password) && hasLowerCase(password) && hasDigit(password))
			status = true;
			else
			status = false;
			return status;
		
	}

	private static boolean hasDigit(String password) {
		// TODO Auto-generated method stub
		boolean status=false;
		for (int i=0; i<password.length(); i++) {
			if (Character.isDigit(password.charAt(i)))
				status=true;
		}
		return status;
	}

	private static boolean hasLowerCase(String password) {
		// TODO Auto-generated method stub
		boolean status=false;
		for (int i=0; i<password.length(); i++) {
			if(Character.isLowerCase(password.charAt(i)))
				status=true;
		}
		return status;
	}

	private static boolean hasUpperCase(String password) {
		// TODO Auto-generated method stub
		boolean status=false;
		for (int i=0; i<password.length();i++) {
			if(Character.isUpperCase(password.charAt(i)))
				status= true;
			
		}
		return status;
	}

	private static boolean isLongerThenSix(String password) {
		// TODO Auto-generated method stub
		if(password.length()>=6)
		return true;
		else
			return false;
	}

	

}

//NAME: NOOR SYAHIRAH BINTI MOHD SABRI
//MATRIC NUMBER: 207542
//ASSIGNMENT NUMBER: 1
import java.util.Scanner;
public class MajorAndStatus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
				
		//prompt user
		System.out.print("Enter characters (I,C or A) & (1,2,3,4): ");
		String ch=input.next();
		char major =Character.toUpperCase(ch.charAt(0));
		char status = ch.charAt(1);
		//while loop		
				while((major=='I'||major=='C'||major=='A')&&(status=='1'||status=='2'||status=='3'||status=='4')) {
					if(major=='I')//selection if else major
						System.out.print("Information System");
					else if(major=='C')
						System.out.print("Computer System");
					else if(major=='A')
						System.out.print("Accounting");
					
							
					if(status=='1')//selection if else status
						System.out.print(" Freshman");
					else if(status=='2')
						System.out.print(" Sophomore");
					else if(status=='3')
						System.out.print(" Junior");
					else if(status=='4')
						System.out.print(" Senior");
				
							
					System.out.print("\nEnter characters: ");
					ch=input.next();
					major =Character.toUpperCase(ch.charAt(0));
					status = ch.charAt(1);
			}
					System.out.println("Invalid Code");
					}
				}

	



//NAME: NOOR SYAHIRAH BINTI MOHD SABRI
//MATRIC NUM: 207542
//ASSIGNMENT NUM: 1

public class Inch_Converter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=1;
			System.out.println("Inches \tCentimetres | Centimetres\tInches");
		
		//run while loop
		while(num<=10) {
			double cm=num*2.54;
			double inch= num*0.3937;
			System.out.println(num+ "\t" +cm+"\t    |  "+num+"         \t" +inch);
			num++;
		}
		

	}

}

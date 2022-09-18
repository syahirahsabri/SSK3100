//NAME: NOOR SYAHIRAH BINTI MOHD SABRI
//MATRIC NUM: 207542
//ASSIGNMENT NUM:1

public class Price_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double sum=0;
		double average;
		double myPrice[]=new double[20];
		
		System.out.println("The list of price are: ");
		for(int i=0;i<20;i++) {//start for loop
			myPrice[i]=Math.random()*10;
			System.out.print(i+1+".");
			System.out.printf("\t$%.2f ",myPrice[i]);
			System.out.println();
			sum+=myPrice[i];
		}//end for loop for price list
		
		System.out.printf("\nThe sum of all the price is $%.2f ",sum);//display sum
		
		//calculate average
		average=sum/20;
		System.out.printf("\nThe average for the prices is $%.2f",average);
		
		System.out.println("\n\nThe price that higher than average are: ");
		//for loops for price that higher than average
		for(int i=0; i<20; i++) {
			if(myPrice[i]>average) 
				System.out.printf("\n%d. \t$%.2f",i+1,myPrice[i]);
		}//end of for loops
		
		System.out.println("\n\nThe price that less than $5.0 are: ");
		//for loops for price that less than $5.0
		for(int i=0; i<20; i++) {
			if(myPrice[i]<5.0)
				System.out.printf("\n%d. \t$%.2f",i+1,myPrice[i]);
		}//end of for loops for price less than $5.0
		
	}

}

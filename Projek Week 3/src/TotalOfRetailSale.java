//Author's name: NOOR SYAHIRAH BINTI MOHD SABRI
//Matric Number: 207542
//Assignment Num: 1 (b)

public class TotalOfRetailSale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//enter retail price of the item:
		double retailPrice = 150.00;
		
		//enter sales tax rate
		double salesTaxRate = 7.5/100;
		
		//calculate sale tax
		double saleTax = retailPrice*salesTaxRate;
		
		//calculate total sale
		double totalSale = saleTax+retailPrice;
		
		//display retail price, sale tax and total sale
		System.out.println("Retail price = " + retailPrice);
		System.out.println();
		System.out.println("Sale tax = " + saleTax);
		System.out.println();
		System.out.println("Total sale is " +totalSale);

	}

}

//NAME: NOOR SYAHIRAH BINTI MOHD SABRI
//NO MATRIC: 207542
//ASSIGNMENT NUM: LAB 12 (QUEST 2)

public class Employee_WeeklyHours {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create array hours
		int[][] hours= {{2,4,3,4,5,8,8},{7,3,4,3,3,4,4},{3,3,4,3,3,2,2},{9,3,4,7,3,4,1},
				{3,5,4,3,6,3,8},{3,4,4,6,3,4,4},{3,7,4,8,3,8,4},{6,3,5,9,2,7,9}};
		
		//assign method to array
		int[] totalHours= calculateTotalHours(hours);
		//create index employee list
		int[] indexEmployeesList= new int[totalHours.length];
		sortingTotalHours(totalHours, indexEmployeesList);
		
		//display 
		System.out.println("List of employees' work hours in ascending order: \n");
		for(int i= 0; i<totalHours.length; i++) {
		System.out.printf("Employee %s work %d hours in a week\n" ,indexEmployeesList[i],totalHours[i]);
		}
		
}//end of main method
	
	//method of sorting minimum index in ascending order
	private static void sortingTotalHours(int[] totalHours, int[] indexEmployeesList) {
		// TODO Auto-generated method stub
		int minHours=0;
		int indexMinHours=0;
		
		//for loop index employee list
		for(int i=0; i<totalHours.length;i++) {
			indexEmployeesList[i]=i;
		}//end loop
		
		for(int i=0;i<totalHours.length;i++) {//for loop minimum Hours
			minHours=totalHours[i];
			indexMinHours=i;
			
			for(int j=i+1;j<totalHours.length;j++) {
				if(minHours>totalHours[j]) {
					minHours=totalHours[j];
					indexMinHours=j;	
				}
			}
			
			//swap the total hours
			if(indexMinHours!=i) {
				totalHours[indexMinHours]=totalHours[i];
				totalHours[i]=minHours;
				
				//swap for index of employees
				int temp=indexEmployeesList[indexMinHours];
				indexEmployeesList[indexMinHours]=indexEmployeesList[i];
				indexEmployeesList[i]=temp;
			}//end of if swap
		}//end of loop minimum Hours
	}//end of method
	
	//method calculate total hours
	private static int[] calculateTotalHours(int[][] hours) {
		// TODO Auto-generated method stub
		int[] totalHours=new int[hours.length];
		for(int i=0;i<hours.length;i++) {
			int sum=0;
			for(int j=0; j<hours[i].length;j++) {
				sum= sum+hours[i][j];
		}
		 totalHours[i]=sum;	
		}
		return totalHours;
	}//end of method calculate total hours
}
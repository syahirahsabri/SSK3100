//NAME: NOOR SYAHIRAH BINTI MOHD SABRI
//MATRIC NUM: 207542
//ASSIGNMENT NUM: LAB 13 (1)

import java.util.Scanner;
public class Vowels_Count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		
		System.out.print("Enter a string = ");
		String word= input.nextLine().toLowerCase();
		int[] indexVowel=new int[7];
		int[] totalVowel= countVowel(word,indexVowel);
		System.out.println("\nThe total vowel is "+totalVowel[6]);
		System.out.println("a: "+totalVowel[0]);
		System.out.println("e: "+totalVowel[1]);
		System.out.println("i: "+totalVowel[2]);
		System.out.println("o: "+totalVowel[3]);
		System.out.println("u: "+totalVowel[4]);
		System.out.println("others: "+totalVowel[5]);
	}

	private static int[] countVowel(String word, int[] indexVowel) {
		// TODO Auto-generated method stub
		int a=0,e=0,i=0,o=0,u=0,other=0;
		int vowel=0;
		for(int j=0; j<word.length();j++) {
			if (word.charAt(j) == 'a' || word.charAt(j) == 'e' || word.charAt(j) == 'i' || word.charAt(j) == 'o' || word.charAt(j) == 'u') {
                vowel++; 
			if(word.charAt(i)=='a')
				a++;
			if(word.charAt(j)=='e')
				e++;
			if(word.charAt(j)=='i')
				i++;
			if(word.charAt(j)=='o')
				o++;
			if(word.charAt(j)=='u')
				u++;
			}
			else if(word.charAt(j) != 'a' || word.charAt(j) != 'e' || word.charAt(j) != 'i' || word.charAt(j) != 'o' || word.charAt(j) != 'u')
				other++;
		
		}
		indexVowel[0]= a;
		indexVowel[1]= e;
		indexVowel[2]= i;
		indexVowel[3]= o;
		indexVowel[4]= u;
		indexVowel[5]= other;
		indexVowel[6]= vowel;
		return indexVowel;
	}
}
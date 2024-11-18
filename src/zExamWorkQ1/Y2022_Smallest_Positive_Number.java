package zExamWorkQ1;

public class Y2022_Smallest_Positive_Number {
	public static void main(String[] args) {
		int min = 1;
		int max = 20;
		boolean numFound = false;
		int counter = max-1;
		while(!numFound) {
			counter++;
			numFound=true;
			for(int i = min; i<=max; i++) {
				if(counter%i != 0) {
					numFound = false;
				}
			}
		}
		
		System.out.println(counter);
	}
}

/*
 * 
2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder. 
Write a Java program that outputs the smallest positive number that is evenly divisible by all of the numbers from 1 to 20. 
Include comments that explain your code clearly
 * 
 * 
 * 
 * 
 */

package zExamWorkQ2;

public class Y2023_Prime_Nth {
	public static void main(String[] args) {
		boolean[] sieve = new boolean[1000];
		int n = 4;
		int counter = 0;
		fillSieve(sieve);
		// the nth prime number , so each time the value is true, add to a counter
		for(int i = 0; i < 1000 ; i++) {
			if(sieve[i]==true) {
				counter++;
			}
			if(counter==n) {
				System.out.println(i);
				break;
			}
		}
	}
	
	
	public static void fillSieve(boolean sieve[]) {
		
		for (int i = 0; i < sieve.length; i++) {
			sieve[i] = true;
		}
		sieve[0] = false;
		sieve[1] = false;
		for (int i = 2; i < sieve.length-1; i++) {
			for (int j = i+1; j < sieve.length; j++) {
				if(j%i==0) {
					sieve[j] = false;
				}
			}
		}
	}
}



/*
Write a Java program which takes in an int x and prints out the xth
prime number. A prime number is a number which is divisible only
by itself and 1 (e.g. 2, 3, 5, 7 etc.)
Sample input
4
Sample output
7
*/
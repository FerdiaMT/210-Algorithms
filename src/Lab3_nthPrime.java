import java.util.Scanner;
public class Lab3_nthPrime {

	
	public static void nthPrimeSieve() {
	
		int nLimit = 12000;
		int firstNumber=0;
		boolean[] sieve = new boolean[nLimit];
		sieve[0]=false;
		sieve[1]=false;
		for(int i = 2; i < sieve.length; i++) {
			sieve[i]=true;
		}
		for(int i = 2; i < sieve.length;i++) { // goes from 2 to index 12, so number 11
		
			for(int j = i+1; j < sieve.length; j++) {

				if(j%i ==0) {
					sieve[j]=false;
				}
			}
		}
	
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
	
	
		int counter = 0;
		int nthPrime = 0;
		for(int i=2; i < sieve.length;i++) {
			if(sieve[i]) {
				counter++;
			if(counter == input) {
				nthPrime = i;
				System.out.println(nthPrime);
			}
		}
	}
	
		int counter2 = 0;
	
		for(int j=2; j < sieve.length;j++) {
			if(sieve[j]==true){
				counter2++;
			if(counter2 == nthPrime) {
				System.out.println(j);
			}
		}
	}
	System.out.println("a");
	}
	
	public static void lab3Main() {
		nthPrimeSieve();
	}
	
//	public static void main(String args[]) {
//		nthPrimeSieve();
//	}
}	

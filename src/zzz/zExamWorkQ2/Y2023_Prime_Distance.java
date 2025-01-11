package zExamWorkQ2;

public class Y2023_Prime_Distance {
	 public static void main(String[] args) {
		 
		boolean[] primeSieve = new boolean[1000];
		createSieve(primeSieve);
		//it takes in int x and prints the distance from x to its nearest prime number
		int x = 121;
		int distance = Integer.MAX_VALUE;
		if(primeSieve[x]==true) {
			distance = 0;
		}else {
			for (int i = 0; i < primeSieve.length; i++) {
				if(primeSieve[i]==true) {
					//find the distance from x to it 
					int dist = x-i;
					if(x-i <0) {
						dist*=-1;
					}
					distance = Math.min(distance, dist);
				}
			}
		}
		
		System.out.println(distance);
	}
	 
	 public static void createSieve(boolean[] primeSieve) {
		 primeSieve[0]=false;
		 primeSieve[1]=false;
		 
		 for (int i =2; i < primeSieve.length; i++) {
			primeSieve[i]=true;
		}
		 for(int i = 2; i < primeSieve.length-1;i++) {
			 for(int j = i+1 ; j < primeSieve.length;j++) {
				 if(j%i==0) {
					 primeSieve[j]=false;
				 }
			 }
		 }
//		 
//		 for (int i = 0; i < primeSieve.length; i++) {
//			System.out.println(primeSieve[i]+ "  "+ i);
//		}
	 }
}

/*
Write a Java program which takes in an int x and prints out the
distance from x to the nearest prime number. A prime number is
a number which is divisible only by itself and 1 (e.g. 2, 3, 5, 7
etc.) If x is a prime, then the output should be 0.
Sample input
24
Sample output
1 */

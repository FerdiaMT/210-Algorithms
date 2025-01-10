package _AlgorithmsFolder.scrapWork;

public class Scrap6 {
	public static void main(String[] args) {
		
//		
//		Write a Java method that takes in three integers and returns true
//		or false depending on whether they are adjacent primes or not.
//		Three prime numbers are said to be adjacent primes if there is
//		no prime number between them. For example, 2, 3 and 5 are
//		adjacent primes. However, 11, 13 and 19 are not adjacent
//		primes, as there exists a prime between 13 and 19, namely 17.
		int size = 100;
		boolean arr[] = new boolean[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=true;
		}
		arr[0]=false;
		arr[1]=false;
		
		for(int i = 2 ; i < arr.length;i++) {
			for(int j = i+1; j < arr.length;j++) {
				if(j%i==0) {
					arr[j]=false;
				}
			}
		}
		
		int a = 2;
		int b = 3;
		int c =5;
		
		//first check if all 3 are primes in the first place
		if(!arr[a]||!arr[b]||!arr[c]) {
			System.out.println("One of these is not a prime");
		}else {
			int j = a+1;
			while(arr[j]==false  && j<size ) {
				j++;
			}//breaks when j index is true
			if(j!=b) {
				System.out.println("false A");
			}else {
				j++;
				while(arr[j]==false  && j<size ) {
					j++;
				}//breaks when j index is true
				if(j!=c) {
					System.out.println("false B");
				}else {
					System.out.println("True");
				}
			}
		}
		
		
//		for(int i = 0 ; i < arr.length; i++) {
//			System.out.println(i+" "+arr[i]);
//		}
		
		//AbcdEfGHijKLmnoP
		
		
		
		
	}
}

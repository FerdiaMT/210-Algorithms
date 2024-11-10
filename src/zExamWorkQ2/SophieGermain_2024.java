package zExamWorkQ2;

import java.util.Iterator;
import java.util.Scanner;

public class SophieGermain_2024 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x,y;
		//x = sc.nextInt();
		//y= sc.nextInt();
		
		x = 2;
		y = 1000;
		
		sophieGermain(x,y);
		
	}
	
	public static void sophieGermain(int x , int y) {
		
		//so first thing were gonna do is create the prime number sieve;
		//realistically , the upper range will be y*2+1
		boolean[] primeSieve = new boolean[y*20];
		fillSieve(primeSieve);
		
		
		for (int i = x; i <= y; i++) {
			if(primeSieve[i]==true && primeSieve[(i*2) + 1]==true ) {
				System.out.println(i+ " is a Sophie Germain Prime");
				
				
				
			}
		}
	}
	
	public static void fillSieve(boolean[] primeSieve) {
		primeSieve[0] = false;
		primeSieve[1] = false;
		for(int i = 2; i < primeSieve.length; i++) { // set them all to true
			primeSieve[i]=true;
		}
		
		
		for(int i = 2; i <primeSieve.length; i++) {
			for(int j = i + 1; j < primeSieve.length; j++) {
				if(j%i == 0) {
					primeSieve[j]=false;
				}
			}
		}
		
		
	}
}



/*
Write a Java method that takes in two integers that specify a
range and outputs the sum of Sophie Germain prime numbers
that exist in that range, inclusive of the specified boundaries.
A prime number p is called a Sophie Germain prime number if
2p+1 is also a prime number. For example, 11 is a prime
number and 11*2 + 1 = 23 is also a prime number, so 11 is a
Sophie Germain prime. The first few Sophie Germain prime
numbers are 2, 3, 5, 11, 23, 29, 41, 53, 83, 89, 113, 131, 173,
179…
*/
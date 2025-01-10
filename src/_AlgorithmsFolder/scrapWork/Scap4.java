package _AlgorithmsFolder.scrapWork;

import java.util.Scanner;

public class Scap4 {
	public static void main(String[] args) {
	//make a prime sieve
		Scanner sc = new Scanner(System.in);
		int x =sc.nextInt();
		
		//primesieve
		boolean arr[] = new boolean[10000];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = true;
		}
		arr[0] = false;
		arr[1] = false;
		
		for(int i = 2 ; i < arr.length;i++) {
			for(int j = i+1; j< arr.length; j++) {
				if(j%i==0) {
					arr[j]=false;
				}
			}
		}
		
		int distance = Integer.MAX_VALUE;
		if(arr[x]==true) {
			distance = 0;
		}else {
			for(int i = 0 ; i < x*2;i++) {
				if(arr[i]==true) {
					if(Math.abs(x-i)<distance) {
						distance = Math.abs(x-i);
					}
				}
			}
		}
		
		System.out.println(distance);
		
		
	}
}

<<<<<<< HEAD
package _AlgorithmsFolder.scrapWork;

public class Scrap5 {
	public static void main(String[] args) {
		int arr[] = {3,2,1,4,6,5,7,9,8,0}; // 0 to 9 array
		
	
		int currentIndex = 0;
		for(int i = 0 ; i < arr.length;i++) {
			for(int j = i+1; j< arr.length-i-1; j++) {
				if(arr[j]< arr[currentIndex]) {
					currentIndex=j;
				}
			}
			//swap arr j and current index
			int temp = arr[i];
			arr[i] = arr[currentIndex];
			arr[currentIndex] = temp;
		}
		
		for(int i = 0 ; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}
}
=======
package _AlgorithmsFolder.scrapWork;
import java.util.Random;
public class Scrap5 {
	public static void main(String[] args) {
		
		float count = 1000;
		float hits =0;
		for(int i = 0 ; i < count ; i++) {
			hits+= monteCarloRoll();
		}
		
		System.out.println(hits);
		
		float ans = hits/count;
		System.out.println(ans);
		
		
		
	}
	
	public static float monteCarloRoll() {
		Random rnd = new Random();
		int a = rnd.nextInt(0,100);
		int b = rnd.nextInt(0,100);
		if(a<0) a*= -1;
		if(b<0) b*= -1;
		if(coPrime(a,b)) {
			//System.out.println("coPrime");
			return 1;
		}
		
		return 0;
		
	}
	
	public static boolean coPrime(int a, int b) {
		//find the smaller of the 2, and do a for loop from 2 until smallest-1 to find any factors
		int upTo = 0;
		if(a>b) {
			upTo =b;
		}else {
			upTo=a;
		}
		
		for(int i = 2; i<upTo ; i++) {
			if(a%i==0) {
				if(b%i==0) {
					System.out.println("dfsdf");
					return false;
				}
			}
		}
		
		return true;
	}
}

//Write a Java program that uses a Monte Carlo simulation to
//calculate the probability that two randomly selected numbers are
//coprime.
//Two integers are said to be coprime if the only positive integer
//that divides both of them is 1. For example, 12 and 49 are
//coprime, because the only positive integer that divides evenly
//into both of them is 1. In contrast, 12 and 21 are not coprime,
//because 3 divides into both of them.
//Include comments which explain your code clearly
>>>>>>> branch 'master' of https://github.com/FerdiaMT/210-Algorithms

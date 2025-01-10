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
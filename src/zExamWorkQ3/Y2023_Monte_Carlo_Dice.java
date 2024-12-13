package zExamWorkQ3;
import java.util.Random;
public class Y2023_Monte_Carlo_Dice {
	public static void main(String[] args) {

		//System.out.println(random.nextInt(3)); // remember the int in here is the limit, so the value cant be 3
		int limit = 10;
		int allRolls = 0;
//		for(int i = 0; i <limit; i++) {
//			allRolls += rollAllDie();
//		}
		
		System.out.println(rollAllDie());
		
		System.out.println(allRolls / limit);
		System.out.println("A");
	}
	
	public static int rollAllDie(){
		Random random = new Random();
		int uniqueNumbers = 0;
		boolean[] seenNumbers = new boolean[6];
		int rolls = 0;
		while(uniqueNumbers!=6) {
			int roll = random.nextInt(5)+1;
			rolls++;
			
			if(seenNumbers[roll-1] == false) {
				seenNumbers[roll-1] =true;
				uniqueNumbers++;
			}
		}
		return rolls;
	}
}

/*
Write a Java program which uses a Monte Carlo simulation to
compute the average number of rolls of a dice that are needed
to see all 6 numbers come up (i.e. 1, 2, 3, 4, 5, 6).

*/
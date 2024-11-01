import java.util.Scanner;
public class Lab2_collatz {
	
	private static void collatz(int input) {
		int steps = 0;
			while(input!=1) {
					System.out.println(input);
					if(input%2==0) {//if even , half
						input/=2;
					}else {
						input = (input*3)+1;
					}
					steps++;
			}
		input=1;
		steps++;
		System.out.println(input);
		System.out.println("number of steps was " + steps);
	}
	
	public static void lab2Main() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("input an integer");
		int input = scanner.nextInt();
	
		collatz(input);
	}

//	public static void main(String args[]) {
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("input an integer");
//		int input = scanner.nextInt();
//	
//		collatz(input);
//	}
}
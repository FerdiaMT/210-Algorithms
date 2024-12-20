package labWorkNumbered;
import java.util.Random;
public class Lab10_SanteCarlo {
	public static void main(String[] args) {

		//System.out.println(random.nextInt(3)); // remember the int in here is the limit, so the value cant be 3
		double n = 1000000;
		double sucesses = 0;
		for(int i = 0; i <n; i++) {
			sucesses += rollChances();
		}
		
		double answer = (sucesses / n);
		System.out.println(answer);

	}
	
	public static double rollChances() {
		Random random = new Random();
		double santaA = 24.0*random.nextDouble(10,10.5);
		double santaD = 32.0*random.nextDouble(0.3,0.8);
		double santaT = 30.0*random.nextDouble(0.1,11);
		double santaO = 35.0*random.nextDouble(0.1,9);
		
		if(santaT>santaO && santaO>santaA && santaA> santaD) {
			//System.out.println(santaT+" "+santaO+" "+santaA+" "+santaD);
			return 1;
		}else {
			return 0;
		}
	}
}
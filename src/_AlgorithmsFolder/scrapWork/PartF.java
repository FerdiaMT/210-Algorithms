package _AlgorithmsFolder.scrapWork;

public class PartF {
	public static void main(String[] args) {
		//this might be a good time to do the prime sorter
		System.out.println("AAAAAAA");
		
		boolean primeSieve[] = new boolean[100];
		for(int i = 0; i < primeSieve.length;i++) {
			primeSieve[i]=true;
		}
		primeSieve[0]=false;
		primeSieve[1]=false;
		for(int i = 0 ; i < arr.length; i++) {
			for(int j =i+1 ; j < arr.length; j++) {
				if(j%i==0) {
					arr[j]=true;
				}
			}
		}
		
		
		
		
	}
	
	
}

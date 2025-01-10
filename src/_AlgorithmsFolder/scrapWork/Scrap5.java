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

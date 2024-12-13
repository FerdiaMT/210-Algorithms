package _AlgorithmsFolder.scrapWork;


public class Scrap1{
	public static void main(String[] args) {
		// we are now going to implement the 3 algorithms, bubble,insertion and selection, i forget insertion
		
		int[] arr = {6,22,8,1,33,90,8};
		
		//bubbleSort(arr);
		//selectionSort(arr);
		insertionSort(arr);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	private static void insertionSort(int[] arr) {
		// TODO TODO TODO i forget how TODO this one
		for(int i = 1; i < arr.length; i++) {
			int key = arr[i];
			int j = i-1;
			while((j>-1) && (arr[j]>key)) {
				arr[j+1] =arr[j];
				j--;
			}
			arr[j+1] = key;
		}
	}

	private static void selectionSort(int[] arr) {
		// TODO Auto-generated method stub
		int smallestVal = 0;
		
		for(int i = 0 ; i < arr.length-1; i++) {
			
			for(int j = i+1; j< arr.length; j++) {//selection sort, find the smallest index and then swap
				if(arr[j]<arr[smallestVal]) {
					smallestVal=j;
				}
			}
			
			int temp = arr[i];
			arr[i] = arr[smallestVal];
			arr[smallestVal] = temp;
		}
	}

	private static void bubbleSort(int[] arr) {

		for(int i = arr.length ; i >0;i--) {
			for(int j = 0; j < i-1; j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
}
package zzz._AlgorithmsFolder;

public class quickSort {
	
	public static void main(String args[]) {
		int arr[] = {1,5,3,8,6,9};
		int n = arr.length;
		
		quickSort(arr, 0 , n - 1);
		
		for(int val : arr) {
			System.out.println(val);
		}
	}
	
	public static void quickSort(int arr[], int min, int max) {
		if(min < max) {
			
			int partitionIndex = partition(arr, min, max);
			
			quickSort(arr,min, partitionIndex-1);
			quickSort(arr,partitionIndex+1,max);
		}
	}
	
	public static int partition(int arr[], int min, int max) {
		
		int pivot = arr[max];//find whats in the last value;
		int i = min-1;
		
		for(int j = min ; j <=max-1;j++) {
			if( arr[j] < pivot) { // if pivots bigger then current number
				i++;
				swap(arr,i,j);
			}//so basically i will add if the number is smaller then i
		}
		
		swap(arr, i + 1, max);
		return i+1;

	}
	
	public static void swap(int arr[], int i, int j) {
		
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		
	}
}

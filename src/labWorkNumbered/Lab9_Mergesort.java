package labWorkNumbered;

import java.util.Arrays;

public class Lab9_Mergesort {
	
//	public static void main(String[] args) {
//		int theArray[] = new int[5];
//		merge( workspace,first,second,upperBound);
//	}
//	
	static void merge(int[] arr, int lowerBound , int upperBound, int middle) {
		
		int n1 = middle - lowerBound+1;
		int n2 = upperBound-middle;
		
		int left [] = new int[n1];
		int right[] = new int[n2];
		
		for(int i = 0 ; i < n1; i++) {
			left[i] = arr[lowerBound+i];
		}
		for(int j = 0 ; j < n2; j++) {
			right[j] = arr[middle+1+j];
		}
		
		int i = 0 ; int j = 0;
		int k = lowerBound;
		
		while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
            }
            else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of L[] if any
        while (i < n1) {
            arr[k] = left[i];
            i++;
            k++;
        }

        // Copy remaining elements of R[] if any
        while (j < n2) {
            arr[k] = right[j];
            j++;
            k++;
        }
	}
	
	public static void main(String[] args) {
		int arr[] = {1,4,3,8,6,6,7,272772,727,8,956,84,73,44,2,523525,5,2522,6,78,5,93};
		System.out.println("Current array is" + Arrays.toString(arr));
		
		sort(arr, 0 , arr.length-1);
		
		System.out.println("Sorted array is" + Arrays.toString(arr));
		
	}
	
	static void sort(int arr[] , int lowerBound, int upperBound) {
		
		if(lowerBound < upperBound) { // as it should be
			
			int middle = (lowerBound + upperBound-1) / 2;
			sort(arr, lowerBound , middle);
			sort(arr, middle+1, upperBound);
			
			
			merge(arr, lowerBound, upperBound, middle);
		}
	}
}

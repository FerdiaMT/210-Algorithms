package labWorkNumbered;

import java.util.Arrays;

public class Lab9_Mergesort {
	
//	public static void main(String[] args) {
//		int theArray[] = new int[5];
//		merge( workspace,first,second,upperBound);
//	}
//	
	public void merge(long[] workSpace, int first, int second, int upperBound) {
			 int j = 0; // workspace index
			 int lowerBound = first;
			 int mid = second - 1;
			 int n = upperBound-lowerBound+1; // # of items
			 while(first <= mid && second <= upperBound) //halves not empty
			 if( theArray[first] < theArray[second] )
			 workSpace[j++] = theArray[first++];
			 else
			 workSpace[j++] = theArray[second++];
			 while(first <= mid) //check first half for remaining
			 workSpace[j++] = theArray[first++];
			 while(second <= upperBound) //check second half for remaining
			 workSpace[j++] = theArray[second++];
			 for(j=0; j<n; j++)
			 theArray[lowerBound+j] = workSpace[j]; //copy the workspace
			back
			} // end merge()
	
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

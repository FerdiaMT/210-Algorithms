package labWorkNumbered;

import java.util.Scanner;

public class Lab9_MergeSort{
	
	public static void main(String args[]) {
		
		int arr[] = takeInput();
		
		
		//int arr[] = {8,2,5,3,4,7,6,1};
		
		mergeSort(arr);
		System.out.print("[");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]);
			if(i!=arr.length-1) {System.out.print(", ");}
		}
		System.out.println("]");
	}
	
	public static void mergeSort(int[] arr) {
		
		int length = arr.length;
		if(length<=1) {//baseCase, were dividing by 2 each time, if L=1 or less then no need to divide more
			return;
		}
		
		int middle = length/2;
		int[] leftArray = new int[middle];
		int[] rightArray = new int[length-middle];
		
		int i = 0; // left array
		int j = 0; // right array
		
		for(;i<length;i++) {
			if(i < middle) {
				leftArray[i]=arr[i];
			}else {
				rightArray[j]=arr[i];
				j++;
			}
		}
		
		mergeSort(leftArray);
		mergeSort(rightArray);
		merge(leftArray,rightArray,arr);
		
	}
	
	public static void merge(int leftArray[], int rightArray[], int arr[]) {
		
		
		int leftSize = arr.length/2;
		int rightSize = arr.length - leftSize;
		int i = 0;//original array
		int l=0, r=0; // left and right
		
		while(l < leftSize && r< rightSize) {
			if(leftArray[l]<rightArray[r]) {//if l is smaller
				arr[i] = leftArray[l];
				i++;
				l++;
			}else {
				arr[i] = rightArray[r];
				i++;
				r++;	
			}
		}
		//now its uneven and theres 1 extra remaining
		while(l < leftSize) {
			arr[i] = leftArray[l];
			i++;
			l++;
		}
		
		while(r < rightSize) {
			arr[i] = rightArray[r];
			i++;
			r++;
		}
	}
	
	public static int[] takeInput() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("give length");
		int x = sc.nextInt();
		sc.nextLine();
		int arr[] = new int[x];
		System.out.println("give nums");
		for(int i =0; i < x; i++) {
			arr[i] = sc.nextInt();
			sc.nextLine();
		}
		
		return arr;
	}
}
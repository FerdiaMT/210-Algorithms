package labWorkNumbered;

import java.util.Scanner;
import java.util.Random;

public class Lab9_MergeSort{
	
public static void main(String args[]) {
		
		//int[] arr = takeInput();
		
		int[] randArr = new int[10];
		
		fillArr(randArr);
	
		
		
		mergeSort(randArr);
		
//		for(int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}
		
		for (int i = 0; i < randArr.length; i++) {
			System.out.println(randArr[i]);
		}
	}
	


	public static void mergeSort(int arr[]) {
		//recursive ,so base case is needed
		int length = arr.length;
		if(length<=1) {
			return;
		}
		
		int middle = length/2;
		int leftArr[] = new int[middle];
		int rightArr[] = new int[length-middle];
		
		for(int i = 0 ; i < length; i++) {
			if(i<middle) {
				leftArr[i] = arr[i];
			}else {
				rightArr[i-middle] = arr[i];
			}
		}
		if(length>9) {
			mergeSort(leftArr);
			mergeSort(rightArr);
		}else {
			insertionSort(leftArr);
			insertionSort(rightArr);
		}

		
		
		
		merge(leftArr,rightArr,arr);
	}
	
	public static void merge(int leftArr[],int[] rightArr,int arr[]) {
		
		int l=0,r=0,i=0;
		
		while(l<leftArr.length && r < rightArr.length) {
			if(leftArr[l] < rightArr[r]) {//1,2,3,4
				arr[i] = leftArr[l];
				i++;
				l++;
			}else {
				arr[i] = rightArr[r];  //5,6,7,8
				i++;
				r++;
			}
			
			//1,2,3,4,5,6,7()8 best case for organizing
			//1,2,3,4()5,6,7,8 worst case
		}
		
		while(l<leftArr.length) {
			arr[i] = leftArr[l];
			i++;
			l++;
		}
		
		while(r<rightArr.length) {
			arr[i] = rightArr[r];
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
	
	private static void fillArr(int[] randArr) {
		
		Random rand = new Random();
		for (int i = 0; i < randArr.length; i++) {
			randArr[i] = rand.nextInt(0,1000);
		}
	}
	
	private static void insertionSort(int[] arr) {
		// TODO TODO TODO i forget how TODO this one
		// {6,22,8,1,33,90,8}
		
		// [22], j=0,arr[j]=6 while(j>-1) and arr[j]>key
		
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
	
}
package _AlgorithmsFolder.scrapWork;

public class Scrap2 {
	public static void main(String args[]) {
		
		int[] arr = {2,44,6,77,8,9,100};
		
		mergeSort(arr);
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
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
		
		mergeSort(leftArr);
		mergeSort(rightArr);
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
}

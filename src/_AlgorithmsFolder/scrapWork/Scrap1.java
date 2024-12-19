package _AlgorithmsFolder.scrapWork;


public class Scrap1{
	public static void main(String[] args) {
		// we are now going to implement the 3 algorithms, bubble,insertion and selection, i forget insertion
		
		int[] arr = {6,22,8,1,33,90,8};
		int index;
		index = 4;
		
		if(index==1) {
			bubbleSort(arr);
		}else if(index==2) {
			selectionSort(arr);
		}else if(index==3) {
			insertionSort(arr);
		}else if(index==4) {
			mergeSort(arr);
		}

		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
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
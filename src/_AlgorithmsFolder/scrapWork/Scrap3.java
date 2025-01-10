package _AlgorithmsFolder.scrapWork;

import java.util.Iterator;

public class Scrap3 {

	public static void main(String[] args) {
		int arr[] = {1,8,6,4,9,15};
		for(int i = arr.length; i >0; i--) {
			for(int j = 0; j <i - 1; j++ ) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}

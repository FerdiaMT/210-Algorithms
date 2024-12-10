package zExamWorkQ4;

import java.util.Iterator;

// for compare to, sorting normal alphabetical is a.compareTo(b) > 0

public class Y2023_Unique_CharSort {
	// sort an array of strings by the amount of unique chars
	// if there the same, sort alphabetically
	public static void main(String[] args) {
		String inputArray[] = {"tree","paper","car","banana"};
		sorter(inputArray);
		
		for(int i = 0 ; i < inputArray.length;i++) {
			System.out.println(inputArray[i]);
		}
	}
	
	public static void sorter(String arr[]) {
		
		//selection searches through to find the smallest and puts it at the beginning
		//int counter = 0;
		//String arr2[arr.length];
		
		for(int i = 0; i < arr.length-1;i++) {
			
			int minIndex = i;
			for(int j = i+1;j<arr.length;j++) {

				if(uniqueChars(arr[minIndex]) == uniqueChars(arr[j])) {
					
					if(arr[minIndex].compareTo(arr[j])>0) {
						minIndex = j;
					}
					
				}else if (uniqueChars(arr[minIndex]) > uniqueChars(arr[j])) {
					minIndex = j;
				}	
			}
			String temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
			
		}
	}
	
	public static int uniqueChars(String input) { // nice efficient method here
		String counter = "";
		for(int i = 0 ; i < input.length(); i++) {
			char c = input.charAt(i);
			if(counter.indexOf(c) ==-1) { // if current char isnt in the string
				counter +=c;
			}
		}
		return counter.length();
	}
}

/*
for (int i = 0; i < arr.length; i++) {// go through each string
//we arte going to do selection sort, find the smallest, if same sizer as current sort alpha

String mostU = arr[i];
int indexOfU;
for(int j = i+1 ; j < arr.length;j++) {
	
	if(uniqueChars(mostU) == uniqueChars(arr[j])) {
		
		if(mostU.compareTo(arr[j])>0) {
			mostU = arr[j];
		}
		
	}else if (uniqueChars(mostU) < uniqueChars(arr[j])) {
		mostU = arr[j];
	}
}
*/
package zExamWorkQ4;

public class Y2022_asciiSum {
	public static void main(String[] args) {
		String[] arr = {"one","two","three","four","five","six","seven","eight","nine","ten"};
		//two ways of doing this off of the top of my head that would be good
		//select sort, merge sort
		selectionSort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static void selectionSort(String[] arr) {
		
		int smallestIndex = 0;
		
		for(int i = 0; i < arr.length-1;i++) {
			
			for(int j = i+1; j<arr.length;j++) {
				if(
					((arr[smallestIndex].charAt(arr[smallestIndex].length()-1) - 0)
						>
						(arr[j].charAt(arr[j].length()-1) - 0)&&asc(arr[smallestIndex])==asc(arr[j])
						) ||
				asc(arr[smallestIndex]) > asc(arr[j] ))
						{
					smallestIndex = j;
				}
			}
			String temp = arr[i];
			arr[i] = arr[smallestIndex];
			arr[smallestIndex] = temp;
			
		}
	}

	private static int asc(String string) {
		int returnVal=0;
		for (int i = 0; i < string.length(); i++) {
			char c = string.charAt(i);
			returnVal+= (c -0);
		}
		return returnVal;
	}
}

/*
Write a Java program that sorts a long list of words using a special ordering. 
The first input line is an int representing the total number of words,
followed by a word on each line. 
All the words should be sorted by the total sum of all the ASCII values 
of each character in the word. 
The words that are outputted first should be those with the lowest ASCII sum. 
For example, the ASCII value for 'a' is 97, while that for 'n' is 110, so the word "an" 
has an ASCII sum of 207. 
Because this total is relatively low, “an” should be one of the first words to be outputted.   
Words that have the exact same ASCII sum (e.g., "dog" and "god") should be sorted in REVERSE 
alphabetical order 
(so "god" would be outputted before "dog" since it's nearer the end of the dictionary). 
State the complexity of your program using Big O notation. 
The more efficient it is, the better. Include comments that explain 
your code clearly.
*/

//if the asciss are the same then sort in reverse alpha
package labWorkNumbered;
import java.util.Scanner;
public class Lab4_SortingWords {

//	public static void lab4Main() {
//		String arr[] = takeInput(); // fill up the array with inputs
//		
//		stringOrganizer(arr);//sort the array by length and alphabetical
//		
//		printArray(arr);//print the sorted array
//	}
	
	public static void main(String args[]) {
		
		String arr[] = takeInput(); // fill up the array with inputs
		
		stringOrganizer(arr);//sort the array by length and alphabetical
		
		printArray(arr);//print the sorted array
		
	}
	
	

	private static String[] stringOrganizer(String arr[]) {

		for(int i = 0 ; i <= arr.length-1 ; i++) { // say i is on index 3, j will be 4, 5,6 and 7
			for(int j = i+1 ; j < arr.length;j++) {
				
				if( arr[i].length() > arr[j].length()) { // if A is bigger then B , we want B to be very left
					swapValues(arr,i,j);
				}
				
				else if(arr[i].length() == arr[j].length()) { // if they are the same length, check who should be first alphabetically
					sortAlphabetical(arr,i,j);
				}
			}
		}
		return(arr);
	}
	
	private static String[] swapValues(String[] arr, int i, int j) {
		
		String buffer = arr[i];
		arr[i] = arr[j];
		arr[j] = buffer;
		return(arr);
	}
	
	public static String[] sortAlphabetical(String[] arr, int i, int j) {
		String A = arr[i].toLowerCase();
		String B = arr[j].toLowerCase();
		
		for(int k=0; k <arr[i].length();k++) {//go through the entire string
			int asciiValueA = A.charAt(k);
			int asciiValueB = B.charAt(k);
			
			if(asciiValueA > asciiValueB) {
				//System.out.println("Sucessful swap: "+k+" with: "+arr[i]+" and "+arr[j]+" Since " +asciiValueA +" is bigger than"+ asciiValueB);
				swapValues(arr,i,j);
				break;
			} else if (asciiValueA < asciiValueB) {break;}
		}
		return(arr);
	}

/*=================================================================================/
 * 
 * 					 THIS IS JUST INPUT STUFF, IGNORE FOR SORTING
 * 
/=================================================================================*/

	private static String[] takeInput() {
		Scanner sc = new Scanner(System.in);
		int nLength = sc.nextInt();
		sc.nextLine();//needed since java takes enter key as string 1 otherwise
		
		String arr[] = new String[nLength];
		for(int i = 0; i <nLength; i++) {
			arr[i] = sc.nextLine();
		}
		return arr;
	}
	
	private static void printArray(String[] arr) {
		for(int i = 0; i <arr.length; i++) {
			System.out.println(arr[i]);
		}
	}



}

//GOAL OF PROGRAM
//1: SORT A LIST OF WORDS BY LENGTH OF THE WORD , SHORT WORDS COMING FIRST
//2: IF WORD IS THE SAME LENGTH , SORT THEM BY ALPHABETICAL ORDER
//MUST CREATE ONE METHOD THAT ISNT MAIN METHOD 

//SO, SORT WORDS BY LENGTH (BUBBLE SORT FOR CONVENIENCE)
//RUN THROUGH AGAIN THIS TIME IF CHECKING IF N ==N+1.LENGTH , SORT ALPHABETICAL , DO THIS N-1 TIMES

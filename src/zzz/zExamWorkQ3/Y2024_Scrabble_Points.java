package zExamWorkQ3;

public class Y2024_Scrabble_Points { // this looks like a hashmap question
	
	public static void main(String[] args) {
		
		String arr[] = new String[3];
		arr[0]="zzzzzzzzzz";
		arr[1]="hello";
		arr[2]="World";
		
		
//		if(pointValue(arr[i]) > pointValue[arr[j]]) {
//			swap(arr,i,j);
//		}
		
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				
				if(pointValue(arr[i]) > pointValue(arr[j])) {// if left is worth more points, swap
					swap(arr,i,j);
				}else if (pointValue(arr[i]) == pointValue(arr[j])){//if same ,sort alphabetically
					sortAlphabetical(arr,i,j);
				}
			}
		}
		
		for (int i = 0; i < 3; i++) {
			System.out.println(arr[i]);
		}
		
		
	}
	
	
	public static int pointValue(String string) {
		
		string = string.toLowerCase();
		int points = 0;
		
		for(int i = 0; i < string.length();i++) {
			char c = string.charAt(i);
			if(c=='q' || c=='z') {
				points+=10;
			}else if(c=='j' || c=='x'){
				points+=8;
			}else if(c=='k'){
				points+=5;
			}else if(c=='f' || c=='h'|| c=='v' || c=='w' || c=='y'){
				points+=4;
			}else if(c=='b' || c=='c' || c=='m' || c=='p'){
				points+=3;
			}else if(c=='d' || c=='g'){
				points+=2;
			}else {
				points+=1;
			}
		}
		
		return points;
	}
	
	public static void swap(String[] arr, int i, int j) {
		String buffer = arr[i];
		arr[i]=arr[j];
		arr[j]=buffer;
	}
	
	public static void sortAlphabetical(String[] arr, int i, int j) {
		
		String a = arr[i].toLowerCase();
		String b = arr[j].toLowerCase();
		
		int minLength = Math.min(a.length(), b.length());
		
		for (int k = 0; k < minLength; k++) {
			int asciiValueA = a.charAt(k);
			int asciiValueB = b.charAt(k);
			
			if(asciiValueA > asciiValueB) {
				swap(arr,i,j);
			}

		}
		
	}
	
	
//		2 points – D G
//		3 points – B C M P
//		4 points – F H V W Y
//		5 points – K
//		8 points – J X
//		10 points – Q Z
		
//	Write a Java method that takes in an array of Strings and sorts
//	them by how many points they would earn in the game of
//	Scrabble, with the lowest scoring words coming first. If two
//	words have the same Scrabble score, then they should be
//	sorted in alphabetical order. Letters in Scrabble earn the
//	following points:
//	[25 marks]
//	1 point – A E I O U L N S T R

	
}

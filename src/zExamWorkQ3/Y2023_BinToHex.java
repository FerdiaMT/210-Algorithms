package zExamWorkQ3;

public class Y2023_BinToHex {
	public static void main(String[] args) {
		String binary = "1101";
		int counter = 0;
		int multi = 1;
		for(int i = binary.length()-1; i>=0; i--) {
			char c = binary.charAt(i);
			if(c == '1') {
				counter+=multi;
			}
			multi*=2;
		}
		
		if(counter <10) {
			System.out.println(counter);
		}else {
			switch(counter) {
				
				case 10:
				System.out.println("A");
				break;
				
				case 11:
				System.out.println("B");
				break;
				
				case 12:
				System.out.println("C");
				break;
				
				case 13:
				System.out.println("D");
				break;
				
				case 14:
				System.out.println("E");
				break;
				
				case 15:
				System.out.println("F");
				break;
				
			}
		}
		
	}
}

/*

Write a Java program which takes in a String representing a
number in binary format, and prints out that number in base 16
(hexadecimal), where ‘a’ represents ten, ‘b’ represents eleven, ‘c’
represents twelve etc. Your program should carry out the required
mathematical processing and not rely on any base conversion
libraries.
Sample input
1101
Sample output
d

*/
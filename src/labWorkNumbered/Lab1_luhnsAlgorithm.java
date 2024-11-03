package labWorkNumbered;
import java.util.Scanner;
 
class Lab1_luhnsAlgorithm {

    static int luhnCheck(String input){     
        int finalSum = 0;
        boolean second = false;
        for (int i = input.length() - 1; i >= 0; i--) {
            int currentInt = input.charAt(i) - '0'; // this turns it into an int
            if (second == true) { //DOUBLE
                currentInt*=2;
                if(currentInt>=10) { // if e.g 16 , 1+6=7
                	finalSum += (1+  (currentInt %10) );
                }else {
                	finalSum += currentInt;
                }
            }else if(second ==false) {// DONT DOUBLE
            	finalSum += currentInt;
            }
            
            if(second==true) {
            	second=false;
            }else {
            	second=true;
            }
        }
        return (finalSum);
    }
    
    public static void lab1Main(){
   	Scanner sc = new Scanner(System.in);
   	String input = sc.nextLine();
   	sc.close();
       if ((luhnCheck(input)%10) == 0 && input.length()>=4 && input.length() <=30){
           System.out.println("VALID");
       }
       else {
           System.out.println("NOT VALID");
       }
   }
    
    
//    public static void main (String[] args){
//   	Scanner sc = new Scanner(System.in);
//   	String input = sc.nextLine();
//   	sc.close();
//       if ((luhnCheck(input)%10) == 0 && input.length()>=4 && input.length() <=30){
//           System.out.println("VALID");
//       }
//       else {
//           System.out.println("NOT VALID");
//       }
//   }
    
}
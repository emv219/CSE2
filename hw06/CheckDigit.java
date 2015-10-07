//Evan Vail
//CSE2 
import java.util.Scanner; //import Scanner code for user input

public class CheckDigit{  
public static void main (String[]args){  //method for all java programs
    
    Scanner myScanner = new Scanner(System.in);  //define scanner for user input
    System.out.println("enter the first digit of the ID number");
    int digit1 = myScanner.nextInt();
     System.out.println("enter the second digit of the ID number");
    int digit2 = myScanner.nextInt();
     System.out.println("enter the third digit of the ID number");
    int digit3 = myScanner.nextInt();
     System.out.println("enter the fourth digit of the ID number");
    int digit4 = myScanner.nextInt();
     System.out.println("enter the fifth digit of the ID number");
    int digit5 = myScanner.nextInt();
     System.out.println("enter the sixth digit of the ID number");
    int digit6 = myScanner.nextInt();
     System.out.println("enter the seventh digit of the ID number");
    int digit7 = myScanner.nextInt();
     System.out.println("enter the eigth digit of the ID number");
    int digit8 = myScanner.nextInt();
     System.out.println("enter the ninth digit of the ID number");
    int digit9 = myScanner.nextInt();
     System.out.println("enter the tenth digit of the ID number");
    int digit10 = myScanner.nextInt();
    
    
   for(int i=10; i>0; i--){
        if(9<i&&i<11){
             digit1 = digit1*10;
        }
        if(8<i&&i<10){
            digit2= digit2*9;
        }
        if(7<i&&i<9){
            digit3= digit3*8;
        }
        if(6<i&&i<8){
            digit4 = digit4*7;
        }
        if(5<i&&i<7){
             digit5 = digit5*6;
        }
        if(4<i&&i<6){
             digit6 = digit6*5;
        }
        if(3<i&&i<5){
            digit7= digit7*4;
        }
        if(2<i&&i<4){
            digit8=digit8*3;
        }
        if(1<i&&i<3){
             digit9 = digit9*2;
        }
   }
  
  int isbnSum = digit1 + digit2 +digit3 +digit4 + digit5 +digit6 +digit7 + digit8 +digit9+ digit10;
  double isbnCheck = isbnSum%11;
  char X = 10;
  boolean aww = isbnCheck != digit10;
  if (aww = false){
      System.out.println("This bardcode is valid!");
  }
  if(aww=true && isbnCheck < 10){
      System.out.println("The correct ISBN number would be " + isbnCheck);
  }
   else{
      System.out.println("the correct ISBN number is X");
}
}
}
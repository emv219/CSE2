//evan Vail
import java.util.Scanner;
public class EncryptedX{
    public static void main (String[] args){
    Scanner myScanner = new Scanner(System.in);
    
System.out.println("Please choose an integer from 1-100");
int input = myScanner.nextInt();
double root = Math.sqrt(input);
if(input<0 || input >100 ){
    System.out.println("That is not a valid input");
    System.out.println("Please choose an integer from 1-100");
}
if(0<input&&input<101){
    for(int i=0; i<input; i++){
          System.out.print("*");
          for(i==root){
            System.out.println("");
            i=0;
          
          }
        }
            for(int j=0; j<input;j++){
                System.out.print("*");
            }




}
    
}
}
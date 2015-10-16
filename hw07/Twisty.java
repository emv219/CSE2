//Evan Vail 
//CSE2
import java.util.Scanner;  //call the scanner source code for user input
public class Twisty{ //class 
    public static void main (String[] args){  //main method of all java programs
        Scanner input = new Scanner(System.in);  //define scanner as a variable for future use
        System.out.println("Input your desired length");  //prompt user for length
            while (!input.hasNextInt()) {                 //check to see if the input was an integer
                System.out.println("Please only enter integers");  //ask user for another input if first is rejected
                input.next(); 
            }
            int length = input.nextInt(); 
            while(length>80){  //number can not be greater than 80
                System.out.println("Please only enter integers less than 80");  //ask user for another input
                length = input.nextInt();
            }
            System.out.println("Input your desired width");  //do the same for width as length
            while (!input.hasNextInt()){
                System.out.println("Please only enter integers");
                input.next(); 
            }
            int width = input.nextInt();
            while (width>length){
                System.out.println("Error: please input a width that is less than the length");
                width = input.nextInt();
            }
            
            for (int i=0; i<width; i++)  //for loop to determine how many lines there will be from the width input
            {
                for(int j=0;j<length; j++)  //for loop to determine what will be on each line
                {
                    if(i==j%width){     //creates pattern on each line 
                        if((int)(j/width)%2==0){
                            System.out.print("#");
                        }
                        else{
                            System.out.print("\\");
                            }
                    }
                    else if((j%width) == width-i-1)  //creates the pattern for if the width is odd
                    {
                        if((int)(j/width)%2==0)
                        {
                            System.out.print("/");
                        }
                        else{
                            System.out.print("#");
                            }
                    }
                    else {
                        System.out.print(" ");  //prints the spaces between characters
                         } 
                }
            
                System.out.println("");  //start a new line for every increment of the width
            } 
 
    }//end of main method
}//end of class
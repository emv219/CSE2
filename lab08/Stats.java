//evan vail 
//CSE2
import java.util.Scanner;  //call the scanner source code for user input
public class Stats{ //class 
    public static void main (String[] args){  //main method of all java programs
     Scanner input = new Scanner(System.in);  //define scanner as a variable for future use
        System.out.println("Please enter the smallest number");  //prompt user for the first number
        double firstNum = input.nextDouble();
        System.out.println("Please enter the second number");
        double secNum = input.nextDouble();
             while (secNum<firstNum)
             {                
                System.out.println("Please enter the numbers from smallest to largest");  //ask user for another input if first is rejected
                  
             
             secNum = input.nextDouble();
             }
             System.out.println("Please enter the third number");
        double thirdNum = input.nextDouble();
             while (thirdNum<secNum)
             {                
                System.out.println("Please enter the numbers from smallest to largest");  //ask user for another input if first is rejected
                  
             
             thirdNum = input.nextDouble();
             }
             System.out.println("Please enter the fourth number");
        double fourthNum = input.nextDouble();
             while (fourthNum<thirdNum)
             {                
                System.out.println("Please enter the numbers from smallest to largest");  //ask user for another input if first is rejected
                  
             
             fourthNum = input.nextDouble();
             }
             System.out.println("Please enter the last number");
        double lastNum = input.nextDouble();
             while (lastNum<fourthNum)
             {                
                System.out.println("Please enter the numbers from smallest to largest");  //ask user for another input if first is rejected
                  
             
             lastNum = input.nextDouble();
             }
             double mean = mean(firstNum, secNum ,thirdNum, fourthNum, lastNum);
             System.out.println("The mean is " + mean);
             double median = median(firstNum, secNum ,thirdNum, fourthNum, lastNum);
             System.out.println("The median is " + median);
    }
    public static double mean(double firstNum, double secNum ,double thirdNum, double fourthNum, double lastNum)
    {
             return(firstNum + secNum +  thirdNum + fourthNum + lastNum) / 5;
    }
    public static double median(double firstNum, double secNum ,double thirdNum, double fourthNum, double lastNum)
    {
            return(thirdNum);
        }
     
     
     
             
    }   
   
   
   
   
    
